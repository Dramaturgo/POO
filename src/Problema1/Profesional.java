package Problema1;

public class Profesional extends Concursante{

    private String institucion;
    private boolean concursoGanador;



    public Profesional(String nroDeDni,String nombre,String nombrePlato,double puntajeSabor,double puntajePresentacion,double puntajeOriginalidad,String institucion,boolean concursoGanador){
        super(nroDeDni,nombre,nombrePlato,puntajeSabor,puntajePresentacion,puntajeOriginalidad);
        this.institucion=institucion;
        this.concursoGanador=concursoGanador;
    }

    public boolean getConcursoGanador() {
        return concursoGanador;
    }

    public String getInstitucion() {
        return institucion;
    }


    public double puntajeFinal(){
        double bono=0;
        if(concursoGanador){
            bono=5.0;
        }
        return super.puntajeFinal()+bono;
    }

    public String listarConcursantes(){
        return super.listarConcursantes()+"Escuela: "+institucion;
    }




}
