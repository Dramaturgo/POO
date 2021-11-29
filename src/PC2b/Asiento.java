package PC2b;

public class Asiento {

    private int fila;
    private String letra;
    private String categoria;
    private double precio;

    public Asiento (int fila, String letra, String categoria) {
        this.fila = fila;
        this.letra = letra;
        this.categoria = categoria;
        precio=calcularPrecio ();
    }

    public double calcularPrecio(){
            double precio=0;
            if(categoria.equalsIgnoreCase ("Regular")){
                precio=20.0;
            }else if(categoria.equalsIgnoreCase ("4DX")){
                precio=45.0;
            }
            return precio;
    }

    public int getFila () {
        return fila;
    }

    public String getLetra () {
        return letra;
    }

    public String getCategoria () {
        return categoria;
    }

    public double getPrecio () {
        return precio;
    }

    @Override
    public String toString () {
        return "\nFila: "+fila+
                "\nLetra: "+letra+
                "\nCategoria: "+categoria+
                "\nPrecio: "+calcularPrecio ()+"\n";
    }

}
