package PC1a;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Cliente>listaClientes;

    public Tienda () {
        this.listaClientes = new ArrayList<> ();
    }

    public void registrarClientes(Cliente c){

        listaClientes.add(c);

    }

    public String verificarVIP1(){
        int cont=0;
        String verificar=null;
        for(Cliente c:listaClientes){
            if(c instanceof ClienteVIP){
                if(((ClienteVIP) c).getNivel ()==1) {
                    cont++;
                }
                    if(cont!=0){
                        verificar="Se encontraron VIP en nivel 1";
                    }else{
                        verificar="No se encontraron VIP en nivel 1";
                    }

            }
        }return verificar;
    }

    public List<Cliente> getListaClientes () {
        return listaClientes;
    }
}
