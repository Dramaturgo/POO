package Problema2;

public class Contratado extends Trabajador{

    private double volumenVentas;

    public Contratado(String dni,String nombre,String direccion,String correo,double sueldoFijo,double volumenVentas){
        super(dni,nombre,direccion,correo,sueldoFijo);
        this.volumenVentas=volumenVentas;
    }

    public double getVolumenVentas() {
        return volumenVentas;
    }

    public double calcularSueldoBruto(){

        double comision=0;

        if(volumenVentas<=5000){
            comision=0;
        }else if(volumenVentas>5000 && volumenVentas<=15000){
            comision=volumenVentas*0.10;
        }else if(volumenVentas>15000 && volumenVentas<=25000){
            comision=volumenVentas*0.15;
        }else if(volumenVentas>25000){
            comision=volumenVentas*0.25;
        }

        return this.getSueldoFijo()+comision;
    }
    public String listarTrabajadores(){
        return super.listarTrabajadores()+"\nVolumen de ventas: "+volumenVentas+"\n";
    }

}
