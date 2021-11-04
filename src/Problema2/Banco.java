package Problema2;

import java.util.List;
import java.util.ArrayList;


public class Banco{

    private List<Trabajador>arregloTrabajadores;


    public Banco(){

        this.arregloTrabajadores=new ArrayList<>();

    }

    public void registrar(Trabajador t){
        arregloTrabajadores.add(t);
    }

    public List<Trabajador> getArregloTrabajadores(){
        return arregloTrabajadores;
    }

    public Trabajador busqueda(String dni){
        for(Trabajador t:this.arregloTrabajadores){
            if(t.getDni().equals(dni)){
                return t;
            }
        }return null;

    }

}
