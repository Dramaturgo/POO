package PCFinalA;

public class Asiento {

    private int numero;
    private String letra;
    private double precio;
    private Pasajero pasajero;


    public Asiento (int numero, String letra) {
        this.numero = numero;
        this.letra = letra;
        this.precio = calcularPrecio ();
    }

    public double calcularPrecio() {
        double precio = 0;
        double factor = 0;
        if (letra.equals ("A") || letra.equals ("C") || letra.equals ("D") || letra.equals ("F")) {
            precio = 50.0;
        } else if (letra.equals ("B") || letra.equals ("E")) {
            precio = 70.0;
        }
        if(numero<7){
            factor=1.6;
        }else if(numero>=7&&numero<=16){
            factor=1.2;
        }else if(numero>16){
            factor=1.8;
        }
         return precio*factor;

    }

    public void asignarPasajero (Pasajero pasajero){
        this.pasajero = pasajero;
    }

    public int getNumero () {
        return numero;
    }

    public String getLetra () {
        return letra;
    }

    public double getPrecio () {
        return precio;
    }

    public String toString(){
        return "\nNumero: "+numero+"\nLetra: "+letra+"\nPrecio: "+precio+"\nPasajero: "+pasajero.toString ();
    }
}
