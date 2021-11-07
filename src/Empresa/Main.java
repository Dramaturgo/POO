package Empresa;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("A)");
        System.out.println("===");

        Empresa empresa = new Empresa();

        Destacado trabajadorA = new Destacado("19913456", "Jose Torres", "Calle Lemos 105", "Operaciones", 1200, 0.005);
        Destacado trabajadorB = new Destacado("19995444", "Carla Matos", "Av Marina 104", "Administracion", 1800, 0.0076);
        Nombrado trabajadorC = new Nombrado("94943932", "Sofia Soto", "Echenique 100", "Riesgo", 2500, "B");
        Nombrado trabajadorD = new Nombrado("59094939", "Rodolfo Flores", "Polo sn", "Legal", 3500, "A");
        Temporal trabajadorE = new Temporal("49392392", "Matilde Maza", "Faucett 1030", "Administracion", 150);
        Temporal trabajadorF = new Temporal("48311222", "Cesar Rivera", "Pardo 1200", "Legal", 450);
        Temporal trabajadorG = new Temporal("48311222", "Mirta Gonzales", "Marina 1200", "Producto", 580);

        trabajadorE.setHorasTrabajadas(25);
        trabajadorF.setHorasTrabajadas(45);

        empresa.registrarTrabajador(trabajadorA);
        empresa.registrarTrabajador(trabajadorB);
        empresa.registrarTrabajador(trabajadorC);
        empresa.registrarTrabajador(trabajadorD);
        empresa.registrarTrabajador(trabajadorE);
        empresa.registrarTrabajador(trabajadorF);

        System.out.println("B)");
        System.out.println("===");

        List<Trabajador> trabajadoresRegistrados = empresa.getTrabajadores();
//        for (Trabajador t: trabajadoresRegistrados) {
//            System.out.println(t.getDocumento() + " " + t.getNombres() + " " + t.getDireccion()
//                    + " " + t.getAreaTrabajo() + " \n Sueldo Final: S/" + t.calcularSueldoFinal());
//            if (t instanceof Destacado) {
//                System.out.println(((Destacado) t).getSueldo() + " " + ((Destacado) t).getPorcentajeParticipacion());
//            }
        // ... agregar otros casos
//        }
        for (Trabajador trabajador: trabajadoresRegistrados) {
            System.out.println(trabajador);
        }

        System.out.println("C)");
        System.out.println("===");

        double planillaTotal = empresa.obtenerMontoTotalPagarTemporales();
        System.out.println("El monto total a pagar es: S/" + planillaTotal);

        System.out.println("D)");
        System.out.println("===");

        System.out.println("Intentar registrar un trabajador previamente registrado");
        empresa.registrarTrabajador(trabajadorF);
        empresa.registrarTrabajador(trabajadorF);
        empresa.registrarTrabajador(trabajadorF);
        empresa.registrarTrabajador(trabajadorF);
        empresa.registrarTrabajador(trabajadorF);
        empresa.registrarTrabajador(trabajadorG);

        for (Trabajador trabajador: trabajadoresRegistrados) {
            System.out.println(trabajador);
        }

    }
}

