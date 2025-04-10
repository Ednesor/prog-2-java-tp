//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Juan", "Juarez", 200000.00);
        Empleado e2 = new Empleado(1, "Pedro", "Perez", 100000.00);

        e1.actualizarSalario(20);
        e2.actualizarSalario(20000.00);

        System.out.println(e1.toString());
        System.out.println(e2);

        System.out.println(Empleado.mostrarTotalEmpleados());
    }
}