//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Funes", "Edgardo", "Programacion 2", 9.5);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(5.2);
        estudiante1.subirCalificacion(4.8);
    }
}