package Problema2;

public abstract class Trabajador{

    private String dni;
    private String nombre;
    private String direccion;
    private String correo;
    private double sueldoFijo;

    public Trabajador(String dni,String nombre,String direccion,String correo,double sueldoFijo){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.correo=correo;
        this.sueldoFijo=sueldoFijo;
    }

    public abstract double calcularSueldoBruto();

    public double calcularSueldoNeto(){
        double sueldoB=calcularSueldoBruto();
        double sueldoN=0;

        if(sueldoB<=1000){
            sueldoN=(sueldoB*1.10)-(sueldoB*1.10*0.13);
        }else if(sueldoB>1000 && sueldoB<=5000){
            sueldoN=(sueldoB*1.08)-(sueldoB*1.08*0.13);
        }else if(sueldoB>5000 && sueldoB<=15000){
            sueldoN=(sueldoB*1.05)-(sueldoB*1.05*0.13);
        }else if(sueldoB>15000){
            sueldoN=(sueldoB*1.03)-(sueldoB*1.03*0.13);
        }
        return sueldoN;

    }

    public String listarTrabajadores(){
        return "Datos:\n"+"Nombre: "+nombre+"\nDni: "+dni+"\nDireccion: "+direccion+"\nSueldo neto: "+String.format("%.2f",calcularSueldoNeto());
    }


    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }



}