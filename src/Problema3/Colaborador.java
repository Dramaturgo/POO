package Problema3;

public class Colaborador extends Trabajador{


    public Colaborador(String dni,String nombre,String apellido,String fechaDeNacimiento,String profesion,int horasSemanales,double tarifaHora){

        super(dni,nombre,apellido,fechaDeNacimiento,profesion,horasSemanales,tarifaHora);

    }

    public  double  calcularSueldoBruto(){

        return  (super.getHorasSemanales ()*4)*super.getTarifaHora ();
    }

}