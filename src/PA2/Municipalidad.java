package PA2;

import concurso.Participante;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {

    private String nombre;
    private List<Vehiculo>listaVehiculos;


    public Municipalidad (String nombre) {
        this.nombre = nombre;
        this.listaVehiculos=new ArrayList<> ();
    }

    public String getNombre () {
        return nombre;
    }

    public List<Vehiculo> getListaVehiculos () {
        return listaVehiculos;
    }

    public void registrarVehiculos(Vehiculo v){
        listaVehiculos.add (v);

    }

    public Vehiculo vehiculoMayorVelocidad(){
        double mayorVelocidad=0;
        Vehiculo max=null;
        for(Vehiculo v:this.listaVehiculos){
            if(v.calcularVelocidadMaxima ()>mayorVelocidad){
                mayorVelocidad=v.calcularVelocidadMaxima ();
                max=v;
            }
        }
          return max;
    }

    public Vehiculo busquedaVehiculo(String codigo){
        Vehiculo buscado=null;
        for(Vehiculo v:this.listaVehiculos){
            if(v.getCodigo ().equals (codigo)){
                buscado=v;
            }
        }
       return buscado;
    }



    public List<Bicicleta>busquedaBicicletas(String año){
        List<Bicicleta>ro=new ArrayList<> ();
        for(Vehiculo v:this.listaVehiculos){
            if(v instanceof Bicicleta b){
                if(b.getAñoCompra ().equals (año)){
                    ro.add (b);
                }
            }
        }return ro;


    }




}
