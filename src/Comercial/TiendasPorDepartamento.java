package Comercial;

public class TiendasPorDepartamento extends Local{

   private int cantidadDeVentas;

    public TiendasPorDepartamento (String nombre, String zona, String area, int cantidadDeVentas) {
        super (nombre, zona, area);
        this.cantidadDeVentas = cantidadDeVentas;
    }

    @Override
    public double calcularAlquiler () {
        double precioDeZona=0;
        double adicional=cantidadDeVentas*0.25;
        switch (super.getZona ()){
            case "A" ->precioDeZona=950;
            case "B" ->precioDeZona=1500;
            case "C" ->precioDeZona=2100;
        }
        return precioDeZona+adicional;
    }

    @Override
    public String toString () {
        return "Local{" +
                "nombre='" + getNombre () + '\'' +
                ", zona='" + getZona () + '\'' +
                ", area='" + getArea () + '\'' +
                '}'+

                "TiendasPorDepartamento{" +
                "cantidadDeVentas=" + cantidadDeVentas +
                ",Alquiler="+calcularAlquiler ()+
                '}';
    }
}
