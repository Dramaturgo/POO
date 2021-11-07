package Empresa;

public abstract class Trabajador {

    private String documento;
    private String nombres;
    private String direccion;
    private String areaTrabajo;

    public Trabajador(String documento, String nombres, String direccion, String areaTrabajo) {
        this.documento = documento;
        this.nombres = nombres;
        this.direccion = direccion;
        this.areaTrabajo = areaTrabajo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public abstract double calcularSueldoFinal();

    @Override
    public String toString() {
        return " documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                ", areaTrabajo='" + areaTrabajo + '\'';
    }
}

