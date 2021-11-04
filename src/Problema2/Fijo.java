package Problema2;

public class Fijo extends Trabajador{

    private int horasExtras;
    private int cantidadHijos;

    public Fijo(String dni,String nombre,String direccion,String correo,double sueldoFijo,int horasExtras,int cantidadHijos){

        super(dni,nombre,direccion,correo,sueldoFijo);
        this.horasExtras=horasExtras;
        this.cantidadHijos=cantidadHijos;
    }

    public double calcularSueldoBruto(){
        return this.getSueldoFijo()+(100*this.horasExtras)+(85*this.cantidadHijos);
    }

    public String listarTrabajadores(){
        return super.listarTrabajadores()+"\nHoras extras: "+horasExtras+"\nCantidad de hijos: "+cantidadHijos+"\n";
    }


    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

}