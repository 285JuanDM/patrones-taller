
public class NotificacionAlerta extends Notificacion {

    public NotificacionAlerta(Plataforma implementador, String titulo, String contenido) {
        super(implementador, titulo, contenido);
    }

    @Override
    public void mostrar() {
        System.out.println("\nPROCESANDO NOTIFICACIÓN DE ALERTA");
        configurarSonido();
        implementador.mostrarNotificacion(titulo, contenido, "ALERTA");
        implementador.reproducirSonido();
    }


    private void configurarSonido() {
        System.out.println("🔊 Configurando sonido de alta prioridad para alerta");
    }
}