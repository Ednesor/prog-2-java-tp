public class Gallina {
    private static int contador = 0;
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina() {
    }

    public Gallina(int edad, int huevosPuestos) {
        this.idGallina = contador++;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(){
        this.huevosPuestos += 1;
        System.out.println("La gallina ha puesto un huevo");
    }
    public void envejecer(){
        this.edad += 1;
        System.out.println("La gallina ha envejecido un año");
    }
    public void mostrarEstado(){
        System.out.println("Gallina: "+this.idGallina+"\n" +
                "Edad: "+this.edad+"\n" +
                "Huevos puestos: "+this.huevosPuestos+"\n");
    }
}
