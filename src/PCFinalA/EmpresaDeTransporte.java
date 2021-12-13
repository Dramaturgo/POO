package PCFinalA;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeTransporte {

    private List<Viaje>listaDeViajes;

    //Patron Singleton
    private static EmpresaDeTransporte empresaDeTransporte = new EmpresaDeTransporte ();
    public static EmpresaDeTransporte getInstance () {
        return empresaDeTransporte;
    }

    public EmpresaDeTransporte () {

        this.listaDeViajes = new ArrayList<> ();
    }

    public List<String>codigosDeViaje(){
        List<String>listaDeCodigos=new ArrayList<> ();
        for(Viaje viaje:listaDeViajes){
            listaDeCodigos.add (viaje.getCodigoUnico ());
        }return listaDeCodigos;
    }

    public void registrarViajes(String codigoUnico, String origen, String destino)throws Exception{
         Viaje viaje=new Viaje (codigoUnico, origen, destino);
         boolean existe=codigosDeViaje ().contains (viaje.getCodigoUnico ());
         if(existe)throw new Exception ("\nCodigo de viaje ya registrado");
         else {
             this.listaDeViajes.add (viaje);
         }
    }



    public Viaje obtenerViaje(String codigoUnico){
        for(Viaje viaje:listaDeViajes){
            if(viaje.getCodigoUnico ().equals (codigoUnico)){
                return viaje;
            }
        }return null;
    }

    public void asignarBus(Bus bus,String codioUnico){
        Viaje viaje=obtenerViaje (codioUnico);
        if(viaje!=null){
            viaje.asignarBus (bus);
        }
    }

    public String toString(){
        String dato="";
        for(Viaje viaje:listaDeViajes){
            dato+=viaje.toString ();
        }return dato;
    }

}
