package Terminal;

public class Viaje {

    private String codigoViaje;
    private String fecha;
    private double precio;
    private String nombreDestino;
    private Bus bus;

    public Viaje(String codigoViaje, String fecha, double precio, String nombreDestino) {
        this.codigoViaje = codigoViaje;
        this.fecha = fecha;
        this.precio = precio;
        this.nombreDestino = nombreDestino;
    }

    public String getCodigoViaje() {
        return codigoViaje;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public Bus getBus() {
        return bus;
    }

    public void asignarBus(Bus bus) {
        this.bus = bus;
    }

    public boolean elBusEsDeCategoria(int categoria) {
        if (bus.getNivelCategoria() == categoria) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "codigoViaje='" + codigoViaje + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", nombreDestino='" + nombreDestino + '\'' +
                ", bus=" + bus +
                '}';
    }
}
