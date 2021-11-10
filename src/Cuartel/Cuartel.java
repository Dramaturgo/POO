package Cuartel;

import java.util.ArrayList;
import java.util.List;

public class Cuartel {
 private String codigo;
 private String nombre;
 private List<Soldado>arregloSoldados;
 private List<Tanque>arregloTanques;


    public Cuartel (String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arregloSoldados = new ArrayList<>();
        this.arregloTanques = new ArrayList<>();
    }

    public double capacidadDeAtaque(){
        int suma=0;
        double  capacidad=0;
        for(Soldado s:this.arregloSoldados){
            suma+=s.getGrado ();
        }
        capacidad=(double)suma/this.arregloSoldados.size ();
        return capacidad;
    }

    public String ListarDatosCuartel(){
        return this.getClass ().getSimpleName ()+"\nCodigo: "+codigo+"\nNombre: "+nombre+"\nCapacidad de Ataque: "+String.format ("%.2f",capacidadDeAtaque ());
    }

    public void registrarSoldado(Soldado s){
        if(s.getGrado ()>=1&&s.getGrado ()<=9){
            this.arregloSoldados.add (s);
        }
    }
    public void registrarTanque(Tanque t){
        this.arregloTanques.add (t);
    }

    public String getCodigo () {
        return codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public List<Soldado> getArregloSoldados () {
        return arregloSoldados;
    }

    public List<Tanque> getArregloTanques () {
        return arregloTanques;
    }

    @Override
    public String toString () {
        return "Cuartel{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", arregloSoldados=" + arregloSoldados +
                ", arregloTanques=" + arregloTanques +
                '}';
    }
}
