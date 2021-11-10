package Factura;

public class Item {
    private int numeroItem;
    private int cantidad;
    private Producto producto;

    public double calcularSubmonto(){
        return (this.cantidad * producto.getPrecio());//joint
    }

    public Item(int numeroItem, int cantidad, Producto producto) {
        this.numeroItem = numeroItem;
        this.cantidad = cantidad;
        this.producto = producto; //proyectos grandes generalizacion
    }

    public Item(int numeroItem, int cantidad, String codigo, String descripcion, double precio) {
        this.numeroItem = numeroItem;
        this.cantidad = cantidad;
        this.producto = new Producto(codigo, descripcion, precio); //por ser composicion
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Item{" +
                "numeroItem=" + numeroItem +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}