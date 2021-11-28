package Cine;

public class Main {

    public static void main (String[] args) {
        EmpresaDeCine cinepolis=new EmpresaDeCine();
        Consola consola=Consola.getInstance ();

        SalaDeCine sala1=FactoriaDeSalas.crearSala ("SR","u4015","sala1","100","18","5.30");
        SalaDeCine sala2=FactoriaDeSalas.crearSala ("SR","U4016","sala2","80","17.30","4.90");
        SalaDeCine sala3=FactoriaDeSalas.crearSala ("S4D","U4017","sala3","60","21.50","aire-max-300","vib-max-550");
        SalaDeCine sala4=FactoriaDeSalas.crearSala ("S4D","U4018","sala4","70","23.20","aire-plus-250","vib-max-450");

        cinepolis.registrarSalas (sala1);
        cinepolis.registrarSalas (sala2);
        cinepolis.registrarSalas (sala3);
        cinepolis.registrarSalas (sala4);

       System.out.println (consola.ListarDatos (cinepolis));





    }
}