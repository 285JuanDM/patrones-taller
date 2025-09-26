
public class PlataformaWeb implements Plataforma {
    
    @Override
    public void mostrarNotificacion(String titulo, String contenido, String tipo) {
        System.out.println("=== NOTIFICACIÓN WEB ===");
        System.out.println("Mostrando en navegador:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Toast notification apareciendo en esquina superior derecha");
        System.out.println("========================");
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Reproduciendo sonido de notificación web: 'ding.wav'");
    }
}