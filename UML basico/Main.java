//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Kata 1
        TicketSoporte ticket1 = new TicketSoporte("No se que paso en mi pc");
        ticket1.mostrarDetalle();

        ticket1.cerrarTicket();
        ticket1.mostrarDetalle();

        //Kata 2
        Usuario usuario1 = new Usuario("Edgardo", "edgardo@mail.com.ar");
        TicketSoporte ticket2 = new TicketSoporte("El programa funcionaba en mi PC", usuario1);
        Tecnico tecnico1 = new Tecnico("Elton John", "Ciberseguridad");
        ticket2.asignarTecnico(tecnico1);
        ticket2.mostrarDetalle();

        //Kata 3
        Usuario usuario2 = new Usuario("Carlos","carlostevesbien@hotmail.com");

        SistemaSoporte sistema1 = new SistemaSoporte();
        sistema1.crearTicket("En mi pc andaba", usuario1);
        sistema1.crearTicket("Le sale humo a la fuente", usuario2);
        sistema1.asignarTecnico(3, tecnico1);
        System.out.println(sistema1);;

    }
}