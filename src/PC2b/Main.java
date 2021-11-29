package PC2b;


public class Main {
    public static void main (String[] args) {
        Cine cineMax=new Cine ();
        Pelicula pelicula1=new Pelicula ("Avengers");
        Pelicula pelicula2=new Pelicula ("Frozen");
        Pelicula pelicula3=new Pelicula ("Spiderman No-Way-Home");

        cineMax.asignarSala ("u4015");
        cineMax.asignarSala ("u4016");
        cineMax.asignarSala ("u4017");

        cineMax.asignarPelicula ("u4015",pelicula1);
        cineMax.asignarPelicula ("u4016",pelicula2);
        cineMax.asignarPelicula ("u4017",pelicula3);

        try {
            cineMax.asignarAsiento ("u4015",1,"A","4DX");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            cineMax.asignarAsiento ("u4015",2,"B","Regular");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            cineMax.asignarAsiento ("u4016",4,"D","4DX");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            cineMax.asignarAsiento ("u4016",5,"E","4DX");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            cineMax.asignarAsiento ("u4017",7,"G","4DX");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            cineMax.asignarAsiento ("u4017",8,"H","Regular");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            cineMax.asignarAsiento ("u3015",7,"A","Regular");
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        System.out.println (cineMax.toString ());





    }
}
