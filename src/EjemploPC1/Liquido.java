package EjemploPC1;

import java.util.List;

public class Liquido extends Producto{

    private double  densidad;
    private String marca;

    public Liquido(String codigo,String nombre,double peso,double costo,double densidad,String marca){
        super(codigo,nombre,peso,costo);
        this.densidad=densidad;
        this.marca=marca;

    }
    public double precioVenta(){
        return super.getCosto()+(super.getPeso()*densidad);
    }
    public String listarDatos(){
        return super.listarDatos()+"\nDensidad: "+this.densidad+"\nMarca: "+this.marca+"\n";
    }
    public String getMarca() {
        return marca;
    }
    public double  getDensidad() {
        return densidad;
    }


}