package Problema3;

public class Asesor extends Trabajador{

    private int horasDedicadasPorMes;


    public Asesor(String dni,String nombre,String apellido,String fechaDeNacimiento,String profesion,int horasSemanales,double tarifaHora,int horasDedicadasPorMes){

        super(dni,nombre,apellido,fechaDeNacimiento,profesion,horasSemanales,tarifaHora);
        this.horasDedicadasPorMes=horasDedicadasPorMes;
    }

    public  double  calcularSueldoBruto(){

        return  horasDedicadasPorMes*super.getTarifaHora ();
    }

    public int getHorasDedicadasPorMes () {
        return horasDedicadasPorMes;
    }
}