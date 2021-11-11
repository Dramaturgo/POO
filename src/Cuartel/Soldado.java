package Cuartel;

public class Soldado extends  Ataque{

    private String nombre;
    private int  grado;

    public Soldado (String nombre, int  grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre () {
        return nombre;
    }

    public int  getGrado () {
        return grado;
    }

    public String ataque(){
        return "PIU PIU !!";
    }

    @Override
   public String toString (){
        return this.getClass ().getSimpleName ()+"\nNombre: "+nombre+"\nGrado: "+grado+"\nAtaque: "+ataque ()+"\n";
    }
}
