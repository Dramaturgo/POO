package Comercial;

import java.util.ArrayList;
import java.util.List;

public class Terminal {

    private List<Viaje> listaViajes;

    public Terminal() {
        this.listaViajes = new ArrayList<>();
    }

    public List<Viaje> getListaViajes() {
        return listaViajes;
    }

    public void registrarViaje(String codigo, String fecha, double precio, String nombreDestino) {
        Viaje viaje = new Viaje(codigo, fecha, precio, nombreDestino);
        listaViajes.add(viaje);
    }

    public List<Viaje> obtenerViajesConBusDeCategoria(int categoria) throws Exception {
        if (categoria <= 0 || categoria > 3) {
            throw new Exception("Categoría inválida");
        }
        List<Viaje> listaAux = new ArrayList<>();
        for (Viaje viaje: listaViajes) {
            if (viaje.elBusEsDeCategoria(categoria)) {
                listaAux.add(viaje);
            }
        }
        return listaAux;
    }

    public Viaje buscarViaje(String codigoViaje) {
        for (Viaje viaje: listaViajes) {
            if (viaje.getCodigoViaje().equals(codigoViaje)) {
                return viaje;
            }
        }
        return null;
    }

    public void asignarBusAViaje(String codigoViaje, Bus bus) {
        Viaje viaje = buscarViaje(codigoViaje);
        if (viaje != null) {
            viaje.asignarBus(bus);
        }
    }

}
