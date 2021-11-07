package Empresa;

import java.util.List;
import java.util.ArrayList;

public class Empresa {

    private List<Trabajador> trabajadores;

    public Empresa() {
        trabajadores = new ArrayList<Trabajador>();
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public Trabajador buscarTrabajador(String documento) {
        for (Trabajador trabajador: trabajadores) {
            if (trabajador.getDocumento ().equals (documento)) {
                return trabajador;
            }
        }
        return null;
    }

    public void registrarTrabajador(Trabajador trabajador) {
        //si no encuentra el dni en el array arroja null y si es null es por que ese dni es nuevo
        if (buscarTrabajador(trabajador.getDocumento()) == null) {
            trabajadores.add(trabajador);
        }
    }

    public double obtenerMontoTotalPagarTemporales() {
        double sumaTotal = 0;
        for (Trabajador trabajador: trabajadores) {
//                En caso se requiera acceder a un atributo unico de Temporal
//            if (trabajador instanceof Temporal && ((Temporal) trabajador).getHorasTrabajadas() > 20) {
            if (trabajador instanceof Temporal) {
                sumaTotal = sumaTotal + trabajador.calcularSueldoFinal();
            }
        }
        return sumaTotal;
    }

}

