package PCFinalA;

import java.util.ArrayList;
import java.util.List;

public class Bus {

   private String modelo;
   private List<Asiento> listaDeAsientos;
   private List<Pasajero>listaPasajeros;


    public Bus (String modelo) {
        this.modelo = modelo;
        this.listaDeAsientos = new ArrayList<> ();
        this.listaPasajeros=new ArrayList<> ();
    }

    public Pasajero obtenerPasajero(String dni){
        for(Pasajero pasajero:listaPasajeros){
            if(pasajero.getDni ().equals (dni)){
                return pasajero;
            }
        }return null;
    }
    public void registrarPasajeros(Pasajero pasajero){
        this.listaPasajeros.add (pasajero);
    }

    public Asiento obtenerAsiento(int numero){
        for(Asiento asiento:listaDeAsientos){
            if(asiento.getNumero ()==numero){
                return asiento;
            }
        }return null;
    }

    public void asignarPasajeroyAsiento(String dni,int numero){
        Pasajero pasajero=obtenerPasajero (dni);
        Asiento asiento=obtenerAsiento (numero);
        if(pasajero!=null){
            asiento.asignarPasajero (pasajero);
        }
    }


   public void registrarAsientos(int numero,String letra){
        Asiento asiento=new Asiento (numero, letra);
        this.listaDeAsientos.add (asiento);
   }

    public String getModelo () {
        return modelo;
    }

    public List<Asiento> getListaDeAsientos () {
        return listaDeAsientos;
    }

    public String obtenerDatos() {
       String dato="";
       for(Asiento asiento:listaDeAsientos){
           dato+=asiento.toString ();
       }return dato;
    }
    public String toString(){
        return "\nModelo: "+modelo+obtenerDatos ();
    }
}
