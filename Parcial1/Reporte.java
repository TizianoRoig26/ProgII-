package Parcial1;

import java.time.LocalDate;
import java.util.List;

public class Reporte {
    private int id;
    private String detalles;
    private LocalDate fechaEmision;
    private List<Incidente> incidentes;

    public Reporte(int i, String falloEnLaMáquina, LocalDate now, List<Incidente> listaIncidentes) {}
    public Reporte(int id, String detalles, List<Incidente> incidentes) {
        this.id = id;
        this.detalles = detalles;
        this.fechaEmision = LocalDate.now();
        this.incidentes = incidentes;
    }



}
