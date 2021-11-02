package PA1;

public class Main {

    public static void main (String[] args) {

        ProductoVendido producto1=new ProductoVendido ("U2015","Torta de chocolate",2,24.80);
        ProductoVendido producto2=new ProductoVendido ("U2014","Pie de Manzana",5,74.30);
        ProductoVendido producto3=new ProductoVendido ("U2013","Tiramisu",1,7.90);
        ProductoVendido producto4=new ProductoVendido ("T4015","Torta de chocolate",5,215.60);
        ProductoVendido producto5=new ProductoVendido ("T4016","Torta 3 leches",3,123.70);
        ProductoVendido producto6=new ProductoVendido ("T4017","Pie de Manzana",7,210.30);

        Pasteleria pasteleria1=new Pasteleria ("20516438445","Vladi","Av La Molina 1173");
        Pasteleria pasteleria2=new Pasteleria ("2110065384","San Antonio","Viñas 1345");

        pasteleria1.registrarProducto(producto1);
        pasteleria1.registrarProducto(producto2);
        pasteleria1.registrarProducto(producto3);
        pasteleria2.registrarProducto(producto4);
        pasteleria2.registrarProducto(producto5);
        pasteleria2.registrarProducto(producto6);

        System.out.println ("NOMBRE: "+pasteleria1.getNombre ());
        System.out.println ("RUC: "+pasteleria1.getRuc ());
        System.out.println ("DIRECCION: "+pasteleria1.getDireccion ());


        System.out.println ("\nPRODUCTOS:");
        for (ProductoVendido p:pasteleria1.getProducto()) {
            System.out.println("Codigo: "+p.getCodigo() + "         Nombre: "+p.getNombre());
            System.out.println("Cantidad: "+p.getCantidad()+ "           Precio: "+p.getPrecio()+" soles");
            System.out.println("Total:"+p.totalDeVenta ()+" soles\n");

        }
        System.out.println("El total de venta de la Pasteleria "+pasteleria1.getNombre()+" es:"+pasteleria1.ventasTotales()+" soles");

        System.out.println ("-----------------------------------------------------");
        System.out.println ("NOMBRE: "+pasteleria2.getNombre ());
        System.out.println ("RUC: "+pasteleria2.getRuc ());
        System.out.println ("DIRECCION: "+pasteleria2.getDireccion ());


        System.out.println ("\nPRODUCTOS:");
        for (ProductoVendido p:pasteleria2.getProducto()) {
            System.out.println("Codigo: "+p.getCodigo() + "         Nombre: "+p.getNombre());
            System.out.println("Cantidad: "+p.getCantidad()+ "           Precio: "+p.getPrecio()+" soles");
            System.out.println("Total:"+p.totalDeVenta ()+" soles\n");

        }
        System.out.println("El total de venta de la Pasteleria "+pasteleria2.getNombre()+" es:"+pasteleria2.ventasTotales()+" soles");



    }
}



