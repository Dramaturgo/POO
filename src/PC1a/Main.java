package PC1a;


public class Main {

    public static void main (String[] args) {

        ClienteVIP clienteVIP1=new ClienteVIP ("C1430","Ruben",2004,15,1);
        ClienteVIP clienteVIP2=new ClienteVIP ("C1431","Juan",2015,17,2);
        ClienteRegular clienteRegular1=new ClienteRegular ("C1432","Maria",2003,120);
        ClienteRegular clienteRegular2=new ClienteRegular ("C1433","Pedro",2019,80);

        Tienda tienda1=new Tienda ();
    //Registrar Clientes
        tienda1.registrarClientes (clienteVIP1);
        tienda1.registrarClientes (clienteVIP2);
        tienda1.registrarClientes (clienteRegular1);
        tienda1.registrarClientes (clienteRegular2);
    //Listar Clientes
        System.out.println ("\n--------Clientes registrados---------\n");
        for(Cliente c: tienda1.getListaClientes ()){
            System.out.println (c.ListarDatos ());
        }
    //Verificar si hay cliente vip registrado en nivel 1
        System.out.println ("--------Clientes VIP en nivel 1---------\n");
        System.out.println (tienda1.verificarVIP1 ());



    }


}
