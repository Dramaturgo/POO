package envios;

public class Ultramaritimo  extends Naviera{

    private String codigoEmpresa;
    private String representanteLegal;


    public Ultramaritimo(String codigoEnvio,int categoriaEnvio,double volumenMetrico,String codigoEmpresa,String representanteLegal){

        super(codigoEnvio,categoriaEnvio,volumenMetrico);
        this.codigoEmpresa=codigoEmpresa;
        this.representanteLegal=representanteLegal;

    }

    public double calcularCosto(){

        double v = this.getVolumenMetrico () * 500 + (this.getVolumenMetrico () * 10) * (this.getCategoriaEnvio ()) * 10;
        return v;

    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }


    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

}
