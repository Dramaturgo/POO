package EjercicioGrupal;

public class FanMasacre extends Participante{

    private String equipo;
    private int puntajeBarra;
    private int puntajeEquipo;



    public boolean validarParticipacion(){
     if (this.getEdad ()<18){
         return false;
     }else {
      return true;
    }
       }
    public double calcularPuntaje(){
        return (this.getCantidadMensajeTxt ()*4+puntajeBarra+puntajeEquipo*2);
    }

}
