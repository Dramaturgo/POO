package EjemploPC1;

import java.util.List;
import java.util.ArrayList;


public class Almacen{

    private List<Producto>arregloProducto;

    public Almacen(){

        this.arregloProducto=new ArrayList<>();
    }

    public void registrar(Producto p){

        this.arregloProducto.add(p);
    }

    public double porcentajeDeRiesgo(){
        double porcentaje=0;
        int totalProductos=this.arregloProducto.size();
        int cont=0;
        for(Producto p:this.arregloProducto){
            if(p.riesgoProducto().equals("Alto")){
                cont++;
            }
        }
        porcentaje=(cont*100)/(totalProductos*1.0);
        return porcentaje;

    }

    public String listarPorTipo(String tipoProducto) {
        String datos = "";
        for (Producto p : this.arregloProducto) {
            if (tipoProducto.equals ("Liquido")) {
                if (p instanceof Liquido l) {
                    datos += l.listarDatos ()+"\n";
                }
            } else if (tipoProducto.equals ("Solido")) {
                if (p instanceof Solido s) {
                    datos += s.listarDatos ()+"\n";

                }
            }
        }return datos;
    }

    public List<Producto>getArregloProducto(){
        return arregloProducto;
    }


}
