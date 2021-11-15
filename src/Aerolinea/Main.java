package Aerolinea;

public class Main {

    public static void main (String[] args) {
    //REGISTRAR VUELOS,ASIENTOS
        Avion avion1=new Avion ("Comercial",12,"A");
        avion1.registrarAsientos (14,"C");
        avion1.registrarAsientos (15,"E");
        Avion avion2=new Avion ("Militar",13,"E");
        avion2.registrarAsientos (16,"A");
        avion2.registrarAsientos (17,"D");
        Avion avion3=new Avion ("Comercial",14,"A");
        avion3.registrarAsientos (15,"A");
        avion3.registrarAsientos (15,"E");

        Aerolinea aerolinea1=new Aerolinea ();

        aerolinea1.registrarVuelos ("u4030","Peru","Canada");
        aerolinea1.registrarVuelos ("u3015","EE.UU","Japon");
        aerolinea1.registrarVuelos ("u5070","Londres","Egypto");

        aerolinea1.asignarAvion("u4030",avion3);
        aerolinea1.asignarAvion ("u3015",avion1);
        aerolinea1.asignarAvion ("u5070",avion2);
        //BUSCAR VUELOS POR MODELO DE AVION
        System.out.println (aerolinea1.buscarVuelos ("Comercial"));
        //USAR EXCEPCION
        System.out.println (aerolinea1.buscarVuelos ("Carga"));





    }


}
