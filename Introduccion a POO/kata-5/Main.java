//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Apollo 11", 50);
        nave1.avanzar(60);
        nave1.recargarCombustible(40);
        nave1.avanzar(60);
        nave1.mostrarEstado();
    }
}