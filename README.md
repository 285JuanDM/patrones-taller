# 📘 Taller de Patrones de Diseño

### Integrantes
- Sofía Vargas Garzón
- Oscar David Vergara
- Juan David Moreno

## Ejercicio 1

**Tipo de patrón escogido:** Creacional

**Patrón de diseño escogido:** Build

Se escogió el patrón Builder porque permite crear un objeto complejo como un automóvil de forma clara y flexible, evitando constructores con muchos parámetros. De esta manera, el usuario puede personalizar solo las opciones que desee sin necesidad de usar todas, mejorando la legibilidad y manteniendo el objeto final inmutable.

### Diagrama de clases

```mermaid
classDiagram
    class Automovil {
        - motor : String
        - color : String
        - llantas : String
        - sonido : String
        - interiores : String
        - techoSolar : boolean
        - gps : boolean
        + getMotor() String
        + getColor() String
        + getLlantas() String
        + ...
    }

    class AutomovilBuilder {
        - motor : String
        - color : String
        - llantas : String
        - sonido : String
        - interiores : String
        - techoSolar : boolean
        - gps : boolean
        + setMotor(String) AutomovilBuilder
        + setColor(String) AutomovilBuilder
        + setLlantas(String) AutomovilBuilder
        + setSonido(String) AutomovilBuilder
        + setInteriores(String) AutomovilBuilder
        + setTechoSolar(boolean) AutomovilBuilder
        + setGps(boolean) AutomovilBuilder
        + build() Automovil
    }

    class Cliente {
        + main()
    }

    AutomovilBuilder --> Automovil
    Cliente --> AutomovilBuilder : "usa"
```

## Ejercicio 2

**Patrón Estructural - Bridge (Puente)**

**¿Por qué Bridge?**
Separa la abstracción (tipos de notificación) de su implementación (plataformas)

```mermaid
classDiagram
    %% Abstraction Hierarchy
    class Notificacion {
        <<abstract>>
        -Plataforma implementador
        -String titulo
        -String contenido
        +Notificacion(implementador, titulo, contenido)
        +mostrar() void
        +cambiarPlataforma(nuevaPlataforma) void
    }
    
    class NotificacionMensaje {
        +mostrar() void
        -enviarRespuesta() void
    }
    
    class NotificacionAlerta {
        +mostrar() void
        -configurarSonido() void
    }
    
    class NotificacionAdvertencia {
        +mostrar() void
        -mostrarIconoWarning() void
    }
    
    class NotificacionConfirmacion {
        +mostrar() void
        -mostrarBotonesAccion() void
    }
    
    %% Implementation Hierarchy
    class Plataforma {
        <<interface>>
        +mostrarNotificacion(titulo, contenido, tipo) void
        +reproducirSonido() void
    }
    
    class PlataformaWeb {
        +mostrarNotificacion(titulo, contenido, tipo) void
        +reproducirSonido() void
    }
    
    class PlataformaMovil {
        +mostrarNotificacion(titulo, contenido, tipo) void
        +reproducirSonido() void
    }
    
    class PlataformaEscritorio {
        +mostrarNotificacion(titulo, contenido, tipo) void
        +reproducirSonido() void
    }
    
    %% Relationships
    Notificacion --> Plataforma : implementador
    NotificacionMensaje --|> Notificacion
    NotificacionAlerta --|> Notificacion
    NotificacionAdvertencia --|> Notificacion
    NotificacionConfirmacion --|> Notificacion
    
    PlataformaWeb ..|> Plataforma
    PlataformaMovil ..|> Plataforma
    PlataformaEscritorio ..|> Plataforma
```

#### Estructura del Patrón Bridge

```
Abstraction Hierarchy          Implementation Hierarchy
┌─────────────────┐           ┌──────────────────────┐
│   Notificacion  │◇─────────▶│     Plataforma       │
│   (abstract)    │           │    (interface)       │
└─────────────────┘           └──────────────────────┘
         │                              │
    ┌────┼────┐                    ┌────┼────┐
    │    │    │                    │    │    │
    ▼    ▼    ▼                    ▼    ▼    ▼
┌─────┐┌────┐┌─────┐        ┌──────┐┌──────┐┌──────┐
│Msj  ││Alrt││Warn │        │ Web  ││Movil ││Escrt │
└─────┘└────┘└─────┘        └──────┘└──────┘└──────┘
```

#### Estructura del Proyecto

```
📦 Ejercicio2/
├── 📄 Plataforma.java              # Interface base
├── 📄 PlataformaWeb.java           # Implementación Web
├── 📄 PlataformaMovil.java         # Implementación Móvil  
├── 📄 PlataformaEscritorio.java    # Implementación Escritorio
├── 📄 Notificacion.java            # Clase abstracta base
├── 📄 NotificacionMensaje.java     # Tipo Mensaje
├── 📄 NotificacionAlerta.java      # Tipo Alerta
├── 📄 NotificacionAdvertencia.java # Tipo Advertencia
├── 📄 NotificacionConfirmacion.java# Tipo Confirmación
└── 📄 SistemaNotificaciones.java   # Clase principal
```

#### Ejecución

```bash
# Compilar
javac *.java

# Ejecutar
java SistemaNotificaciones
```


### Ejercicio 3
**Tipo de Patrón escogido:** de Comportamiento
**Patrón de diseño escogido:** Mediator

Se escogió este patrón porque permite el **desacoplamiento** , dado que, los usuarios ya no interactúan directamente entre sí, sino a través de un mediador. Este bajo acoplamiento no solo facilita la **mantenibilidad** del sistema al centralizar la comunicación, sino que también favorece la **escalabilidad**, porque si se agrega o elimina un usuario, el cambio no afectaría a los demás.

# Diagrama de Clases

```mermaid
classDiagram
    class MediatorI {
        <<abstract>>
        +show_message(user: UserI, message: str)* void
    }
    
    class ChatMediatorImpl {
        -users: List~UserI~
        +__init__()
        +add_user(user: UserI) void
        +show_message(user: UserI, message: str) void
    }
    
    class UserI {
        <<abstract>>
        #name: str
        #mediator: MediatorI
        +__init__(name: str, mediator: MediatorI)
        +send(message: str)* void
    }
    
    class ChatUser {
        +send(message: str) void
    }
    
    %% Relaciones
    MediatorI <|-- ChatMediatorImpl : implements
    UserI <|-- ChatUser : implements
    ChatMediatorImpl --> UserI : manages
    UserI --> MediatorI : uses
    ChatUser --> MediatorI : communicates through
```