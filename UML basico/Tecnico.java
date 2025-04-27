public class Tecnico {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, String especialidad) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
