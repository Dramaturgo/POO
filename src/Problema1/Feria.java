package Problema1;

import java.util.List;
import java.util.ArrayList;


public class Feria{

    private List<Concursante>arregloConcursantes;

    public Feria(){

        this.arregloConcursantes=new ArrayList<>();
    }


    public List<Concursante> getArregloConcursantes() {
        return arregloConcursantes;
    }


    public void registrarConcursantes(Concursante c){
        this.arregloConcursantes.add(c);
    }

    public String ganador (){
        double mayor=0;
        double mayorAmateur=0;
        Concursante ganador=null;
        Concursante amateurGanador=null;
        for(Concursante c:this.arregloConcursantes){
            if(c.puntajeFinal()>mayor){
                mayor=c.puntajeFinal();
                ganador=c;
            }
        }
        for(Concursante c:this.arregloConcursantes) {
            if (c.getClass ().getSimpleName ().equals ("Amateur")) {
                if (c.puntajeFinal () > mayorAmateur) {
                    mayorAmateur = c.puntajeFinal ();
                    amateurGanador = c;

                }
            }
        }
        return "Ganador general:\nNombre: "+ganador.getNombre()+"\nPlato: "+ganador.getNombrePlato()+"\nPuntaje :"+ganador.puntajeFinal()+
                "\n\nGanador Amateur:\nNombre: "+amateurGanador.getNombre ()+"\nPlato: "+amateurGanador.getNombrePlato ()+"\nPuntaje :"+amateurGanador.puntajeFinal ();

    }



}