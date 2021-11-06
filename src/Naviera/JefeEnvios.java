package Naviera;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JefeEnvios {

   private List<Naviera>arregloDeEnvios;


    public JefeEnvios (){

        this.arregloDeEnvios=new ArrayList<> ();

    }

    public void registrarEnvios(Naviera naviera){
        this.arregloDeEnvios.add (naviera);
    }



    public List<Naviera>validarCodigosRepetidos(){
        List<Naviera>ro=new ArrayList<> ();
        for (int i=0;i<arregloDeEnvios.size ()-1;i++){
            for (int j=i+1;j<arregloDeEnvios.size ();j++){
                if(Objects.equals (arregloDeEnvios.get (i).getCodigoEnvio (), arregloDeEnvios.get (j).getCodigoEnvio ())){
                    ro.add (arregloDeEnvios.get (i));
                }
            }
        }
        return  ro;
    }

    public List<Double> recibirCosto(String codigo){
        List<Double>ro=new ArrayList<> ();
        for (Naviera p:this.arregloDeEnvios) {
            if (p.getCodigoEnvio ().equals (codigo)){
                ro.add(p.calcularCosto ());
            }
        }return ro;

    }

    public List<Naviera>listarMaritimosCostos(){
       List<Naviera>ro=new ArrayList<> ();
       for (Naviera p:this.arregloDeEnvios){
           if (p.getClass ().getSimpleName ().equals ("Maritimo")){
               ro.add (p);
           }
       }

     return ro;
    }

    public double costoTotalEnvios(){
        double total=0;
        for (Naviera p:this.arregloDeEnvios) {

          total+=p.calcularCosto ();
        }
        return total;
    }



    public List<Naviera> getArregloDeEnvios () {
        return arregloDeEnvios;
    }

    public void setArregloDeEnvios (List<Naviera> arregloDeEnvios) {
        this.arregloDeEnvios = arregloDeEnvios;
    }



}
