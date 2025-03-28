public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar(){
        if(this.combustible < 10){
            System.out.println("No tienes suficiente combustible para despegar");
        }else{
            this.combustible -= 10;
            System.out.println("Se ha logrado despegar");
        }
    }
    public void avanzar(int distancia){
        if(this.combustible - distancia >= 0){
            System.out.println("Avanzo "+distancia+" unidades de distancia");
            this.combustible -= distancia;
        }else{
            System.out.println("No hay combustible suficiente para avanzar!!!");
        }
    }
    public void recargarCombustible(int cantidad){
        if (cantidad + this.combustible > 100){
            System.out.println("Solo podemos cargar 100 unidades de combustible!!!");
            this.combustible += cantidad;
            System.out.println("Se ha cargado el combustible, tanque lleno");
        }else{
            this.combustible += cantidad;
            System.out.println("Se ha cargado combustible solicitado");
        }
    }
    public void mostrarEstado(){
        System.out.println("Nombre: "+this.nombre+"\n" +
                "Combustible: "+this.combustible);
    }
}
