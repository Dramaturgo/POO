package Empresa;

public class Temporal extends Trabajador {

    private double tarifaXHora;
    private double horasTrabajadas;

    public Temporal(String documento, String nombres, String direccion, String areaTrabajo, double tarifaXHora) {
        super(documento, nombres, direccion, areaTrabajo);
        this.tarifaXHora = tarifaXHora;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaXHora() {
        return tarifaXHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularSueldoFinal() {
        double sueldoFinal = tarifaXHora * horasTrabajadas;
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Temporal{" +
                super.toString() +
                "tarifaXHora=" + tarifaXHora +
                ", horasTrabajadas=" + horasTrabajadas +
                ", sueldoFinal= S/" + calcularSueldoFinal() +
                '}';
    }
}

