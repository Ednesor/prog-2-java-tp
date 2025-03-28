import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue();
        System.out.println("Se ingresó: " + nuevoAnio);
        if (nuevoAnio < 1900 || nuevoAnio > anioActual) {
            System.out.println("Error: No se puede modificar si el año es menor a 1900 o mayor al año actual.");
        } else {
            this.anioPublicacion = nuevoAnio;
            System.out.println("Modificacion exitosa, nuevo año: " + this.anioPublicacion);
        }
    }
}
