package Problema3;

public abstract class Trabajador {

    private String dni;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String profesion;
    private int horasSemanales;
    private double tarifaHora;
    private double bono;

    public Trabajador(String dni,String nombre,String apellido,String fechaDeNacimiento,String profesion,int horasSemanales,double tarifaHora){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.profesion=profesion;
        this.horasSemanales=horasSemanales;
        this.tarifaHora=tarifaHora;
    }

    public abstract double  calcularSueldoBruto();

    public double calcularSueldoNeto(){
        return calcularSueldoBruto ()+(calcularSueldoBruto ()*bono);
    }
    public String listarDatos(){
        return "\nDatos: \nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nDni: "+this.dni+
                "\nSueldo Bruto: "+String.format ("%.2f",this.calcularSueldoBruto ())+"\nSueldoNeto: "+String.format ("%.2f",this.calcularSueldoNeto ())+"\nBono: "+this.bono+"\n";
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setBono (double bono) {
        this.bono = bono;
    }

}