package PCFinalB;

public class Empresa extends Sistema{
    private String razonSocial;
    private String ruc;
    private double ingresoAnual;

    public Empresa (double ingresoAnual, String razonSocial, String ruc) {
        super (ingresoAnual);
        this.razonSocial = razonSocial;
        this.ruc = ruc;
    }

    public void validarDigitosRuc()throws Exception{

        if(ruc.length ()<10)throw new Exception ("Numero de ruc invalido");
    }

    @Override
    public double calcularImpuesto () {
        double impuesto=0;
        if (super.getIngresoAnual ()<50000){
            impuesto=super.getIngresoAnual ()*0.25;
        }else if(super.getIngresoAnual ()<95000){
            impuesto=super.getIngresoAnual ()*0.30;
        }else if(super.getIngresoAnual ()>=95000){
            impuesto=super.getIngresoAnual ()*0.40;
        }return impuesto;
    }

    @Override
    public String toString () {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", ruc='" + ruc + '\'' +
                ", ingresoAnual=" + super.getIngresoAnual () +
                ",Impueso: "+calcularImpuesto ()+
                '}';
    }
}
