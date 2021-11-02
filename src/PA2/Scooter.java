package PA2;

public class Scooter extends Vehiculo {

   private String modeloMotor;
   private int horasBateria;



    public Scooter (String codigo, String añoCompra, String marca, String modelo, String color, String modeloMotor, int horasBateria) {
        super (codigo, añoCompra, marca, modelo, color);
        this.modeloMotor = modeloMotor;
        this.horasBateria = horasBateria;

    }

    public String getModeloMotor () {
        return modeloMotor;
    }

    public int getHorasBateria () {
        return horasBateria;
    }

    public int calcularVelocidadMaxima(){
        return 35;
    }

}
