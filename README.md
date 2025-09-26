<h1 align="center"> 📘 Taller de Patrones de Diseño </h1>

### Integrantes
- Sofía Vargas Garzón
- Oscar David Vergara
- Juan David Moreno

## Diagramas de clases

### Ejercicio 1

### Ejercicio 2
Patrón Estructural - Bridge (Puente)
¿Por qué Bridge?
R// Separa la abstracción (tipos de notificación) de su implementación (plataformas)

classDiagram
    %% Abstraction Hierarchy
    class Notificacion {
        <<abstract>>
        -Plataforma implementador
        -String titulo
        -String contenido
        +Notificacion(implementador, titulo, contenido)
        +mostrar()* void
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

    Abstraction Hierarchy          Implementation Hierarchy
┌─────────────────┐           ┌──────────────────────┐
│   Notificacion  │◆─────────▶│     Plataforma       │
│   (abstract)    │           │    (interface)       │
└─────────────────┘           └──────────────────────┘
         │                              │
    ┌────┼────┐                    ┌────┼────┐
    │    │    │                    │    │    │
    ▼    ▼    ▼                    ▼    ▼    ▼
┌─────┐┌────┐┌─────┐        ┌──────┐┌──────┐┌──────┐
│Msj  ││Alrt││Warn │        │ Web  ││Movil ││Escrt │
└─────┘└────┘└─────┘        └──────┘└──────┘└──────┘

 Estructura del Ejercicio
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

Ejecución
bash# Compilar
javac *.java

# Ejecutar
java SistemaNotificaciones

### Ejercicio 3