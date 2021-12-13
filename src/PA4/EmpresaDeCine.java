package PA4;


import java.util.ArrayList;
import java.util.List;

public class EmpresaDeCine {

    List<SalaDeCine>listaDeSalas;


     public  EmpresaDeCine(){
        listaDeSalas=new ArrayList<> ();
    }

    public void registrarSalas(SalaDeCine s){
        this.listaDeSalas.add (s);
    }

    public List<SalaDeCine> getListaDeSalas () {
        return listaDeSalas;
    }
}
