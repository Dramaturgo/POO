package Cuartel;

public class Torreta {
    private String modeloTorreta;
    private String tipoMunicion;

    public Torreta (String modeloTorreta, String tipoMunicion) {
        this.modeloTorreta = modeloTorreta;
        this.tipoMunicion = tipoMunicion;
    }

    public String getModeloTorreta () {
        return modeloTorreta;
    }

    public String getTipoMunicion () {
        return tipoMunicion;
    }


}
