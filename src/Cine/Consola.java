package Cine;

import java.util.List;

public class Consola {

    private static Consola consola=new Consola ();

    public static Consola getInstance(){
        return consola;
    }

    public String ListarDatos(EmpresaDeCine cine){
        String datos="";
        List<SalaDeCine>lista=cine.getListaDeSalas ();

        for(SalaDeCine s:lista){
            datos+=s.toString ()+
                    "Monto total: "+s.montoTotal ()+"\n";
        }
        return datos;
    }
}
