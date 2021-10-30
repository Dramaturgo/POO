package EjercicioGrupal;

public  abstract class Participante {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int cantidadMensajeTxt;

    public Participante (String nombre, String apellido, String dni, int edad, int cantidadMensajeTxt) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.cantidadMensajeTxt = cantidadMensajeTxt;
    }

    public Participante () {
    }

    public abstract boolean validarParticipacion();
    public abstract double calcularPuntaje();

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido () {
        return apellido;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public String getDni () {
        return dni;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public int getEdad () {
        return edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getCantidadMensajeTxt () {
        return cantidadMensajeTxt;
    }

    public void setCantidadMensajeTxt (int cantidadMensajeTxt) {
        this.cantidadMensajeTxt = cantidadMensajeTxt;
    }
}
