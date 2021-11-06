package Naviera;

public class Maritimo extends Naviera{

    private String razonSocial;

    public Maritimo (String codigoEnvio, int categoriaEnvio, double volumenMetrico, String razonSocial) {
        super (codigoEnvio, categoriaEnvio, volumenMetrico);
        this.razonSocial = razonSocial;
    }

    public double calcularCosto(){
        double v = this.getVolumenMetrico () * 100 + (this.getVolumenMetrico () * this.getCategoriaEnvio ()) * 25;
        return Math.round(v*100)/100d;
    }

    public String getRazonSocial () {
        return razonSocial;
    }

    public void setRazonSocial (String razonSocial) {
        this.razonSocial = razonSocial;
    }




}