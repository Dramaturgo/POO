package concurso;

import java.util.ArrayList;
import java.util.List;

public class Administrador{

    private List<Participante>arregloParticipante;

    public Administrador(){
        this.arregloParticipante=new ArrayList<>();
    }

    public void registrar(Participante participante){
        this.arregloParticipante.add(participante);
    }

    public Participante buscarParticipante(String dni){
        for(Participante p:this.arregloParticipante){
            if(p.getDni ().equals (dni)){
                return p;
            }
        }
        return null;
    }

    public Participante Obtenerganador (){
        int mayor=0;
        Participante nuevo=null;
        for(Participante p:this.arregloParticipante){
            if(p.calcularPuntaje()>mayor&&p.getEdad ()>18){
                mayor=p.calcularPuntaje();
                nuevo=p;
            }
        }return nuevo;
    }

    public List<Participante> getArregloParticipante() {
        return arregloParticipante;
    }
    public void setArregloParticipante(List<Participante> arregloParticipante) {
        this.arregloParticipante = arregloParticipante;
    }

    public List<Participante>validarEdad(){
        List<Participante>ro=new ArrayList<>();
        for(Participante p:this.arregloParticipante){
            if (p.getEdad()<18) {
                ro.add(p);
            }
        }return ro;
    }
}