package concurso;

public class Televidente extends Participante{

    private String nroSeguridad;
    private int cantidadLlamadas;


    public Televidente(String nombre,String apellido,String dni,int edad,int cantidadMensajesTxt,String nroSeguridad,int cantidadLlamadas){
        super(nombre,apellido,dni,edad,cantidadMensajesTxt);
        this.nroSeguridad= nroSeguridad;
        this.cantidadLlamadas = cantidadLlamadas;
    }

    public int calcularPuntaje(){
        int mensajes=this.getCantidadMensajesTxt();
        return(mensajes*4+this.cantidadLlamadas*3);
    }

    public int getCantidadLlamadas() {
        return cantidadLlamadas;
    }

    public void setCantidadLlamadas(int cantidadLlamadas) {
        this.cantidadLlamadas = cantidadLlamadas;
    }

    public String getNroSeguridad() {
        return nroSeguridad;
    }

    public void setNroSeguridad(String nroSeguridad) {
        this.nroSeguridad = nroSeguridad;
    }
}