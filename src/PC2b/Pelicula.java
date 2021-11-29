package PC2b;

public class Pelicula {

    private String nombre;

    public Pelicula (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return nombre;
    }


    @Override
    public String toString () {
        return "\nPelicula: "+nombre;
    }
}
