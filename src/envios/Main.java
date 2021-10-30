package envios;

import java.lang.reflect.Field;
import java.util.List;

public class Main {


    public static void main (String[] args) {


        Maritimo maritimo1 = new Maritimo ("u4015", 2, 100.35, "Aje Export sac");
        Maritimo maritimo2 = new Maritimo ("u3090",3,170.64,"Invernadero sac");
        Ultramaritimo ultramaritimo1=new Ultramaritimo ("u1435",5,130.64,"u4015","Jorge Muñoz");
        Ultramaritimo ultramaritimo2=new Ultramaritimo ("u1435",4,190.64,"FD466","Luis Vargas");

        JefeEnvios jefeEnvios1=new JefeEnvios ();

        jefeEnvios1.registrarEnvios (maritimo1);
        jefeEnvios1.registrarEnvios (maritimo2);
        jefeEnvios1.registrarEnvios (ultramaritimo1);
        jefeEnvios1.registrarEnvios (ultramaritimo2);

        List<Naviera> lista=jefeEnvios1.getArregloDeEnvios ();

        for (Naviera p:lista) {
            System.out.println (p.getCodigoEnvio ()+" "+p.calcularCosto ()+" ");
        }


        for (Naviera p:jefeEnvios1.validarCodigosRepetidos ()) {
            System.out.println ("los siguientes codigos estan repetidos "+p.getCodigoEnvio ());
        }
        int i=1;
        for (Naviera p: jefeEnvios1.listarMaritimosCostos ()){
            if(p instanceof Maritimo f){
            System.out.println ("Envio Martimo "+i+" : "+
                 "Codido de Envio: "+f.getCodigoEnvio ()+"\n"+
                    "Categoria: "+f.getCategoriaEnvio ()+"\n"+
                    "Volumen Metrico: "+f.getVolumenMetrico ()+"\n"+
                "Razon social: " + f.getRazonSocial ());
            }
        }







       // System.out.println (jefeEnvios1.recibirCosto ("u3090"));


    }


}
