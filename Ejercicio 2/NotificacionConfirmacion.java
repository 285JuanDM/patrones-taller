/**
 * NotificacionConfirmacion - Refined Abstraction del patrón Bridge
 * Implementación específica para notificaciones de confirmación
 */
public class NotificacionConfirmacion extends Notificacion {

    public NotificacionConfirmacion(Plataforma implementador, String titulo, String contenido) {
        super(implementador, titulo, contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("\nPROCESANDO NOTIFICACIÓN DE CONFIRMACIÓN");
        implementador.mostrarNotificacion(titulo, contenido, "CONFIRMACIÓN");
        mostrarBotonesAccion();
    }


    private void mostrarBotonesAccion() {
        System.out.println(" Botones de acción: [Aceptar] [Cancelar]");
    }
}