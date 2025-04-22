package Tp.TpGrupo;

import java.util.ArrayList;
import java.util.List;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;
    private Escuela escuela;
    private List<Catedra> catedras = new ArrayList<>();

    public DivisionCurso() {
    }

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
    }

    public Escuela getEscuela() {
        return escuela;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getAnio() {
        return anio;
    }
    public int getDivision() {
        return division;
    }
    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDivision(int division) {
        this.division = division;
    }
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Alumno mejorAlumnoDivisionCurso(){
        Alumno mejorAlumno = null;
        double mejorPromedio = -1;
        for (Catedra catedra : catedras){

            for (Alumno alumno : catedra.getAlumnos()){

                int cantidadNotas = alumno.getNotas().size();

                for (Nota nota : alumno.getNotas()){

                    if (nota.isEsRecuperatorio() == false && cantidadNotas >= 5){
                        double promedio = alumno.promedioNotas(null);

                        if (mejorPromedio < promedio){
                            mejorPromedio = promedio;
                            mejorAlumno = alumno;
                        }
                    }
                }
            }
        }
        return mejorAlumno;
    }


}
