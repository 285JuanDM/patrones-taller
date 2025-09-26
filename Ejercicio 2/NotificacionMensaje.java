
public class NotificacionMensaje extends Notificacion {

    public NotificacionMensaje(Plataforma implementador, String titulo, String contenido) {
        super(implementador, titulo, contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("\nPROCESANDO NOTIFICACIÓN DE MENSAJE");
        implementador.mostrarNotificacion(titulo, contenido, "MENSAJE");
        implementador.reproducirSonido();
        enviarRespuesta();
    }

    /**
     * Funcionalidad específica de las notificaciones de mensaje
     * Permite responder rápidamente al mensaje
     */
    private void enviarRespuesta() {
        System.out.println("Opción de respuesta rápida habilitada");
    }
}