package com.upc.herencia;

public class ProfesorTC extends Profesor{

    private double sueldoBase;
    private double porAFP;

    public double calcularSueldo () {//es necesario implementar el metodo abstract heredado
        return (this.sueldoBase-this.porAFP*this.sueldoBase);
    }

    public ProfesorTC (String codigo, String nombre, String dni, double sueldoBase, double porAFP) {
        super (codigo, nombre, dni);
        this.sueldoBase = sueldoBase;
        this.porAFP = porAFP;
    }

    public double getSueldoBase () {
        return sueldoBase;
    }

    public void setSueldoBase (double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPorAFP () {
        return porAFP;
    }

    public void setPorAFP (double porAFP) {
        this.porAFP = porAFP;
    }
}
