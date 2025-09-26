/**
 * NotificacionAdvertencia - Refined Abstraction del patrón Bridge
 * Implementación específica para notificaciones de advertencia
 */
public class NotificacionAdvertencia extends Notificacion {

    public NotificacionAdvertencia(Plataforma implementador, String titulo, String contenido) {
        super(implementador, titulo, contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("\nPROCESANDO NOTIFICACIÓN DE ADVERTENCIA");
        mostrarIconoWarning();
        implementador.mostrarNotificacion(titulo, contenido, "ADVERTENCIA");
        implementador.reproducirSonido();
    }


    private void mostrarIconoWarning() {
        System.out.println("Mostrando icono de advertencia prominente");
    }
}