package PA2;

import java.util.List;

public class Test {

    public static void main (String[] args) {

        Bicicleta bicicleta1=new Bicicleta ("U4015","2015","Specialed","only child","rojo",1590,3,"Urbana");
        Bicicleta bicicleta2=new Bicicleta ("U1590","2015","Trek","only child","azul",2500,2,"Montañera");
        Bicicleta bicicleta3=new Bicicleta ("U9016","2016","BMC bikes","Force","negro",3400,5,"Ruta");
        Scooter scooter1=new Scooter ("U4070","2021","Yamaha","Electric","azul","Tesla",5);
        Scooter scooter2=new Scooter ("U7040","2015","Susuki","Electric","rojo","Magic",7);
        Scooter scooter3=new Scooter ("U9030","2021","Kymnco","Manual","negro","Quantum",6);

        Municipalidad municipalidad1=new Municipalidad ("La Molina");
    //1-Registrar vehiculos
        municipalidad1.registrarVehiculos (bicicleta1);
        municipalidad1.registrarVehiculos (bicicleta2);
        municipalidad1.registrarVehiculos (bicicleta3);
        municipalidad1.registrarVehiculos (scooter1);
        municipalidad1.registrarVehiculos (scooter2);
        municipalidad1.registrarVehiculos (scooter3);

        List<Vehiculo>lista=municipalidad1.getListaVehiculos ();

    //2 método que retorne el vehículo registrado con la mayor velocidad máxima.
        System.out.println ("-------Vehiculo con mayor velocidad------------\n");
        Vehiculo mv= municipalidad1.vehiculoMayorVelocidad ();
        System.out.println (mv.getClass ().getSimpleName ()+"\n");
        System.out.println ("Velocidad Maxima: "+mv.calcularVelocidadMaxima ());
        System.out.println ("Codigo: "+mv.getCodigo ());
        System.out.println ("Marca: "+mv.getMarca ());
        System.out.println ("Color: "+mv.getColor ()+"\n");
    //3 método que permita realizar una búsqueda de un vehículo,recibiendo como dato de entrada el código
        System.out.println ("--------Busqueda de vehiculo por codigo----------\n");
        String codigoABuscar="U7040";
        System.out.println ("El dato buscado "+codigoABuscar);
        Vehiculo v= municipalidad1.busquedaVehiculo (codigoABuscar);
        System.out.println (v.getClass ().getSimpleName ()+"\n");
        System.out.println ("Codigo: "+v.getCodigo ());
        System.out.println ("Color: "+v.getColor ());
        System.out.println ("Año de Compra: "+v.getAñoCompra ());
        System.out.println ("Modelo: "+v.getModelo ());
        System.out.println ("Marca: "+v.getMarca ());
        if(v.getClass ().getSimpleName ().equals ("Bicicleta")){
            if(v instanceof Bicicleta b){
                System.out.println ("Cantidad de platos: "+b.getCantidadPlatos ());
                System.out.println ("Valor: "+b.getValor ());
                System.out.println ("Clasificacion: "+b.getClasificacion ());
            }
        }else {
            if (v instanceof Scooter s) {
                System.out.println ("Horas de bateria: " + s.getHorasBateria ());
                System.out.println ("Modelo de motor: " + s.getModeloMotor ());
            }
        }
    //4 método que reciba como dato un año y retorne todas las bicicletas
        System.out.println ("\n-------Vehiculo comprados en un año especifico------\n");
        String añobuscado="2015";
        System.out.println ("las bicicletas compradas en el año "+añobuscado+" son:\n");
        for(Bicicleta b: municipalidad1.busquedaBicicletas (añobuscado)){
            System.out.println ("Codigo: "+b.getCodigo ());
            System.out.println ("Color: "+b.getColor ());
            System.out.println ("Año de Compra: "+b.getAñoCompra ());
            System.out.println ("Velocidad Maxima: "+b.calcularVelocidadMaxima ());
            System.out.println ("Modelo: "+b.getModelo ());
            System.out.println ("Cantidad de platos: "+b.getCantidadPlatos ());
            System.out.println ("Valor: "+b.getValor ());
            System.out.println ("Clasificacion: "+b.getClasificacion ()+"\n");

        }
    }
}
