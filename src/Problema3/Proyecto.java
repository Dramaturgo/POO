package Problema3;

import java.util.ArrayList;
import java.util.List;

public class Proyecto  {

    private String codigo;
    private String descripcion;
    private String año;
    private double presupuesto;
    private String zona;
    List<Trabajador>arregloTrabajadores;

    public Proyecto(String codigo,String descripcion,String año,double presupuesto,String zona){

        this.codigo=codigo;
        this.descripcion=descripcion;
        this.año=año;
        this.presupuesto=presupuesto;
        this.zona=zona;
        this.arregloTrabajadores=new ArrayList<> ();

    }

    public void registrar(Trabajador t){
        if(zona.equalsIgnoreCase ("Norte")){
            t.setBono (0.10);
        }else if(zona.equalsIgnoreCase ("Costa central")){
            t.setBono (0.20);
        }else if(zona.equalsIgnoreCase ("Sur")){
            t.setBono (0.30);
        }else{
            t.setBono (-1);
        }
        this.arregloTrabajadores.add(t);
    }

    public String listarSegunTipo(String tipoDeTrabajador){
        String datos="";
        for(Trabajador t:arregloTrabajadores){
            if(tipoDeTrabajador.equals ("Colaborador")){
                if(t instanceof Colaborador c) {
                    datos += c.listarDatos () ;
                }
            }else if(tipoDeTrabajador.equals ("Asesor")) {
                if (t instanceof Asesor a) {
                    datos += t.listarDatos () ;
                }
            }
        }
        return datos;
    }


    public boolean validarPresupuesto(){
        boolean validar;
        double sueldos=0;
        for(Trabajador t:arregloTrabajadores){
             sueldos+= t.calcularSueldoNeto ();
        }
        if(sueldos>presupuesto){
            validar=false;
        }else{
            validar=true;
        }

        return validar;
    }


    public String getZona () {return zona;}

    public double getPresupuesto() {
        return presupuesto;
    }

    public String getAño() {
        return año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

}
