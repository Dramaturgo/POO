package PC2b;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    List<Sala>listaDeSalas;

    public Cine () {
        this.listaDeSalas = new ArrayList<> ();
    }

    public void asignarSala(String codigo){
        Sala sala=new Sala (codigo);
        listaDeSalas.add(sala);
    }

    public Sala buscarSala(String codigo){
        for(Sala s:listaDeSalas){
            if(s.getCodigo ().equals (codigo)){
                return s;
            }
        }return null;
    }

    public void asignarPelicula(String codigo,Pelicula pelicula){
        Sala sala=buscarSala (codigo);
        if(sala!=null){
            sala.asignarPelicula (pelicula);
        }
    }

    public void asignarAsiento(String codigo,int fila,String letra,String categoria)throws Exception{
        Sala sala=buscarSala (codigo);
        if(sala!=null){
            sala.asignarAsiento (fila, letra, categoria);
        }
        if(sala==null)throw new Exception ("Sala no encontrada");
    }



    public List<Sala> getListaDeSalas () {
        return listaDeSalas;
    }

    public String toString(){
        String datos="";
        for(Sala s:this.listaDeSalas){
            datos+=s.toString ();
        }
        return datos;
    }
}
