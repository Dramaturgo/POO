package Empresa;

public class Destacado extends Trabajador {

    private double sueldo;
    private double porcentajeParticipacion;

    public Destacado(String documento, String nombres, String direccion, String areaTrabajo, double sueldo, double porcentajeParticipacion) {
        super(documento, nombres, direccion, areaTrabajo);
        this.sueldo = sueldo;
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    @Override
    public double calcularSueldoFinal() {
        double utilidadesProyectadas = 750000;
        double sueldoFinal = sueldo + utilidadesProyectadas * porcentajeParticipacion;
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Destacado{" +
                super.toString() +
                "sueldo=" + sueldo +
                ", porcentajeParticipacion=" + porcentajeParticipacion +
                ", sueldoFinal= S/" + calcularSueldoFinal() +
                '}';
    }
}
