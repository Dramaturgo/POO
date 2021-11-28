package Comercial;

public class Main {

    public static void main (String[] args) {

        CentroComecial centroComecial=new CentroComecial ();

        Restaurante restaurante1=new Restaurante ("la Veleciana","A","240.7","Vegana",true);
        Restaurante restaurante2=new Restaurante ("Maria Almendra","B","215.3","Carnes",false);
        Restaurante restaurante3=new Restaurante ("Gaston","C","230.15","Pastas",true);

        TiendasPorDepartamento tienda1=new TiendasPorDepartamento("Topi Top","A","216.7",40);
        TiendasPorDepartamento tienda2=new TiendasPorDepartamento ("Falabella","B","213.6",50);
        TiendasPorDepartamento tienda3=new TiendasPorDepartamento ("Ripley","A","198.70",50);

        try {
            centroComecial.registrarLocales (restaurante1);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            centroComecial.registrarLocales (restaurante2);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            centroComecial.registrarLocales (restaurante3);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            centroComecial.registrarLocales (tienda1);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            centroComecial.registrarLocales (tienda2);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        try {
            centroComecial.registrarLocales (tienda3);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }

        System.out.println (centroComecial);

        System.out.println ("Precio total por Alquiler de Zona A: "+centroComecial.calcularAlquilerXZonas ("A"));

        System.out.println ("Precio con menor alquiler: "+centroComecial.localConmenorAlquiler ());

    }
}
