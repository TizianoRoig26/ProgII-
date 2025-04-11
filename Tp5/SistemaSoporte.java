package Tp.Tp5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SistemaSoporte {
    private List<Ticket> tickets = new ArrayList<>();

    public void crearTicket(String descripcion, Usuario usuario) {
        Ticket nuevo = new Ticket(descripcion, usuario);
        tickets.add(nuevo);
    }
    public void asignarTecnico(Tecnico tecnico){
        for (Ticket t : tickets) {
            if (t.getTecnicoAsignado() == null) {
                t.asignarTecnico(tecnico);
                System.out.println("Técnico asignado al ticket ID: " + t.getId());
            }
        }
    }
    public void listaSeguimiento(){
        System.out.println("---------------------------------");
        for (Ticket t : tickets) {
         if (t.getEstado() == "Abierto") {
             System.out.println(t);
             System.out.println("--");
         }
        }
        System.out.println("---------------------------------");
        for (Ticket t : tickets) {
         if (t.getEstado() == "Cerrado") {
             System.out.println(t);
             System.out.println("--");
         }
        }

    }

}
