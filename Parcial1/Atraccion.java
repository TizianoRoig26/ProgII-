package Parcial1;

import java.util.List;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private int tiempoDuracion;
    private TipoAtraccion tipo;
    private int visitantesEnCola;
    private List<Horario> horarioDisponible;
    private List<AtraccionTecnico> tecnicosAtraccion;
    private List<Mantenimiento> mantenimientos;

    public Atraccion(String mecanica, int i, int i1, TipoAtraccion tipoAtraccion, int i2) {}
    public Atraccion(String nombre, int capacidad, int tiempoDuracion, TipoAtraccion tipo, int visitantesEnCola, List<Horario> horario) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiempoDuracion = tiempoDuracion;
        this.tipo = tipo;
        this.visitantesEnCola = visitantesEnCola;
    }

    public int calcularTiempoDeEsperaEnMinutos() {
        int tiempoEstimado = this.visitantesEnCola * this.tiempoDuracion;
        return tiempoEstimado / 60;
    }

    public void mantenimientoProgramado(){

    }
    @Override
    public String toString(){
        return "Nombre" + nombre;
    }


}
