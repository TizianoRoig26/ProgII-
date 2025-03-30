package Tp.Tp2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//System.out.println("Ejercicio1 --------------------------------------------------------");
//        System.out.print("Introduce un año: ");
//        int anio = scanner.nextInt();
//        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
//            System.out.println(anio + " es un año bisiesto.");
//        } else {
//            System.out.println(anio + " no es un año bisiesto.");
//        }
//System.out.println("Ejercicio2 --------------------------------------------------------");
//        int numero1 = scanner.nextInt();
//        int numero2 = scanner.nextInt();
//        int numero3 = scanner.nextInt();
//        int mayor = 0;
//        if (numero1 > numero2 && numero1 > numero3){
//        mayor = numero1;
//        }else if (numero2 > numero1 && numero2 > numero3){
//        mayor = numero2;
//        } else if (numero3 > numero2 && numero3 > numero1){
//        mayor = numero3;
//        }else{
//            System.out.println("Son iguales");
//        }
//        System.out.println(mayor);
//System.out.println("Ejercicio3 --------------------------------------------------------");
//        int edad = 7;
//        if (edad < 12){
//            System.out.println("Niño");
//        } else if (edad < 18) {
//            System.out.println("Adolesente");
//        }else if (edad < 60) {
//            System.out.println("Adulto");
//        }else{
//            System.out.println("Adulto Mayor");
//        }
        System.out.println("Ejercicio4 --------------------------------------------------------");
        int precio = 1000;
        int precioFinal = 0;
        String eleccion = scanner.nextLine();
        switch (eleccion) {
            case "A":
                precioFinal = precio - (int) (precio * (10.0 / 100));
                System.out.println();
                break;
            case "B":
                precioFinal = precio - (int) (precio * (15.0 / 100));
                break;
            case "C":
                precioFinal = precio - (int) (precio * (20.0 / 100));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        System.out.println(precioFinal);
//System.out.println("Ejercicio5 --------------------------------------------------------");
//        int numeroIngresado;
//        int suma = 0;
//        do{
//            System.out.println("Ingrese un número (0 para terminar): ");
//            numeroIngresado = scanner.nextInt();
//            if (numeroIngresado%2==0){
//                suma += numeroIngresado;
//            }
//        }while (numeroIngresado != 0);
//        System.out.println("La suma de los números pares es: "+suma);
//System.out.println("Ejercicio6 --------------------------------------------------------");
//       numeroIngresado = 0;
//       int positivos = 0;
//       int negativos = 0;
//       int ceros = 0;
//        for (int contador = 1; contador < 11; contador++){
//            System.out.println("Ingrese el número "+contador+": ");
//            numeroIngresado = scanner.nextInt();
//            if (numeroIngresado > 0){
//                positivos++;
//            }else if (numeroIngresado < 0){
//                negativos++;
//            }else {
//                ceros++;
//            }
//        }
//        System.out.println("Positivos: "+ positivos);
//        System.out.println("Negativos: "+ negativos);
//        System.out.println("Ceros: "+ ceros);
//System.out.println("Ejercicio7 --------------------------------------------------------");
//        int nota;
//        do{
//            System.out.println("Ingrese una nota (0-10): ");
//            nota = scanner.nextInt();
//        }while (nota < 0 || nota > 10);
//System.out.println("Ejercicio8 --------------------------------------------------------");
//          int PrecioBase = 0;
//          int Impuesto = 0;
//          int Descuento = 0;
//          PrecioBase = scanner.nextInt();
//          Impuesto = scanner.nextInt();
//          Descuento = scanner.nextInt();
//          calcularPrecioFinal(PrecioBase, Impuesto, Descuento);
//System.out.println("Ejercicio9 --------------------------------------------------------");
//            System.out.print("Ingrese el precio: ");
//            double precio2 = 0;
//            precio2 = scanner.nextDouble();
//            System.out.print("Ingrese el peso: ");
//            double peso = scanner.nextDouble();
//            scanner.nextLine();
//            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
//            String zona = scanner.nextLine();
//            System.out.println(calcularTotalCompra(precio, calcularCostoEnvio(peso, zona)));
//System.out.println("Ejercicio10 --------------------------------------------------------");
//            int stockActual = scanner.nextInt();
//            int cantidadVendida = scanner.nextInt();
//            int cantidadRecibida = scanner.nextInt();
//            System.out.println(actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
//System.out.println("Ejercicio11 --------------------------------------------------------");
//              System.out.println(calcularDescuentoEspecial(200));
//System.out.println("Ejercicio12 --------------------------------------------------------");
//              double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
//              for (double precio : precios) {
//                  System.out.println("Número: " + precio);
//              }
//              precios[3] += 50.00;
//              for (double precio : precios) {
//                  System.out.println("Número: " + precio);
//              }
//System.out.println("Ejercicio13 --------------------------------------------------------");
//        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
//
//        System.out.println("Precios originales:");
//        mostrarPreciosRecursivo(precios, 0);
//        int indiceModificar = 2;
//        modificarPrecio(precios, indiceModificar, 179.99);
//        System.out.println("\nPrecios modificados:");
//        mostrarPreciosRecursivo(precios, 0);
//    }
//
//    public static double DESCUENTO_ESPECIAL = 0.10;
//
//    public static void calcularPrecioFinal(double PrecioBase, double Impuesto, double Descuento) {
//        double PrecioFinal = PrecioBase + (PrecioBase * Impuesto / 100) - (PrecioBase * Descuento / 100);
//        System.out.println("El precio final es: " + PrecioFinal);
//
//    }
//
//    public static double calcularCostoEnvio(double peso, String zona) {
//        double costo = 0;
//        switch (zona) {
//            case "Nacional":
//                costo = costo + 5 * peso;
//                break;
//            case "Internacional":
//                costo = costo + 10 * peso;
//                break;
//            default:
//                System.out.println("Region No valida");
//        }
//        System.out.println("El costo de envio es: " + costo);
//        return costo;
//    }

//    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
//        return precioProducto + costoEnvio;
//    }
//
//    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
//        int NuevoStock = stockActual - cantidadVendida + cantidadRecibida;
//        return NuevoStock;
//    }
//
//    public static double calcularDescuentoEspecial(double precio) {
//        precio = precio - (precio * DESCUENTO_ESPECIAL);
//        return precio;
//    }
//
//    public static void mostrarPreciosRecursivo(double[] precios, int index) {
//        if (index >= precios.length) {
//            return;
//        }
//        System.out.println("Precio " + (index + 1) + ": $" + precios[index]);
//        mostrarPreciosRecursivo(precios, index + 1);
//    }
//
//    public static void modificarPrecio(double[] precios, int index, double nuevoPrecio) {
//        if (index >= 0 && index < precios.length) {
//            precios[index] = nuevoPrecio;
//        } else {
//            System.out.println("Índice fuera de rango.");
//        }
//    }
    }
}

