package Tp.Tp5;


public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private static int contadorId = 1;

    public Usuario(String nombre, String email) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return nombre + " (" + email + ")" + "ID: "+ id;
    }
}
