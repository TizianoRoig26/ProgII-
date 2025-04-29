package Parcial1;

import java.util.List;

public class Parque {
    private String nombre;
    private String direccion;
    private String horarioApertura;
    private String horarioCierre;
    private List<Atraccion> atraccions;
    private int mayorTiempo;
    private String atraccionMayor;

    public Parque(String nombre, String direccion, String horarioApertura, String horarioCierre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public Atraccion obtenerAtraccionMasVisitada(){

        for (Atraccion atraccion : atraccions) {
            if (this.mayorTiempo > atraccion.calcularTiempoDeEsperaEnMinutos()) {
                this.atraccionMayor = atraccion.toString();
            }
        }
        System.out.println(atraccionMayor);
        return null;
    }

}
