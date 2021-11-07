package Empresa;

public class Nombrado extends Trabajador {

    private double sueldo;
    private String valorCategorizacion;

    public Nombrado(String documento, String nombres, String direccion, String areaTrabajo, double sueldo, String valorCategorizacion) {
        super(documento, nombres, direccion, areaTrabajo);
        this.sueldo = sueldo;
        this.valorCategorizacion = valorCategorizacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getValorCategorizacion() {
        return valorCategorizacion;
    }

    public double obtenerBonoCategorizacion() {
        double bono = 0;
        if (valorCategorizacion.equals("A")) {
            bono = 5000;
        } else if (valorCategorizacion.equals("B")) {
            bono = 3500;
        } else if (valorCategorizacion.equals("C")) {
            bono = 2500;
        } else if (valorCategorizacion.equals("D")) {
            bono = 1500;
        }
        return bono;
    }

    @Override
    public double calcularSueldoFinal() {
        double sueldoFinal = sueldo + obtenerBonoCategorizacion();
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Nombrado{" +
                super.toString() +
                "sueldo=" + sueldo +
                ", valorCategorizacion='" + valorCategorizacion + '\'' +
                ", sueldoFinal= S/" + calcularSueldoFinal() +
                '}';
    }
}
