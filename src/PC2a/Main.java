package PC2a;

import java.util.List;

public class Main {
    public static void main (String[] args)  {

        Tienda tienda=new Tienda ();

        Categoria categoria1=new Categoria ("u14","Accion");
        Categoria categoria2=new Categoria ("u15","Terror");
        Categoria categoria3=new Categoria ("u16","Comedia");

        try {
            categoria1.categoriaAdmitido ();
            Pelicula pelicula1=new Pelicula ("p30","Avengers",categoria1);
            pelicula1.registrarActores ("Tony Stark","Americana");
            pelicula1.registrarActores ("Angeline jolie","Austriaca");
            pelicula1.registrarActores ("Thor","Asgardiano");
            tienda.registrarPeliculas (pelicula1);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            categoria2.categoriaAdmitido ();
            Pelicula pelicula2=new Pelicula ("p31","El aro",categoria2);
            pelicula2.registrarActores ("Mila Jovovich","Austriaca");
            pelicula2.registrarActores ("Mark Ruffalo","Fances");
            pelicula2.registrarActores ("Ron wislek","Ruso");
            tienda.registrarPeliculas (pelicula2);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            categoria3.categoriaAdmitido ();
            Pelicula pelicula3 = new Pelicula ("p32", "Cliford", categoria3);
            pelicula3.registrarActores ("Tony Hardy", "Alemana");
            pelicula3.registrarActores ("James Watson", "Americana");
            pelicula3.registrarActores ("Lucas Valdes", "Francesa");
            tienda.registrarPeliculas (pelicula3);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        List<Pelicula>lista=tienda.obtenerPeliculas ("Americana");

        for(Pelicula pelicula:lista){
            System.out.println (pelicula.getNombre ());
        }


    }
}
