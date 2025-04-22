package Tp.TpGrupo;
import java.util.Date;
import java.util.List;
public class Alumno {

        private long legajo;
        private String nombre;
        private String apellido;
        private Date fechaDeNacimiento;
        private List<Nota> notas;

        public Alumno() {
    }

        public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public long getLegajo() {
        return legajo;
    }

    public Nota mejorNota(Integer codigoCatedra){
        Nota mejorNota = null;
        for (Nota nota : notas){
            if (nota.isEsRecuperatorio())continue;
            if(codigoCatedra != null && nota.getCatedra().getCodigo() != codigoCatedra)continue;
            if(mejorNota == null || nota.getValor() > mejorNota.getValor()) {
                mejorNota = nota;
            }
        }
        return mejorNota;
    }

    public double promedioNotas(Integer codigoCatedra){
        double sumaDeNotas = 0;
        int cantidad = 0;
        for (Nota nota : notas){
            if(codigoCatedra != null && nota.getCatedra().getCodigo() != codigoCatedra)continue;
            sumaDeNotas += nota.getValor();
            cantidad++;
        }
        return sumaDeNotas / cantidad;
    }

}



