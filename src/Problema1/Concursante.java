package Problema1;

public  class Concursante{

    private String nroDeDni;
    private String nombre;
    private String nombrePlato;
    private double puntajeSabor;
    private double puntajePresentacion;
    private double puntajeOriginalidad;



    public Concursante(String nroDeDni,String nombre,String nombrePlato,double puntajeSabor,double puntajePresentacion,double puntajeOriginalidad){

        this.nroDeDni=nroDeDni;
        this.nombre=nombre;
        this.nombrePlato=nombrePlato;
        this.puntajeSabor=puntajeSabor;
        this.puntajePresentacion=puntajePresentacion;
        this.puntajeOriginalidad=puntajeOriginalidad;

    }

    public double getPuntajeOriginalidad() {
        return puntajeOriginalidad;
    }

    public double getPuntajePresentacion() {
        return puntajePresentacion;
    }

    public double getPuntajeSabor() {
        return puntajeSabor;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNroDeDni() {
        return nroDeDni;
    }

    public  double puntajeFinal(){
        double puntaje=puntajeSabor*0.7+puntajePresentacion*0.2+puntajeOriginalidad*0.1;
        return puntaje;
    }

    public String listarConcursantes(){
        return "Concursante: \n" + "Datos: "+nroDeDni + " - " + nombre + " \nPlato presentado: " + nombrePlato + " \n" +
                "Puntajes: " + puntajeSabor + " - " + puntajePresentacion + " - " + puntajeOriginalidad +
                "\nPuntaje Final Obtenido : " + puntajeFinal()+"\n";
    }



}
