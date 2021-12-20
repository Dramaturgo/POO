package PC2a;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Pelicula>listaDePelicula;


    public Tienda () {
        this.listaDePelicula = new ArrayList<> ();
    }

    public void registrarPeliculas(Pelicula pelicula){
        this.listaDePelicula.add(pelicula);
    }

    public List<Pelicula> obtenerPeliculas(String nacionalidad){
        List<Pelicula>lista=new ArrayList<> ();
        for(Pelicula pelicula:listaDePelicula){
            for(Actor actor: pelicula.getListaDeActores ()){
                if(actor.getNacionalidad ().equals(nacionalidad)){
                    lista.add(pelicula);
                }
            }
        }
        return  lista;
    }


}
