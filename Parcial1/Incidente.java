package Parcial1;

import java.time.LocalDate;

public class Incidente {
    private LocalDate fecha;
    private String descripcion;
    private EstadoIncidente estado;
    private Atraccion atraccion;
    private Visitante visitante;

    public Incidente(LocalDate now, String falloEnLaMaquinaria, EstadoIncidente reportado, Atraccion atraccion1, Visitante visitante1){}

    public Incidente( String descripcion, EstadoIncidente estado, Atraccion atraccion) {
        this.fecha = LocalDate.now();
        this.descripcion = descripcion;
        this.estado = estado;
        this.atraccion = atraccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "Fecha: "+fecha+" Estado:"+estado+ " Descripcion: "+ descripcion+ "Atraccion: "+atraccion;
    }


}
