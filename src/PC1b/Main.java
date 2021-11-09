package PC1b;


public class Main {

    public static void main (String[] args) {
        Fruta fruta1=new Fruta ("P1570","Manzana",15.70,"si",5);
        Fruta fruta2=new Fruta ("P1571","kiwi",15.70,"no",7);
        Liquido liquido1=new Liquido ("L1570","Gaseosa",17.90,150,"IncaKola");
        Liquido liquido2=new Liquido ("L1571","Gaseosa",18.90,300,"CocaKola");

        Refrigeradora refrigeradora1=new Refrigeradora ();

        refrigeradora1.registrarProductos (fruta1);
        refrigeradora1.registrarProductos (fruta2);
        refrigeradora1.registrarProductos (liquido1);
        refrigeradora1.registrarProductos (liquido2);

        System.out.println ("Listar datos de productos\n");
        for(Producto p: refrigeradora1.getListaProductos ()){
            System.out.println (p.listarDatos ());
        }
        System.out.println ("Valor total refencial de la refrigeradora");
        System.out.println (refrigeradora1.calcularTotalReferencial ());
        System.out.println ("Validar fruta dulce");
        System.out.println (refrigeradora1.validarFrutaDulce ());

    }
}
