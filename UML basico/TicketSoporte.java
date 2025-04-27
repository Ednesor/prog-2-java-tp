import java.util.Date;

public class TicketSoporte {
    private static int contador = 0;
    private int id;
    private String descripcion;
    private String estado;
    private Date fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte() {
    }

    public TicketSoporte(String descripcion) {
        contador++;
        this.id = contador;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = new Date();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        contador++;
        this.id = contador;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.estado = "abierto";
        this.fechaCreacion = new Date();
    }

    public int getId() {
        return id;
    }

    public void cerrarTicket(){
        this.estado = "cerrado";
        System.out.println("Ticket "+this.id+" cerrado.");
    }

    public void mostrarDetalle(){
        System.out.println("__________ Detalle _________");
        System.out.println("| Id: "+this.id);
        System.out.println("| Descripcion: "+this.descripcion);
        System.out.println("| Estado: "+this.estado);
        System.out.println("| Fecha de creacion: "+this.fechaCreacion);
        if(this.usuario != null) System.out.println("| Usuario: "+this.usuario.toString());
        else System.out.println("| Usuario: no asignado");
        if(this.tecnico != null) System.out.println("| Tecnico: "+this.tecnico);
        else System.out.println("| Tecnico: no asignado");
        System.out.println("________ Fin Detalle ________");
    }

    public void asignarTecnico (Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public boolean estaAbierto(){
        return this.estado.equals("abierto");
    }

    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", usuario=" + usuario +
                ", tecnico=" + tecnico +
                '}';
    }
}
