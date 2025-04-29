package Parcial1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
                Visitante visitante1 = new Visitante("Juan", "190238", 20);

                Atraccion atraccion1 = new Atraccion("Mecanica", 4, 2, TipoAtraccion.MECANICA, 3);
                Atraccion atraccion2 = new Atraccion("Agua", 4, 2, TipoAtraccion.ACUATICA, 1);
                Atraccion atraccion3 = new Atraccion("inf", 4, 2, TipoAtraccion.INFANTIL, 5);

                EmpleadoSeguridad empleado1 = new EmpleadoSeguridad(1, "Pedro");
                empleado1.agregarEspecialidad("Mecánico");
                empleado1.agregarEspecialidad("Electrónico");

                Incidente inc1 = new Incidente(LocalDate.now(), "Fallo en la maquinaria", EstadoIncidente.REPORTADO, atraccion1, visitante1);
                Incidente inc2 = new Incidente(LocalDate.now(), "Fallo en la maquinaria", EstadoIncidente.REPORTADO, atraccion2, visitante1);

                List<Incidente> listaIncidentes = Arrays.asList(inc1, inc2);

                Reporte rep1 = new Reporte(1, "Fallo en la máquina", LocalDate.now(), listaIncidentes);

                Mantenimiento man1 = new Mantenimiento(LocalDate.now(), "Arreglo de máquina");

                System.out.println("Tiempo de espera atracción 1: " + atraccion1.calcularTiempoDeEsperaEnMinutos());
                empleado1.mostrarIncidentesReportados();
            }
        }
