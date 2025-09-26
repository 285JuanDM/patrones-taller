
public class SistemaNotificaciones {
    
    public static void main(String[] args) {
        System.out.println("DEMOSTRACIÓN DEL PATRÓN BRIDGE");
        
 
        Plataforma web = new PlataformaWeb();
        Plataforma movil = new PlataformaMovil();
        Plataforma escritorio = new PlataformaEscritorio();

        System.out.println("\n1. MENSAJE EN PLATAFORMA WEB:");
        Notificacion mensaje1 = new NotificacionMensaje(web, "Nuevo mensaje", "Tienes un mensaje de Juan");
        mensaje1.mostrar();

        System.out.println("\n2. ALERTA EN PLATAFORMA MÓVIL:");
        Notificacion alerta1 = new NotificacionAlerta(movil, "Batería baja", "Tu batería está al 10%");
        alerta1.mostrar();

        System.out.println("\n3. ADVERTENCIA EN ESCRITORIO:");
        Notificacion advertencia1 = new NotificacionAdvertencia(escritorio, "Actualización disponible", "Hay una actualización crítica disponible");
        advertencia1.mostrar();

        System.out.println("\n4. CONFIRMACIÓN EN WEB:");
        Notificacion confirmacion1 = new NotificacionConfirmacion(web, "Eliminar archivo", "¿Estás seguro de eliminar este archivo?");
        confirmacion1.mostrar();

        System.out.println("\n🔄 DEMOSTRANDO FLEXIBILIDAD:");
        System.out.println("Cambiando plataforma de la alerta de móvil a web...");
        alerta1.cambiarPlataforma(web);
        alerta1.mostrar();

        System.out.println("\nESCALABILIDAD:");
        System.out.println("Agregando nueva plataforma SmartWatch...");
        
        Plataforma smartwatch = new Plataforma() {
            @Override
            public void mostrarNotificacion(String titulo, String contenido, String tipo) {
                System.out.println("=== NOTIFICACIÓN SMARTWATCH ===");
                System.out.println(" En pantalla pequeña:");
                System.out.println(tipo + ": " + titulo);
                System.out.println("Luz LED parpadeando");
                System.out.println("================================");
            }

            @Override
            public void reproducirSonido() {
                System.out.println("Vibración suave en muñeca");
            }
        };

        System.out.println("\n5. MENSAJE EN SMARTWATCH (NUEVA PLATAFORMA):");
        Notificacion mensajeWatch = new NotificacionMensaje(smartwatch, "Llamada perdida", "Llamada de María");
        mensajeWatch.mostrar();
    }


}