package PC2b;


public class Main {
    public static void main (String[] args) {
        Cine cineMax=new Cine ();
        Vista vista=new Vista ();
        Controlador controlador=new Controlador (vista,cineMax);

        Pelicula pelicula1=new Pelicula ("Avengers");
        Pelicula pelicula2=new Pelicula ("Frozen");
        Pelicula pelicula3=new Pelicula ("Spiderman No-Way-Home");

        controlador.asignarSalas ("u4015");
        controlador.asignarSalas ("u4016");
        controlador.asignarSalas ("u4017");

        controlador.asignarPeliculas ("u4015",pelicula1);
        controlador.asignarPeliculas ("u4016",pelicula2);
        controlador.asignarPeliculas ("u4017",pelicula3);

        controlador.asignarAsientos("u3015",7,"A","Regular");
        controlador.asignarAsientos ("u4017",8,"H","Regular");
        controlador.asignarAsientos ("u4017",7,"G","4DX");
        controlador.asignarAsientos ("u4016",5,"E","4DX");
        controlador.asignarAsientos ("u4016",4,"D","4DX");
        controlador.asignarAsientos ("u4015",2,"B","Regular");
        controlador.asignarAsientos ("u4015",1,"A","4DX");

        System.out.println (cineMax.toString ());

        Sala salaMayorVenta = cineMax.obtenerSalaMayorVentaAsiento4DX();
        System.out.println("La sala con mayor venta y al menos un asiento 4DX es : " + salaMayorVenta);





    }
}
