package Terminal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("A)");
        System.out.println("B)");
        System.out.println("C)");

        Terminal terminalNorte = new Terminal();

        terminalNorte.registrarViaje("VIA01", "01/01/2021", 1250, "Cusco");
        terminalNorte.registrarViaje("VIA02", "05/04/2023", 1503, "Piura");
        terminalNorte.registrarViaje("VIA03", "07/08/2022", 4500, "Cancun");
        terminalNorte.registrarViaje("VIA04", "09/11/2022", 3000, "Tumbes");

        Bus busA = new Bus("COD01", 35, 1, "MOTOR-XC1", 16, "A1", 95);
        Bus busB = new Bus("COD02", 25, 2, "MOTOR-WSX1", 12, "A9", 50);
        Bus busC = new Bus("COD03", 30, 3, "MOTOR-MXMX", 14, "A5", 55);
        Bus busD = new Bus("COD04", 45, 1, "MOTOR-WWW", 15, "A0", 120);

        busA.registrarAsiento("B0", 30);
        busB.registrarAsiento("B1", 55);
        busC.registrarAsiento("C3", 59);
        busD.registrarAsiento("D10", 120);


        terminalNorte.asignarBusAViaje("VIA01", busA);
        terminalNorte.asignarBusAViaje("VIA02", busB);
        terminalNorte.asignarBusAViaje("VIA03", busD);
        terminalNorte.asignarBusAViaje("VIA04", busC);

        System.out.println("Viajes registrados:");
        System.out.println("==================");

        List<Viaje> viajesRegistrados = terminalNorte.getListaViajes();
        for (Viaje viaje: viajesRegistrados) {
            System.out.println(viaje);
        }

        System.out.println("D)");
        System.out.println("Viajes en categoria especifica:");
        System.out.println("==============================");

        List<Viaje> viajesCategoriaEsp = new ArrayList<>();
        try {
            viajesCategoriaEsp = terminalNorte.obtenerViajesConBusDeCategoria(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Viaje viaje: viajesCategoriaEsp) {
            System.out.println(viaje);
        }

        System.out.println("E)");
        System.out.println("Viajes en categoria especifica:");
        System.out.println("==============================");
        viajesCategoriaEsp = new ArrayList<>();
        try {
            viajesCategoriaEsp = terminalNorte.obtenerViajesConBusDeCategoria(8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Viaje viaje: viajesCategoriaEsp) {
            System.out.println(viaje);
        }

    }
}
