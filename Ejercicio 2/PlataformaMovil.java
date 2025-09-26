
public class PlataformaMovil implements Plataforma {
    
    @Override
    public void mostrarNotificacion(String titulo, String contenido, String tipo) {
        System.out.println("=== NOTIFICACIÓN MÓVIL ===");
        System.out.println("Push notification:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Apareciendo en barra de notificaciones");
        System.out.println("Badge en icono de app");
        System.out.println("===========================");
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Vibración del dispositivo + sonido: 'notification.mp3'");
    }
}