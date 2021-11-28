package Comercial;

public abstract class Local {

    private String nombre;
    private String zona;
    private String area;

    public Local (String nombre, String zona, String area) {
        this.nombre = nombre;
        this.zona = zona;
        this.area = area;
    }

    public abstract double calcularAlquiler ();

    public void validar() throws Exception {
        if(!zona.equalsIgnoreCase ("A")&&!zona.equalsIgnoreCase ("B")&&!zona.equalsIgnoreCase ("C")) throw new Exception ("Zona Invalida");
    }

    public String getNombre () {
        return nombre;
    }

    public String getZona () {
        return zona;
    }

    public String getArea () {
        return area;
    }

    @Override
    public String toString () {
        return "Local{" +
                "nombre='" + nombre + '\'' +
                ", zona='" + zona + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
