package com.upc.herencia;

public class Ejercicio1 {
    public static void main (String[] args) {
        ProfesorTC profesorTC1=new ProfesorTC ("21253C","Juan",
                "07565355",1500,0.12);
        ProfesorTP profesorTP1=new ProfesorTP ("705622","Jorge",
                "40205656",40,20);

        System.out.println ("Nombre: "+ profesorTC1.getNombre ()+"  "+profesorTC1.calcularSueldo ());
        System.out.println ("Nombre: "+ profesorTP1.getNombre ()+"  "+profesorTP1.calcularSueldo ());
    }

}
