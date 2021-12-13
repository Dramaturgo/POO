package PCFinalA;

public class Viaje {

    private String codigoUnico;
    private Bus bus;
    private String origen;
    private String destino;

    public Viaje (String codigoUnico, String origen, String destino) {
        this.codigoUnico = codigoUnico;
        this.origen = origen;
        this.destino = destino;
    }

    public void asignarBus(Bus bus){
        this.bus=bus;
    }

    public String getCodigoUnico () {
        return codigoUnico;
    }

    public String getOrigen () {
        return origen;
    }

    public String getDestino () {
        return destino;
    }

    public String toString(){
        return "\nCodigoUnico: "+codigoUnico+"\nOrigen: "+origen+"\nDestino: "+destino+"\nBus: "+bus.toString ();
    }
}
