
public abstract class Notificacion {
    protected Plataforma implementador;
    protected String titulo;
    protected String contenido;

    /**
     * Constructor que establece la plataforma y datos de la notificación
     * @param implementador La plataforma donde se mostrará la notificación
     * @param titulo El título de la notificación
     * @param contenido El contenido de la notificación
     */
    public Notificacion(Plataforma implementador, String titulo, String contenido) {
        this.implementador = implementador;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases
     * Define cómo se muestra cada tipo específico de notificación
     */
    public abstract void mostrar();

    /**
     * Permite cambiar la plataforma dinámicamente en tiempo de ejecución
     * @param nuevaPlataforma La nueva plataforma a utilizar
     */
    public void cambiarPlataforma(Plataforma nuevaPlataforma) {
        this.implementador = nuevaPlataforma;
        System.out.println("✅ Plataforma cambiada dinámicamente");
    }

    // Getters para acceder a los datos
    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}