package pa1;

public class ProductoVendido {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public ProductoVendido (String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo () {
        return codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public int getCantidad () {
        return cantidad;
    }

    public double getPrecio () {
        return precio;
    }

    public double totalDeVenta (){
        return cantidad*precio*1.18;

    }

}

