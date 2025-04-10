public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;

    public Empleado() {
        totalEmpleados+=1;
    }

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados+=1;
    }

    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados+=1;
    }
    public void actualizarSalario(int porcentajeAumento){
        this.salario *= (((double) porcentajeAumento / 100) + 1);
    }
    public void actualizarSalario(double cantidadAumentar){
        this.salario += cantidadAumentar;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
