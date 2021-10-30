package envios;

import java.lang.reflect.Field;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        Maritimo maritimo1 = new Maritimo ("u4015", 4, 100.35, "Aje Export sac");
        Maritimo maritimo2 = new Maritimo ("u3090",3,170.64,"Invernadero sac");
        Ultramaritimo ultramaritimo1=new Ultramaritimo ("u4015",5,130.64,"u4015","Jorge Muñoz");
        Ultramaritimo ultramaritimo2=new Ultramaritimo ("u1435",4,190.64,"FD466","Luis Vargas");

        JefeEnvios jefeEnvios1=new JefeEnvios ();
    //1-registrar uno o mas envios
        jefeEnvios1.registrarEnvios (maritimo1);
        jefeEnvios1.registrarEnvios (maritimo2);
        jefeEnvios1.registrarEnvios (ultramaritimo1);
        jefeEnvios1.registrarEnvios (ultramaritimo2);

        System.out.println ("\n------------Validar registro------------------\n");
        List<Naviera> lista=jefeEnvios1.getArregloDeEnvios ();
        for (Naviera p:lista) {
            if(p.getCategoriaEnvio ()>3&&p.getCategoriaEnvio ()!=0&&p.getClass ().getSimpleName ().equals ("Maritimo")){
                System.out.println ("Los envios modo "+p.getClass ().getSimpleName ()+" solo pueden ser 1,2 o 3 ,corregir");
            }else if(p.getCategoriaEnvio ()>5||p.getCategoriaEnvio ()<3&&p.getCategoriaEnvio ()!=0&&p.getClass ().getSimpleName ().equals ("Ultramaritimo")){
                System.out.println ("Los envios modo "+p.getClass ().getSimpleName ()+" solo pueden ser 3,4 o 5 ,corregir");
            }
        }

    //2-validar duplicidad de codigos
        System.out.println ("\n------------Validar codigos repetidos------------------\n");
        for (Naviera p:jefeEnvios1.validarCodigosRepetidos ()) {
            System.out.println ("los siguientes codigos estan repetidos: "+p.getCodigoEnvio ());
        }
    //3-Recibir costo a partir de un codigo
        System.out.println ("\n------------Costo a partir de un codigo------------------\n");
        String codigoBuscado="u4015";
        for (Double p: jefeEnvios1.recibirCosto (codigoBuscado)) {
            System.out.println ("El costo de envio del codigo " + codigoBuscado + " es de: " + p + " soles");
        }

    //4-Imprimir todos los envios Maritimos con su respectivo costo
        System.out.println ("\n------------Listar envios maritimos con su costo------------------\n");
        int i=1;
        for (Naviera p: jefeEnvios1.listarMaritimosCostos ()){
            if(p instanceof Maritimo f){
            System.out.println ("Envio Martimo "+i+" :\nCodido de Envio: "+f.getCodigoEnvio ()+" | Categoria: "+f.getCategoriaEnvio ()+" | Volumen Metrico: "+f.getVolumenMetrico ()+" | Razon social: " + f.getRazonSocial ()+
                    " | Costo total: "+f.calcularCosto ()+" soles");
            i++;
            }
        }
    //5-Calcular costo total de envios
        System.out.println ("\n------------Listar costo total de envios------------------\n");
        System.out.println ("El costo total es de :"+jefeEnvios1.CostoTotalEnvios ()+" soles");
    }


}
