package PCFinalA;

public class Pasajero {

    private String dni;
    private String nombre;
    private int edad;
    private String nacionalidad;


    public Pasajero (String dni, String nombre, int edad, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getDni () {
        return dni;
    }

    public String getNombre () {
        return nombre;
    }

    public int getEdad () {
        return edad;
    }

    public String getNacionalidad () {
        return nacionalidad;
    }

    public String toString(){
        return "\nNombre: "+nombre+"\nDni: "+dni+"\nEdad: "+edad+"\nNacionalidad: "+nacionalidad;
    }
}
