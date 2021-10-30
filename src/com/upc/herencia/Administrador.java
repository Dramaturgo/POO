package com.upc.herencia;

import java.util.ArrayList;
import java.util.List;

public class Administrador {

    private List<Profesor>arregloPorfesores;

    public Administrador () {
        this.arregloPorfesores=new ArrayList<> ();
    }

    public void regitrar(Profesor profesor){
        this.arregloPorfesores.add (profesor);//va a contener obtener objetos de las clases
        // hijas del profesor

    }

    public double promedioDeSueldo(){
        double suma=0;
       for(Profesor p:this.arregloPorfesores){
           suma+=p.calcularSueldo ();
       }
        return(suma/this.arregloPorfesores.size ());
    }

    public List<Profesor> getArregloPorfesores () {
        return arregloPorfesores;
    }

    public void setArregloPorfesores (List<Profesor> arregloPorfesores) {
        this.arregloPorfesores = arregloPorfesores;
    }

    public Profesor buscarProfesor(String dni){

        for(Profesor p:this.arregloPorfesores){
            if(p.getDni()==dni){
                return p;
            }
        }return null;

}}
