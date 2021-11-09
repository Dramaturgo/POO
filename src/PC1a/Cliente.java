package PC1a;

public abstract class Cliente {

   private String codigo;
   private String nombre;
   private int añoRegistro;

    public Cliente (String codigo, String nombre, int añoRegistro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.añoRegistro = añoRegistro;
    }

    public abstract int calcularPuntoBonus();


    public String getCodigo () {
        return codigo;
    }

    public String getNombre () {
        return nombre;
    }

    public int getAñoRegistro () {
        return añoRegistro;
    }

    public String ListarDatos(){

        return "Nombre: "+nombre+"\nCodigo: "+codigo+"\nAño de registro: "+añoRegistro;

    }
}
