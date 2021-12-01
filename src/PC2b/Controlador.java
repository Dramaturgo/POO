package PC2b;

public class Controlador {

    private Vista vista;
    private Cine cine;

    public Controlador (Vista vista, Cine cine) {
        this.vista = vista;
        this.cine = cine;
    }

    public void asignarAsientos (String codigo,int fila,String letra,String categoria) {
        try {
            cine.asignarAsiento (codigo, fila, letra, categoria);
        } catch (Exception e) {
            vista.mostrarExcepcion(e.getMessage ());
        }
    }

    public void  asignarPeliculas(String codigo,Pelicula pelicula){
        cine.asignarPelicula (codigo,pelicula);
    }

    public void asignarSalas(String codigo){
        cine.asignarSala (codigo);

    }
}
