package com.upc.herencia;

public abstract  class Profesor  {

     private String codigo;
     private String nombre;
     private String dni;

    public Profesor (String codigo, String nombre, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public Profesor () {//es necesario cuando haremos herencia
    }

    public abstract double calcularSueldo();
    //cuando una clase al menos tiene un metodo abstracto la clase debe ser abstracta
    //un metodo abstracto no se programa termina (;)

    public String getCodigo () {
        return codigo;
    }

    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDni () {
        return dni;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }
}
