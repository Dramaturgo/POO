package Aerolinea;

public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private Avion avion;

    public Vuelo (String codigo, String origen, String destino) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;

    }

    public void asignarAvion(Avion avion){

       this.avion=avion;
    }

    public String getCodigo () {
        return codigo;
    }

    public String getOrigen () {
        return origen;
    }

    public String getDestino () {
        return destino;
    }

    public Avion getAvion () {
        return avion;
    }

    @Override
    public String toString () {
        return "Datos del Vuelo:" +
                "\nCodigo: " + codigo +
                "\nOrigen: " + origen + "        Destino: " + destino +
                 avion ;
    }
}
