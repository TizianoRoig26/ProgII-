package Tp.Tp5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan", "juan@gmail.com");
        Usuario usuario2 = new Usuario("Pedro", "p@gmail.com");
        Usuario usuario3 = new Usuario("Gabriel", "Gabriel@gmail.com");
        Tecnico tec1 = new Tecnico("TecNico", "nico@gmail.com");

        //Ticket ticket1 = new Ticket("No se efectura el pago");
        //Ticket ticket2 = new Ticket("No se efectura el pago", usuario1);
        //System.out.println(ticket1);
        //ticket1.cerrarTicket();
        //System.out.println(ticket1);

        SistemaSoporte sistemaSoporte = new SistemaSoporte();
        sistemaSoporte.crearTicket("No se efectua el pago", usuario1);
        sistemaSoporte.crearTicket("No puedo entrar al sistema", usuario2);
        sistemaSoporte.crearTicket("No me deja ingresar la cuenta", usuario3);
        sistemaSoporte.asignarTecnico(tec1);
        sistemaSoporte.listaSeguimiento();

    }
}
