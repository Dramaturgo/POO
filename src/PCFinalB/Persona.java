package PCFinalB;

public class Persona extends Sistema{

    private String nombre;
    private String nroDni;
    private String añoDeNacimiento;
    private double ingresoAnual;

    public Persona (double ingresoAnual, String nombre, String nroDni, String añoDeNacimiento) {
        super (ingresoAnual);
        this.nombre = nombre;
        this.nroDni = nroDni;
        this.añoDeNacimiento = añoDeNacimiento;

    }

    @Override
    public double calcularImpuesto () {
        double impuesto=0;
       if (super.getIngresoAnual()<50000){
           impuesto=super.getIngresoAnual()*0.15;
       }else if(super.getIngresoAnual ()<95000){
           impuesto=super.getIngresoAnual ()*0.20;
       }else if(super.getIngresoAnual ()>=95000){
           impuesto=super.getIngresoAnual ()*0.25;
       }return impuesto;
    }

    @Override
    public String toString () {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nroDni='" + nroDni + '\'' +
                ", añoDeNacimiento='" + añoDeNacimiento + '\'' +
                ", ingresoAnual=" + super.getIngresoAnual () +
                ",Impueso: "+calcularImpuesto ()+
                '}';
    }
}
