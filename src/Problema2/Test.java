package Problema2;

import java.util.List;


public class Test{

    public static void main(String[] args) {

        Contratado contratado1= new Contratado("48273864","Walter","Calle los hornos 185","Walter14@gmail.com",1800,15100);
        Fijo fijo1=new Fijo("018455346","Miguel","Viña alta 472 La Molina","Miguel_rd@hotmail.com",1900,8,3);

        Banco banco1=new Banco();


        banco1.registrar(contratado1);
        banco1.registrar(fijo1);

        List<Trabajador>lista=banco1.getArregloTrabajadores();
        System.out.println("-------Lista de Trabajadores-----------\n");
        for(Trabajador t:lista){
            System.out.println(t.listarTrabajadores());
        }

        Trabajador trabajador=banco1.busqueda("48273864");
        if(trabajador!=null){
            System.out.println("----------Busqueda de Trabajadores---------\n");
            System.out.println(trabajador.listarTrabajadores());
        }else{
            System.out.println("No se encontro el trabajador");
        }




    }
}