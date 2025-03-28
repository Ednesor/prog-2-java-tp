//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(2, 1);
        Gallina gallina2 = new Gallina(1, 4);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();
        gallina2.envejecer();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}