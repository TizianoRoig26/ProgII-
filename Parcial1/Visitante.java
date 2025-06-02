package Parcial1;

import java.util.List;

public class Visitante {
    private String nombre;
    private String dni;
    private int edad;
    private List<Entrada> listaEntradas;
    private Ticket ticket;

    public Visitante(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

}
