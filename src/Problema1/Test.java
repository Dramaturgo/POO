package Problema1;

import java.util.List;


public class Test{

    public static void main(String[] args) {

        Amateur amateur1=new Amateur("48273864","Miguel","Lomo Saltado",15.70,16.40,13.46);
        Amateur amateur2=new Amateur ("50143028","Joaquin","Aji de Gallina",17.4,18.1,13.6);
        DueñoDeRestaurante dueño1=new DueñoDeRestaurante("45306580","Pedro","Aji de Galiina",19.3,15.6,18.70);
        Profesional profesional1=new Profesional("55307560","Marco","Causa Limeña",13.40,17.90,18.70,"UCAL",true);

        Feria cintura=new Feria();

        cintura.registrarConcursantes(amateur1);
        cintura.registrarConcursantes (amateur2);
        cintura.registrarConcursantes(dueño1);
        cintura.registrarConcursantes(profesional1);
    //listar datos de concursantes
        System.out.println ("\nLos datos de los concursantes son los siguientes: ");
        List<Concursante>lista=cintura.getArregloConcursantes();
        for(Concursante c:lista){
            System.out.println(c.listarConcursantes());
        }
    //obtener ganador y su puntaje adicional el ganador de Amateur

        System.out.println("\n"+cintura.ganador ());


    }}
