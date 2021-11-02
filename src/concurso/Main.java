package concurso;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        FanMasacre fanMasacre1=new FanMasacre("Jose","Perez","48273864",24,25,"MUERTE",150,130);
        FanMasacre fanMasacre2=new FanMasacre("Emilio","Flores","45667065",19,30,"equipo destruccion",165,120);
        FanMasacre fanMasacre3=new FanMasacre ("Carla","Flores","45223666",16,30,"Equipo nuclear",170,140);
        Televidente televidente1=new Televidente("Pedro","Ruiz","75184023",24,50,"986100453",100);
        Televidente televidente2=new Televidente("Carla","Moncayo","45306539",19,40,"97056310",120);

        Administrador administrador1=new Administrador();

//1-Registrar uno o mas participantes
        administrador1.registrar(fanMasacre1);
        administrador1.registrar(fanMasacre2);
        administrador1.registrar(fanMasacre3);
        administrador1.registrar(televidente1);
        administrador1.registrar(televidente2);



//2-Imprimir listado de participantes
        System.out.println("----------Lista De Participantes-------------\n");
        List<Participante>lista=administrador1.getArregloParticipante();
        for(Participante p:lista){
            if(p.getEdad()>18){
                System.out.println("Participante: "+p.getNombre()+" "+p.getApellido()+" obtuvo: "+p.calcularPuntaje()+" puntos");
            }
        }
        System.out.println("");
//Evaluar los nombres de equipo de la clase Masacre(equipo nuclear,muerte,destruccion)
        for (Participante p : lista) {
            if (p instanceof FanMasacre l) {
                if (! l.getEquipo ().equalsIgnoreCase ("equipo muerte") && ! l.getEquipo ().equalsIgnoreCase ("equipo nuclear") && ! l.getEquipo ().equalsIgnoreCase ("equipo destruccion")) {
                    System.out.println ("Ojo:\nEl nombre " + l.getEquipo () + " No se considera valido,revisa ");
                }
            }
        }
        System.out.println ("");

//3-Busqueda de participantes segun su dni
        System.out.println("----------Busqueda De Participantes-----------\n");
        String documento="48273864";
        Participante a=administrador1.buscarParticipante(documento);
        System.out.println ("El numero de Dni: "+documento+" le pertenece a la persona: ");
        if(a!=null){
            System.out.println(a.getNombre()+" "+a.getApellido()+" de "+a.getEdad()+" años");
        }else{
            System.out.println("No se encuentra registro del participante");
        }
        System.out.println("");

//4-Validar y Recibir un mensaje del ingreso de  un menor de 18 años
        System.out.println("----------Validar Edad De Participantes--------\n");
        for (Participante p:administrador1.validarEdad ()) {
            System.out.println("Participante "+p.getNombre()+" "+p.getApellido ()+" de la clase "+p.className()+" tiene que ser mayor de 18 años");
        }
        System.out.println ("");


//5-obtener el nombre del concursante Ganador y su puntaje
        System.out.println("----------Obtener Ganador-----------\n");

        Participante b=administrador1.Obtenerganador ();
        System.out.println ("Participante ganador : " + b.getNombre () + " " + b.getApellido () + "\nPuntaje Obtenido: " + b.calcularPuntaje ());

    }

}