package Comercial;

public class Restaurante extends Local {

    private String tipoDeComida;
    private boolean ventaDeAlcohol;

    public Restaurante (String nombre, String zona, String area, String tipoDeComida, boolean ventaDeAlcohol) {
        super (nombre, zona, area);
        this.tipoDeComida = tipoDeComida;
        this.ventaDeAlcohol = ventaDeAlcohol;
    }

    @Override
    public double calcularAlquiler () {
        double precioDeZona=0;
        double adicional=0;
        if(ventaDeAlcohol){
            adicional=100;
        }
        switch (super.getZona ()){
            case "A" ->precioDeZona=950;
            case "B" ->precioDeZona=1500;
            case "C" ->precioDeZona=2100;
        }

        return precioDeZona+adicional;
    }

    @Override
    public String toString () {
        return   "Local{" +
                "nombre='" + getNombre () + '\'' +
                ", zona='" + getZona () + '\'' +
                ", area='" + getArea () + '\'' +
                '}'+
                "Restaurante{" +
                "tipoDeComida='" + tipoDeComida + '\'' +
                ", ventaDeAlcohol=" + ventaDeAlcohol +
                ",Alquiler="+calcularAlquiler ()+
                '}';
    }
}
