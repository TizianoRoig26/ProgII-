package Tp.TpGrupo;
import java.util.*;



public class Escuela {
    private List<Alumno> alumnos;
    private int numero;
    private String denominacion;
    private List<DivisionCurso> divisionCursos = new ArrayList();

    public Escuela() {
    }

    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<DivisionCurso> getDivisionCursos() {
        return divisionCursos;
    }

    public void setDivisionCursos(List<DivisionCurso> divisionCursos) {
        this.divisionCursos = divisionCursos;
    }


    public  Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
        Alumno mejorAlumno = null;
        double mejorPromedio = -1;
        for (Alumno alumno : alumnos) {
            if (alumno.getFechaDeNacimiento().equals(convertirAnioADate(anioNacimientoAlumno)) && todasLasNotasAprobadas(alumno)) {
                        double promedio = alumno.promedioNotas(null);
                        if (mejorPromedio < promedio) {
                            mejorPromedio = promedio;
                            mejorAlumno = alumno;
                    }
                }
            }
        return mejorAlumno;
        }

    public List<Alumno> getMejoresAlumnos(int anioNacimientoAlumno){
        List<Alumno> mejoresAlumnos = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            if (alumno.getFechaDeNacimiento().equals(convertirAnioADate(anioNacimientoAlumno)) && todasLasNotasAprobadas(alumno)) {
                mejoresAlumnos.add(alumno);
            }
        }
        Collections.sort(mejoresAlumnos, Collections.reverseOrder());
        if (mejoresAlumnos.size() > 3) {
            return mejoresAlumnos.subList(0, 3);
        } else {
            return mejoresAlumnos;
        }
    }

    public static Date convertirAnioADate(int anio) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, Calendar.JANUARY, 1, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    private boolean todasLasNotasAprobadas(Alumno alumno) {
        for (Nota nota : alumno.getNotas()) {
            if (nota.getValor() <= 6) {
                return false;
            }
        }
        return true;
    }
}
