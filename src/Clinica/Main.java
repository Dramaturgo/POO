package Clinica;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        System.out.println("C)");
        Clinica clinicaJP = new Clinica();
        clinicaJP.registrarPaciente("14536231", "Jose Torres", 25);
        clinicaJP.registrarPaciente("59839921", "Carlos Flores", 20);
        clinicaJP.registrarPaciente("15134236", "Sofia Cardenas", 22);

        Historial historialA = new Historial("HIS01");
        historialA.registrarVisita("12/11/2021", "Operacion laser", 3500);
        historialA.registrarVisita("13/11/2021", "Evaluacion preventiva", 7650);

        Historial historialB = new Historial("HIS02");
        historialB.registrarVisita("12/11/1990", "Tratamiento piel", 2000);
        historialB.registrarVisita("08/10/195", "Revision mensual", 190);

        Historial historialC = new Historial("HIS03");
        historialC.registrarVisita("05/01/2009", "Operacion rodilla", 100);
        historialC.registrarVisita("06/04/2019", "Revision", 250);

        clinicaJP.asignarHistorial("59839921", historialA);
        clinicaJP.asignarHistorial("15134236", historialB);
        clinicaJP.asignarHistorial("14536231", historialC);

        List<Paciente> pacientesRegistrados = clinicaJP.getPacientes();
        for (Paciente paciente: pacientesRegistrados) {
            System.out.println(paciente);
        }

        System.out.println("D)");

        List<Paciente> pacientesDePrioridad = clinicaJP.obtenerPacientesDePrioridad("Baja");
        for (Paciente paciente: pacientesDePrioridad) {
            System.out.println(paciente);
        }

    }
}
