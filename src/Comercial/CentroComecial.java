package Comercial;

import java.util.ArrayList;
import java.util.List;

public class CentroComecial {

    List<Local>listaDeLocales;

    public CentroComecial(){

        this.listaDeLocales=new ArrayList<> ();
    }

    public void registrarLocales(Local local) throws Exception {
        local.validar ();
        this.listaDeLocales.add(local);
    }

    public double calcularAlquilerXZonas(String zona){
      double acumulado=0;
      for(Local l:this.listaDeLocales){
          if(l.getZona ().equals (zona)){
              acumulado+=l.calcularAlquiler ();
          }
      }return acumulado;

    }

    public Local localConmenorAlquiler(){
        double menor=listaDeLocales.get (0).calcularAlquiler ();
        Local localMenorAlquiler=null;
       for(Local l:this.listaDeLocales){
           if(l.calcularAlquiler ()<menor){
               menor=l.calcularAlquiler ();
               localMenorAlquiler=l;
           }
       }return localMenorAlquiler;

    }


    public List<Local> getListaDeLocales () {
        return listaDeLocales;
    }

    @Override
    public String toString () {
        return "CentroComecial{" +
                "listaDeLocales=" + listaDeLocales +
                '}';
    }
}
