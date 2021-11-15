package PA3;

public class Asiento {

   private  int numero;
   private String letra;
   private double precio;


    public Asiento (int numero, String letra) {
        this.numero = numero;
        this.letra = letra;
        this.precio = calcularPrecio ();
    }
    public double calcularPrecio(){
        double precioBase=0;
        double factorial=0;
        if(this.letra.equals ("A")||this.letra.equals ("C")||this.letra.equals ("D")||this.letra.equals ("F")){
            precioBase=80.0;
        }else if(this.letra.equals ("B")||this.letra.equals ("E")){
            precioBase=60.0;
        }
        if(this.numero<7){
            factorial=1.5;
        }else if(this.numero<=16){
            factorial=1.3;
        }else if(this.numero>16){
            factorial=1.15;
        }
      return precioBase*factorial;
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

    @Override
    public String toString () {
        return
                "\nNumero: " + numero + "     Letra: " + letra + "   Precio=" + precio+"\n";
    }
}
