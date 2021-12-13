package PA4;

public class Sala4D extends SalaDeCine{

    private String modeloSistemAire;
    private String modeloMotorVibracion;

    public Sala4D (String codigo, String nombre, int capacidad, double precioBaseEntrada, String modeloSistemAire, String modeloMotorVibracion) {
        super (codigo, nombre, capacidad, precioBaseEntrada);
        this.modeloSistemAire = modeloSistemAire;
        this.modeloMotorVibracion = modeloMotorVibracion;
    }

    @Override
    public double calcularPrecioEntrada () {
        double adicional=0;

        if ("aire-max-300".equals (modeloSistemAire)) {
            switch (modeloMotorVibracion) {
                case "vib-max-550" -> adicional = super.getPrecioBaseEntrada () * 0.25;
                case "vib-max-450" -> adicional = super.getPrecioBaseEntrada () * 0.22;
                case "vib-max-300" -> adicional = super.getPrecioBaseEntrada () * 0.18;
            }
        } else if ("aire-plus-250".equals (modeloSistemAire)) {
            switch (modeloMotorVibracion) {
                case "vib-max-550" -> adicional = super.getPrecioBaseEntrada () * 0.15;
                case "vib-max-450" -> adicional = super.getPrecioBaseEntrada () * 0.13;
                case "vib-max-300" -> adicional = super.getPrecioBaseEntrada () * 0.11;
            }
        } else if ("aire-reg-100".equals (modeloSistemAire)) {
            switch (modeloMotorVibracion) {
                case "vib-max-550" -> adicional = super.getPrecioBaseEntrada () * 0.10;
                case "vib-max-450" -> adicional = super.getPrecioBaseEntrada () * 0.08;
                case "vib-max-300" -> adicional = super.getPrecioBaseEntrada () * 0.05;
            }
        }
        return super.getPrecioBaseEntrada ()+adicional;

    }

    @Override
    public String toString () {
        return super.toString ()+
                "\nModelo de Sistema de aire: "+modeloSistemAire+
                "\nModelo de Motor de vibracion: "+modeloMotorVibracion+"\n";
    }
}
