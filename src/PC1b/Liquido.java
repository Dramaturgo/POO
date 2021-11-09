package PC1b;

public class Liquido extends  Producto{

    private int cantidadml;
    private String marca;


    public Liquido (String codigo, String nombre, double precio, int cantidadml, String marca) {
        super (codigo, nombre, precio);
        this.cantidadml = cantidadml;
        this.marca = marca;
    }

    @Override
    public double calcularValorRefencial () {
        double valorReferencial=0;
        if(cantidadml>50){
            valorReferencial+=super.getPrecio ();
        }else{
            valorReferencial=0;
        }
        return valorReferencial;
    }

    @Override
    public String listarDatos () {
        return super.listarDatos ()+"\nPresentacion: "+cantidadml+"   Marca: "+marca+"\nValor referencial: "+this.calcularValorRefencial ()+"\n";
    }

    public int getCantidadml () {
        return cantidadml;
    }

    public String getMarca () {
        return marca;
    }
}
