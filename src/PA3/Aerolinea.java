package PA3;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea {

    private List<Vuelo> arregloVuelos;

    public Aerolinea () {
        this.arregloVuelos = new ArrayList<> ();
    }


    public void registrarVuelos (String codigo, String origen, String destino) {
        Vuelo vuelo = new Vuelo (codigo, origen, destino);
        this.arregloVuelos.add (vuelo);
    }

    public Vuelo obtenerVuelo (String codigo) {
        for (Vuelo v : this.arregloVuelos) {
            if (v.getCodigo ().equals (codigo)) {
                return v;
            }
        }
        return null;
    }

    public void asignarAvion (String codigo, Avion avion) {
        Vuelo v = obtenerVuelo (codigo);
        if (v != null) {
            v.asignarAvion (avion);
        }
    }

    public List<Vuelo> buscarVuelos (String ModeloDeAvion) {
        List<Vuelo> vuelos = new ArrayList<> ();

        for (Vuelo v : this.arregloVuelos) {
            if (v.getAvion ().getModelo ().equals (ModeloDeAvion)) {
                vuelos.add (v);
            }
        }
        try {
            if (vuelos.size () == 0) {
                throw new NullPointerException ();

            }
        } catch (NullPointerException e) {
            System.out.println ("Modelo de avion invalido");
        }
        return vuelos;
    }


    public List<Vuelo> getArregloVuelos () {
        return arregloVuelos;
    }

    public String listarVuelos () {
        String lista = "";
        for (Vuelo v : this.arregloVuelos) {
            lista += v.toString () + "\n";
        }
        return lista;
    }

    @Override
    public String toString () {
        return "PA3 \n" + listarVuelos ();

    }
}
