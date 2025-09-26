
public interface Plataforma {
    /**
     * Muestra la notificación en la plataforma específica
     * @param titulo El título de la notificación
     * @param contenido El contenido de la notificación  
     * @param tipo El tipo de notificación (MENSAJE, ALERTA, etc.)
     */
    void mostrarNotificacion(String titulo, String contenido, String tipo);
    
    void reproducirSonido();
}