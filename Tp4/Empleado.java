package Tp.Tp4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int contadorId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    public Empleado(String nombre, String puesto){
        this.id = contadorId++;
        this.nombre =nombre;
        this.puesto = puesto;
        this.salario = 100000.00;
        totalEmpleados++;
    }

    public void aumentoPorPorcentaje(double aumento){
        this.salario = this.salario + (salario*(aumento/100));
    }
    public void aumentoPorValor(double aumento){
        this.salario = this.salario + aumento;
    }
    static void mostrarTotalEmpleados(){
        System.out.println("Total Empleado: "+ totalEmpleados);
    }
    @Override
    public String toString(){
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }



}
