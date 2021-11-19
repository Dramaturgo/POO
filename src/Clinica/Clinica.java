package Clinica;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Paciente> pacientes;

    public Clinica() {
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void registrarPaciente(String documento, String nombres, int edad) {
        Paciente paciente = new Paciente(documento, nombres, edad);
        pacientes.add(paciente);
    }

    public Paciente buscarPaciente(String documento) {
        for (Paciente paciente: pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;
    }

    public void asignarHistorial(String documento, Historial historial) {
        Paciente paciente = buscarPaciente(documento);
        if (paciente != null) {
            paciente.asignarHistorial(historial);
        }
    }

    public List<Paciente> obtenerPacientesDePrioridad(String prioridad)throws Exception {
        List<Paciente> listadoAux = new ArrayList<>();
        for (Paciente paciente: pacientes) {
            if (paciente.obtenerPrioridad ().equals (prioridad)) {
                listadoAux.add (paciente);
            }
        }
        if(listadoAux.size ()==0) throw new Exception ("Prioridad Incorrecta");

        return listadoAux;
    }

}

