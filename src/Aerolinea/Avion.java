package Aerolinea;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private  String modelo;
    private List<Asiento>arregloAsientos;
    private Asiento asiento;

    public Avion (String modelo,int numero,String letra) {
        this.modelo = modelo;
        this.arregloAsientos = new ArrayList<Asiento> ();
        this.asiento=new Asiento(numero,letra);
    }

    public void registrarAsientos(int numero,String letra) {
        if (this.asiento.getNumero () != numero) {//comparo el numero del asiento que viene con el avion para asignar diferentes numeros
                Asiento asiento2 = new Asiento (numero, letra);
                arregloAsientos.add (asiento2);
        }
    }

    public String getModelo () {
        return modelo;
    }

    public List<Asiento> getArregloAsientos () {
        return arregloAsientos;
    }

    public String listarAsientos(){
        String lista="";
        for(Asiento a:this.arregloAsientos){
           lista+="\nNumero: "+a.getNumero ()+"     Letra: "+a.getLetra ()+"   Precio: "+a.getPrecio ();
        }
        return lista;
    }
    @Override
    public String toString () {
        return "\nDatos del Avion:" +
                "\nModelo: " + modelo +
                "\nAsientos:"+ listarAsientos () + asiento;
    }
}
