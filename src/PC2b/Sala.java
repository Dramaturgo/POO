package PC2b;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    private String codigo;
    private List<Asiento>listaDeAsientos;
    private Pelicula peliculaAsignada;


    public Sala(String codigo){
        this.codigo=codigo;
        this.listaDeAsientos=new ArrayList<> ();
    }

    public void asignarPelicula(Pelicula pelicula){
        this.peliculaAsignada=pelicula;
    }

    public void asignarAsiento(int fila,String letra,String categoria){
        Asiento asiento=new Asiento (fila, letra, categoria);
        this.listaDeAsientos.add(asiento);
    }

    public double calcularMontoTotal(){
        double monto=0;
        for(Asiento asiento:listaDeAsientos){
            monto+=asiento.calcularPrecio ();
        }
        return monto;
    }

    public String getCodigo () {
        return codigo;
    }

    public List<Asiento> getListaDeAsientos () {
        return listaDeAsientos;
    }

    public Pelicula getPeliculaAsignada () {
        return peliculaAsignada;
    }

    public String obtenerDatosListaAsiento(){
        String datos="";
        for(Asiento a:listaDeAsientos){
            datos+=a.toString ();
        }return datos;
    }

    @Override
    public String toString () {
        return "\nCodigo de Sala: "+codigo+obtenerDatosListaAsiento ()+
                    "\nPelicula asignada: "+peliculaAsignada.getNombre ()+
                    "\nMonto total:"+calcularMontoTotal ()+"\n";



    }
}
