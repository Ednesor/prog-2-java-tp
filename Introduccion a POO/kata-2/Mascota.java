public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+"\n" +
                "Espcecie: "+this.especie+"\n" +
                "Edad: "+this.edad+"\n");
    }

    public void cumplirAnios(){
        this.edad += 1;
        System.out.println("Feliz cumpleaños, edad actual: "+this.edad);
    }
}
