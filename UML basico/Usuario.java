public class Usuario {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String email;

    public Usuario() {
    }

    public Usuario(String nombre, String email) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
