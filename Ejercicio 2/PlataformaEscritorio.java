
public class PlataformaEscritorio implements Plataforma {
    
    @Override
    public void mostrarNotificacion(String titulo, String contenido, String tipo) {
        System.out.println("=== NOTIFICACIÓN ESCRITORIO ===");
        System.out.println("Sistema operativo:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Ventana emergente en esquina inferior derecha");
        System.out.println("Duración: 5 segundos");
        System.out.println("================================");
    }

    @Override
    public void reproducirSonido() {
        System.out.println("Sonido del sistema: 'Windows_Notify.wav'");
    }
}