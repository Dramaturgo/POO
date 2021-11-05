package EjemploPC1;

public class Solido extends Producto{

    private double dureza;


    public Solido(String codigo,String nombre,double peso,double costo,double dureza){

        super(codigo,nombre,peso,costo);
        this.dureza=dureza;

    }

    public double precioVenta(){

        return super.getCosto()+(super.getPeso()*dureza);

    }

    public double getDureza() {
        return dureza;
    }


    public String listarDatos(){


          return super.listarDatos()+"\nDureza: "+this.dureza+"\n";


    }



}
