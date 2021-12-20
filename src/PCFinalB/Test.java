package PCFinalB;

import java.util.List;

public class Test {
    public static void main (String[] args) {
        Ciudad ciudad=Ciudad.getInstance ();

        Persona persona1= (Persona) Factory.create ("Persona",String.valueOf (25000),"Juan","48273864","18/05/1981");
        Persona persona2= (Persona) Factory.create ("Persona",String.valueOf (27000),"Pedro","40156070","19/04/1991");
        Persona persona3= (Persona) Factory.create ("Persona",String.valueOf (38500),"Marcos","4016070","23/05/1891");

        Empresa empresa1= (Empresa) Factory.create ("Empresa",String.valueOf (70000),"Rixpd","2010054386");
        Empresa empresa2= (Empresa) Factory.create ("Empresa",String.valueOf (80000),"Portgas","2010054394");
        Empresa empresa3= (Empresa) Factory.create ("Empresa",String.valueOf (90000),"Roluya","20100543603");

        ciudad.registrarPersona (persona1);
        ciudad.registrarPersona (persona2);
        ciudad.registrarPersona (persona3);

        try {
            ciudad.registrarEmpresa (empresa1);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            ciudad.registrarEmpresa (empresa2);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            ciudad.registrarEmpresa (empresa3);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        List<Persona> listaPersonas=ciudad.getListaDePersonas ();
        for(Persona persona:listaPersonas){
            System.out.println (persona.toString ());
        }

        List<Empresa>listaEmpresas=ciudad.getListaDeEmpresas ();
        for(Empresa empresa:listaEmpresas){
            System.out.println (empresa.toString ());
        }


    }
}
