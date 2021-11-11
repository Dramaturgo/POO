package Cuartel;


public class Main {

    public static void main (String[] args) {

        Soldado soldado1=new Soldado ("Miguel",3);
        Soldado soldado2=new Soldado ("Rafael",5);
        Soldado soldado3=new Soldado ("Oscar",6);
        Tanque tanque1=new Tanque ("Bulster","AK42","Calibre 20");
        Tanque tanque2=new Tanque ("Nimbus","AL90","Calibre 30");
        Tanque tanque3=new Tanque ("Asalto","AT90","Calibre 25");

        Cuartel cuartel1=new Cuartel ("C2030R","Usares de Junin");

        cuartel1.registrarSoldado (soldado1);
        cuartel1.registrarSoldado (soldado2);
        cuartel1.registrarSoldado (soldado3);
        cuartel1.registrarTanque (tanque1);
        cuartel1.registrarTanque (tanque2);
        cuartel1.registrarTanque (tanque3);
        System.out.println ("------SOLDADOS----------");
        for (Soldado s:cuartel1.getArregloSoldados ()){
            System.out.println (s.toString ());
        }
        System.out.println ("------TANQUES-------------");
        for (Tanque t: cuartel1.getArregloTanques ()){
            System.out.println (t.toString ());
        }
        System.out.println ("-------CUARTEL--------");
        System.out.println (cuartel1.ListarDatosCuartel ());
    }
}
