import java.util.ArrayList;

public class SistemaSoporte {
    ArrayList<TicketSoporte> tickets = new ArrayList<>();

    public SistemaSoporte() {
    }

    public void crearTicket(String descripcion, Usuario usuario) {
        tickets.add(new TicketSoporte(descripcion, usuario));
    }
    public void crearTicket(String descripcion) {
        tickets.add(new TicketSoporte(descripcion));
    }
    public void asignarTecnico(int id, Tecnico tecnico){
        for(TicketSoporte ticket: this.tickets){
            if(ticket.getId() == id){
                ticket.asignarTecnico(tecnico);
                System.out.println("Tecnico asignado");
                return;
            }
        }
    }
    public void listarTicketsAbiertos(){
        System.out.println("__________Tickets Abiertos__________");
        for(TicketSoporte ticket: tickets){
            if(ticket.estaAbierto()) System.out.println(ticket);
        }
    }
    public void listarTicketsCerrados(){
        System.out.println("__________Tickets Cerrados__________");
        for(TicketSoporte ticket: tickets){
            if(!ticket.estaAbierto()) System.out.println(ticket);
        }
    }

    @Override
    public String toString() {
        return "SistemaSoporte{" +
                "tickets=" + tickets +
                '}';
    }
}
