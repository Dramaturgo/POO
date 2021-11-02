package PA2;

public class Bicicleta extends Vehiculo {


   private double valor;
   private int cantidadPlatos;
   private String clasificacion;

    public Bicicleta (String codigo, String añoCompra, String marca, String modelo, String color, double valor, int cantidadPlatos, String clasificacion) {
        super (codigo, añoCompra, marca, modelo, color);
        this.valor = valor;
        this.cantidadPlatos = cantidadPlatos;
        this.clasificacion = clasificacion;
    }

   public int calcularVelocidadMaxima(){
       int velocidadMaxAdicional=0;
       int velocidadMax=0;
      if(cantidadPlatos>2){
          velocidadMaxAdicional=6;
      }

       velocidadMax = switch (clasificacion) {
           case "Urbana" -> 15;
           case "Montañera" -> 25;
           case "Ruta" -> 30;
           default -> - 1;
       };
        return (velocidadMax+velocidadMaxAdicional);
   }

    public double getValor () {
        return valor;
    }

    public int getCantidadPlatos () {
        return cantidadPlatos;
    }

    public String getClasificacion () {
        return clasificacion;
    }
}
