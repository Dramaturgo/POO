package Comercial;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    private String codigoBus;
    private int capacidadFija;
    private int nivelCategoria;
    private Motor motor;
    private List<Asiento> listaAsientos;

    public Bus(String codigoBus, int capacidadFija, int nivelCategoria, String modeloMotor, int nroCilindrosMotor, String nombreAsiento, double precioAsiento) {
        this.codigoBus = codigoBus;
        this.capacidadFija = capacidadFija;
        this.nivelCategoria = nivelCategoria;
        this.motor = new Motor(modeloMotor, nroCilindrosMotor);
        this.listaAsientos = new ArrayList<>();
        Asiento asiento = new Asiento(nombreAsiento, precioAsiento);
        this.listaAsientos.add(asiento);
    }

    public String getCodigoBus() {
        return codigoBus;
    }

    public int getCapacidadFija() {
        return capacidadFija;
    }

    public int getNivelCategoria() {
        return nivelCategoria;
    }

    public Motor getMotor() {
        return motor;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }

    public void registrarAsiento(String nombre, double precio) {
        Asiento asiento = new Asiento(nombre, precio);
        listaAsientos.add(asiento);
    }

    public double obtenerFactorSegunCategoria() {
        switch (nivelCategoria) {
            case 1:
                return 1.35;
            case 2:
                return 1.15;
            case 3:
                return 1.05;
            default:
                return 1;
        }
    }

    public double calcularVentaTotal() {
        double sumaTotal = 0;
        for (Asiento asiento: listaAsientos) {
            sumaTotal = sumaTotal + asiento.getPrecio();
        }
        double factor = obtenerFactorSegunCategoria();
        return sumaTotal * factor;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "codigoBus='" + codigoBus + '\'' +
                ", capacidadFija=" + capacidadFija +
                ", nivelCategoria=" + nivelCategoria +
                ", motor=" + motor +
                ", totalVenta= S/" + calcularVentaTotal() +
                ", listaAsientos=" + listaAsientos +
                '}';
    }
}
