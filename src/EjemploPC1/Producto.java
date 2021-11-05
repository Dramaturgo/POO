package EjemploPC1;

import java.util.ArrayList;
import java.util.List;

public abstract  class Producto{

    private String codigo;
    private String nombre;
    private double peso;
    private double costo;

    public Producto(String codigo,String nombre,double peso,double costo){

        this.codigo=codigo;
        this.nombre=nombre;
        this.peso=peso;
        this.costo=costo;

    }

    public abstract double precioVenta();

    public String riesgoProducto(){
        String riesgo=null;

        if(peso>100){
            riesgo="Alto";
        }else if(peso<=100){
            riesgo="Bajo";
        }return riesgo;

    }

    public String listarDatos(){
         return "Datos del Producto: \nCodigo: " + this.codigo + "  Nombre: " + this.nombre + "  Peso: " + this.peso + "  Costo: " + this.costo +
                 "\nPrecio de Venta: " + this.precioVenta ();

    }
    public double getCosto() {
        return costo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }


}
