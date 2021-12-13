package PCFinalA;

public class Test {
    public static void main (String[] args) {

        EmpresaDeTransporte civa=EmpresaDeTransporte.getInstance ();

        Bus bus1=Factory.createBus ("Volkswagen");
        Bus bus2=Factory.createBus ("Ford");
        Bus bus3=Factory.createBus ("Toyota");

        bus1.registrarAsientos (5,"A");
        bus1.registrarAsientos (8,"C");
        bus2.registrarAsientos (7,"D");
        bus2.registrarAsientos (6,"F");
        bus3.registrarAsientos (9,"A");
        bus3.registrarAsientos (17,"C");

        Pasajero pasajero1=Factory.createPersona ("48273864","Juan","45","Peruana");
        Pasajero pasajero2=Factory.createPersona ("10156070","Miguel","36","Colombiana");
        Pasajero pasajero3=Factory.createPersona ("10203090","Felipe","54","Peruana");
        Pasajero pasajero4=Factory.createPersona ("10607090","Maria","54","Peruana");
        Pasajero pasajero5=Factory.createPersona ("20403090","Juana","36","Brasilera");
        Pasajero pasajero6=Factory.createPersona ("40605070","Marcela","26","Peruana");

        bus1.registrarPasajeros (pasajero1);
        bus1.registrarPasajeros (pasajero2);
        bus2.registrarPasajeros (pasajero3);
        bus2.registrarPasajeros (pasajero4);
        bus3.registrarPasajeros (pasajero5);
        bus3.registrarPasajeros (pasajero6);

        bus1.asignarPasajeroyAsiento ("48273864",5);
        bus1.asignarPasajeroyAsiento ("10156070",8);
        bus2.asignarPasajeroyAsiento ("10203090",7);
        bus2.asignarPasajeroyAsiento ("10607090",6);
        bus3.asignarPasajeroyAsiento ("20403090",9);
        bus3.asignarPasajeroyAsiento ("40605070",17);

        try {
            civa.registrarViajes ("u10","Lima","Cuzco");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            civa.registrarViajes ("u11","Lima","Trujillo");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            civa.registrarViajes ("u12","Lima","Talara");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }



        civa.asignarBus (bus1,"u10");
        civa.asignarBus (bus2,"u11");
        civa.asignarBus (bus3,"u12");



        System.out.println (civa.toString ());

    }
}
