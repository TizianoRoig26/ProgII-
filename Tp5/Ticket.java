package Tp.Tp5;

import java.time.LocalDate;

public class Ticket {
    LocalDate fechaActual = LocalDate.now();
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private static int contadorId = 1;
    private Usuario usuario;
    private Tecnico tecnicoAsignado;

    public Ticket(String descripcion){
        this.id = contadorId++;
        this.fechaCreacion = fechaActual;
        this.estado = "Abierto";
        this.descripcion = descripcion;
    }
    public void cerrarTicket() {
        this.estado = "Cerrado";
    }
    public Ticket(String descripcion, Usuario usuario) {
        this(descripcion);
        this.usuario = usuario;
    }
    public void asignarTecnico(Tecnico tecnico) {
        this.tecnicoAsignado = tecnico;
    }
    public boolean tieneTecnico() {
        return tecnicoAsignado != null;
    }
    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }
    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString(){
        return "Ticket: "+ id+
                "\nFecha: "+ fechaCreacion+
                "\nEstado: "+ estado +
                "\nDescripcion: " + descripcion +
                "\nUsuario: " + usuario+
                "\nTécnico asignado: " + tecnicoAsignado;
    }


}
