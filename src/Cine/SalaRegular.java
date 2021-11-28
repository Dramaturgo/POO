package Cine;

public class SalaRegular extends SalaDeCine{

    private double factorIncremento;

    public SalaRegular (String codigo, String nombre, int capacidad, double precioBaseEntrada, double factorIncremento) {
        super (codigo, nombre, capacidad, precioBaseEntrada);
        this.factorIncremento = factorIncremento;
    }

    @Override
    public double calcularPrecioEntrada () {
        return super.getPrecioBaseEntrada ()*factorIncremento;
    }

   @Override
    public String toString () {
        return super.toString ()+
                "\nFactor de incremento: "+factorIncremento+"\n";
    }
}
