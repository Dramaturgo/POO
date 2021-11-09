package PC1b;

public class Fruta extends Producto{

    private String indicador;
    private int cantidad;

    public Fruta (String codigo, String nombre, double precio, String indicador, int cantidad) {
        super (codigo, nombre, precio);
        this.indicador = indicador;
        this.cantidad = cantidad;
    }

    @Override
    public double calcularValorRefencial () {
        return cantidad*super.getPrecio ();
    }

    @Override
    public String listarDatos () {
        return super.listarDatos ()+"\nIndicador Dulce(si/no): "+ indicador+"  cantidad: "+cantidad+"\nValor referencial: "+this.calcularValorRefencial ()+"\n";
    }

    public String getIndicador () {
        return indicador;
    }

    public int getCantidad () {
        return cantidad;
    }
}
