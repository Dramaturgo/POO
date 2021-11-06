package Profesor;

public class ProfesorTP extends  Profesor{
    private double tarifaHora;
    private double numeroHoras;


    public double calcularSueldo () {
        return (this.tarifaHora*this.numeroHoras);
    }

    public ProfesorTP (String codigo, String nombre, String dni, double tarifaHora, double numeroHoras) {
        super (codigo, nombre, dni);//llama al  constructor del padre pasandole datos
        this.tarifaHora = tarifaHora;
        this.numeroHoras = numeroHoras;
    }

    public double getTarifaHora () {
        return tarifaHora;
    }

    public void setTarifaHora (double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public double getNumeroHoras () {
        return numeroHoras;
    }

    public void setNumeroHoras (double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
}
