package PA4;

public abstract class SalaDeCine {

    private String codigo;
    private String nombre;
    private int capacidad;
    private double precioBaseEntrada;

    public abstract double calcularPrecioEntrada();


    public double montoTotal(){
        return calcularPrecioEntrada ()*capacidad;
    }

    public SalaDeCine (String codigo, String nombre, int capacidad, double precioBaseEntrada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioBaseEntrada = precioBaseEntrada;
    }

    public String getCodigo () {
        return codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public int getCapacidad () {
        return capacidad;
    }

    public double getPrecioBaseEntrada () {
        return precioBaseEntrada;
    }

    public String toString(){
        return  "\n"+getClass ().getSimpleName ()+
                "\nCodigo: "+codigo+
                "\nNombre: "+nombre+
                "\nCapacidad: "+capacidad
                + "\nPrecio base de Entrada: "+precioBaseEntrada;
    }

}
