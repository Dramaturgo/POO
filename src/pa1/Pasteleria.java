package pa1;

import java.util.List;
import java.util.ArrayList;

public class Pasteleria {

    private String nombre;
    private String ruc;
    private String direccion;
    private List<ProductoVendido>producto=new ArrayList<>();

    public Pasteleria (String ruc, String nombre, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;

    }

    public List<ProductoVendido> getProducto(){
        return producto;
    }

    public String getNombre () {
        return nombre;
    }

    public String getRuc () {
        return ruc;
    }

    public String getDireccion () {
        return direccion;
    }

    public void registrarProducto(ProductoVendido productos){
        producto.add(productos);

    }
    public double ventasTotales(){
        double ventaTotal=0;
        for(ProductoVendido p:producto){

            ventaTotal+=p.totalDeVenta();
        }
        return ventaTotal;
    }}

