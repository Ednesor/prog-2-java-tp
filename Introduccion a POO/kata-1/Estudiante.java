public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Apellido: " + this.apellido + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Curso: " + this.curso + "\n" +
                "Calificacion: " + this.calificacion + "\n");
    }

    public void subirCalificacion(double puntos) {
        if (this.calificacion + puntos > 10) {
            System.out.println("ERROR: La nota final supera los 10 puntos");
        } else {
            this.calificacion += puntos;
            System.out.println("Nota modificada: " + this.calificacion);
        }
    }

    public void bajarCalificacion(double puntos) {
        if (this.calificacion - puntos < 0) {
            System.out.println("ERROR: La nota final es inferior a 0");
        } else {
            this.calificacion -= puntos;
            System.out.println("Nota modificada: " + this.calificacion);
        }
    }
}
