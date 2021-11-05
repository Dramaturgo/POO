package EjemploPC1;

import java.util.List;


public class Test{

    public static void main(String[] args) {

        Liquido liquido1=new Liquido("U2070","Acido clorhidrico",100.7,1250.75,14.7,"Hersil");
        Liquido liquido2=new Liquido("U4015","Acido ionico",130.5,1050.75,14.7,"Atomic");
        Liquido liquido3=new Liquido ("U1570","cloro",160.43,190.80,13.7,"Clorox");
        Solido solido1=new Solido("U30900","Arcenico",75.90,400.20,18.60);
        Solido solido2=new Solido("U9070","Plutonio",80.70,500.70,13.20);
        Solido solido3=new Solido ("U7065","Tolueno",100.7,13250,13.7);

        Almacen almacen1=new Almacen();
    //Registrar en almacen
        almacen1.registrar(liquido1);
        almacen1.registrar(liquido2);
        almacen1.registrar(liquido3);
        almacen1.registrar(solido1);
        almacen1.registrar(solido2);
        almacen1.registrar(solido3);


        List<Producto>lista=almacen1.getArregloProducto();
    //listar por tipo de producto
        System.out.println (almacen1.listarPorTipo ("Liquido"));
        System.out.println (almacen1.listarPorTipo ("Solido"));
    //Indicar el porcentaje de riesgo existente en el almacen
        System.out.println ("El porcentaje de riesgo es de :"+String.format ("%.2f",almacen1.porcentajeDeRiesgo ())+"%");


    }
}