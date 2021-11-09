package PC1b;

import java.util.ArrayList;
import java.util.List;


public class Refrigeradora {

    private List<Producto>listaProductos;


    public Refrigeradora () {
        this.listaProductos = new ArrayList<> ();
    }

    public void registrarProductos(Producto p){

        listaProductos.add(p);
    }

    public double calcularTotalReferencial(){
        double total=0;
        for(Producto p:listaProductos){
            total+= p.calcularValorRefencial ();
        }
        return  total;
    }

    public String validarFrutaDulce(){
        String validar=null;
        int contador=0;
        for(Producto p:listaProductos){
            if(p instanceof Fruta ){
                if (((Fruta) p).getIndicador ().equals ("si")) {
                    contador++;
                }
            }if(contador>0){
                validar="Existe producto dulce en la refrigeradora";
            }else {
                validar="No existe producto dulce en la refrigeradora";
            }

        }return validar;

    }


    public List<Producto> getListaProductos () {
        return listaProductos;
    }
}
