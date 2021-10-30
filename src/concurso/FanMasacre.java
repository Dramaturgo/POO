package concurso;

public class FanMasacre extends Participante{

    private String equipo;
    private int puntajeBarra;
    private int puntajeEquipo;


    public FanMasacre(String nombre,String apellido,String dni,int edad,int cantidadMensajesTxt,String equipo,int puntajeBarra,int puntajeEquipo){

        super(nombre,apellido,dni,edad,cantidadMensajesTxt);
        this.equipo=equipo;
        this.puntajeBarra=puntajeBarra;
        this.puntajeEquipo= puntajeEquipo;
    }

    public int calcularPuntaje(){
        int mensajes=this.getCantidadMensajesTxt();
        return(mensajes*4+this.puntajeBarra+puntajeEquipo*2);
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPuntajeBarra() {
        return puntajeBarra;
    }

    public void setPuntajeBarra(int puntajeBarra) {
        this.puntajeBarra = puntajeBarra;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }
}