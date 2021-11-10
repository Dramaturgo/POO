package Factura;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("102","Perno 3/4",1.50);
        Producto producto2 = new Producto("304","Pintura Vencelatex",30);
        Item item1 = new Item(1, 4, producto1);//agregacion
        Item item2 = new Item(2,2,producto2);//agregacion
        Item item3 = new Item(2, 10, "783", "Lija 3", 5);//composicion
        Item item4 = new Item(3,4,"342","Martillo",30);//composicion

        Factura factura1 = new Factura("001-001-Z","88888888888","12/12/2020","Lima 12");
        factura1.registrar(item1);
        factura1.registrar(item2);
        factura1.registrar(item3);
        factura1.registrar(item4);
        System.out.println("Factura Nro:" + factura1.getNumeroFactura());
        System.out.println("---------------------------");
        for(Item p:factura1.getArregloItems()){
            System.out.println(p.toString());
        }
        System.out.println("---------------------------");
        System.out.println("Subtotal:" + factura1.calcularSubTotal());
        System.out.println("IGV:" + factura1.calcularIGV());
        System.out.println("TOTAL:" + factura1.calcularTotalAPagar());

    }
}