package ExcepcionCuartel;


public class Soldado extends Atacante{

    private String nombre;
    private int grado;

    public Soldado(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public void validarGradoConExcepciones () throws Exception{
        if (this.grado>9||this.grado<1) throw new Exception("No es permitido un rango mayor a 9 o menor a 1");
    }


    public String atacar() {
        return "Piu!";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", grado=" + grado +
                '}';
    }
}