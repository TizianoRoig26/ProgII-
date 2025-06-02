package Tp.Tp4;

import static Tp.Tp4.Empleado.*;

public class main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(100, "juan", "CommunityMang", 10001.0);
        Empleado emp2 = new Empleado("Pedro", "softwareEng");
        Empleado emp3 = new Empleado("Micaela", "Marketing");
        emp1.aumentoPorPorcentaje(10);
        emp2.aumentoPorPorcentaje(15);
        emp3.aumentoPorValor(700.00);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        Empleado.mostrarTotalEmpleados();
    }
}
