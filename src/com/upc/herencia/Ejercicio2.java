package com.upc.herencia;

import java.util.List;
public class Ejercicio2 {
    public static void main (String[] args) {

        ProfesorTC profesorTC=new ProfesorTC ("82322","Pepe","48273864",
                1000,0.12);
        ProfesorTP profesorTP=new ProfesorTP ("856565","Carmen","58565646",
                40,20);

        Administrador administrador1=new Administrador ();

        administrador1.regitrar (profesorTC);
        administrador1.regitrar (profesorTP);

        System.out.println ("Sueldo Promedio "+administrador1.promedioDeSueldo ());
        System.out.println ("---------------------------------------");
        List<Profesor>lista=administrador1.getArregloPorfesores ();

        for(Profesor p:lista){
            System.out.println (p.getNombre ());
        }

        Profesor profe=administrador1.buscarProfesor ("58565646");

        if(profe!=null){
            System.out.println (profe.getNombre ()+"  "+profe.calcularSueldo ());
        }else{
            System.out.println ("No esta registrado");
        }

    }
}
