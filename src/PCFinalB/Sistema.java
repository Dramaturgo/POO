package PCFinalB;

public abstract class Sistema {

    private double ingresoAnual;

    public Sistema (double ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }

    public abstract double calcularImpuesto();

    public double getIngresoAnual () {
        return ingresoAnual;
    }
}
