package Parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpleadoSeguridad {
    private int id;
    private String nomnbre;
    private List<String> especialidades = new ArrayList<>();
    private List<Incidente> incidentes = new ArrayList<>();

    public EmpleadoSeguridad() {
    }

    public EmpleadoSeguridad(int id, String nomnbre, List<String> especialidades) {
        this.id = id;
        this.nomnbre = nomnbre;
        this.especialidades = especialidades;
    }

    public EmpleadoSeguridad(int id, String nombre) {
        this.id = id;
        this.nomnbre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public void agregarEspecialidad(String especialidad) {
        for (String esp : especialidades) {
            if (esp.equals(especialidad)) {
                return;
            }
        }
        especialidades.add(especialidad);
    }



    public void mostrarIncidentesReportados() {
        for (Incidente incidente: incidentes) {
            System.out.println(incidente.toString());
        }
    }


}
