package Tp.Tp5;

public class Tecnico {
    private int id;
    private String nombre;
    private String email;
    private static int contadorId = 1;

    public Tecnico(String nombre, String email) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
