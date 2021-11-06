package Naviera;

public abstract class Naviera{


    private String codigoEnvio;
    private int categoriaEnvio;
    private double  volumenMetrico;

    public Naviera (String codigoEnvio, int categoriaEnvio, double volumenMetrico) {
        this.codigoEnvio = codigoEnvio;
        this.categoriaEnvio = categoriaEnvio;
        this.volumenMetrico = volumenMetrico;
    }

    public Naviera () {
    }

    public abstract double  calcularCosto();


    public String getCodigoEnvio () {
        return codigoEnvio;
    }

    public void setCodigoEnvio (String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public int getCategoriaEnvio () {
        return categoriaEnvio;
    }

    public void setCategoriaEnvio (int categoriaEnvio) {
        this.categoriaEnvio = categoriaEnvio;
    }

    public double getVolumenMetrico () {
        return volumenMetrico;
    }

    public void setVolumenMetrico (double volumenMetrico) {
        this.volumenMetrico = volumenMetrico;
    }


}