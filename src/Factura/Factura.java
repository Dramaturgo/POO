package Factura;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numeroFactura;
    private String ruc;
    private String fecha;
    private String direccion;
    private List<Item> arregloItems;

    public void registrar(Item item){
        this.arregloItems.add(item);
    }

    public double calcularSubTotal(){
        double suma = 0;
        for(Item p:this.arregloItems){
            suma+=p.calcularSubmonto();
        }
        return suma;
    }

    public double calcularIGV(){
        return (calcularSubTotal()*0.18);
    }

    public double calcularTotalAPagar(){
        return (calcularSubTotal() + calcularIGV());
    }


    public Factura(String numeroFactura, String ruc, String fecha, String direccion) {
        this.numeroFactura = numeroFactura;
        this.ruc = ruc;
        this.fecha = fecha;
        this.direccion = direccion;
        this.arregloItems = new ArrayList<>();//por composición
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Item> getArregloItems() {
        return arregloItems;
    }

    public void setArregloItems(List<Item> arregloItems) {
        this.arregloItems = arregloItems;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura='" + numeroFactura + '\'' +
                ", ruc='" + ruc + '\'' +
                ", fecha='" + fecha + '\'' +
                ", direccion='" + direccion + '\'' +
                ", arregloItems=" + arregloItems +
                '}';
    }
}