package concurso;

public abstract class Participante{

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int cantidadMensajesTxt;


    public Participante(String nombre,String apellido,String dni,int edad,int cantidadMensajesTxt){
        this.nombre=nombre;
        this.apellido = apellido;
        this.dni= dni;
        this.edad = edad;
        this.cantidadMensajesTxt= cantidadMensajesTxt;
    }

    public Participante(){

    }

    public abstract int calcularPuntaje();

    public int getCantidadMensajesTxt() {
        return cantidadMensajesTxt;
    }

    public void setCantidadMensajesTxt(int cantidadMensajesTxt) {
        this.cantidadMensajesTxt = cantidadMensajesTxt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String className() {
        return this.getClass().getSimpleName();
    }


}