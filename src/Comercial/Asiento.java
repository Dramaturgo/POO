package Comercial;

public class Asiento {

    private String nombre;
    private double precio;

    public Asiento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
