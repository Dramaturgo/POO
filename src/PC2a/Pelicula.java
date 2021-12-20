package PC2a;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String codigo;
    private String nombre;
    private Categoria categoria;
    private List<Actor>listaDeActores;

    public Pelicula (String codigo, String nombre ,Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaDeActores = new ArrayList<> ();
    }

    public void registrarActores(String nombreDelActor,String nacionalidad){
        Actor actor=new Actor (nombreDelActor,nacionalidad);
        this.listaDeActores.add(actor);
    }

    public String validarCategoria() {
        String apto;
        String aux=categoria.getNombreDeCategoria ();
        if(aux.equalsIgnoreCase ("Terror")||aux.equalsIgnoreCase ("Suspenso")||aux.equalsIgnoreCase ("Accion")){
            apto="No apto para menores de edad";
        }else{
            apto="Apto para menores de edad";
        }return apto;
    }

   /* public List<Actor> obtener(String nacionalidad){
        List<Actor>listaDeActorePorNacionalidad=new ArrayList<> ();
        for(Actor actor:listaDeActores){
            if(actor.getNacionalidad ().equals (nacionalidad)){
                listaDeActores.add (actor)
            }
        }
    }*/


    public String getCodigo () {
        return codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public Categoria getCategoria () {
        return categoria;
    }

    public List<Actor> getListaDeActores () {
        return listaDeActores;
    }
}
