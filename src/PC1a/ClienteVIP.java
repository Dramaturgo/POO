package PC1a;


public class ClienteVIP extends Cliente {

   private int nroVisitas;
   private int nivel;


    public ClienteVIP (String codigo, String nombre, int añoRegistro, int nroVisitas, int nivel) {
        super (codigo, nombre, añoRegistro);
        this.nroVisitas = nroVisitas;
        this.nivel = nivel;
    }

    @Override
    public int calcularPuntoBonus () {
        return 15*nroVisitas;
    }

    @Override
    public String ListarDatos () {
        return super.ListarDatos ()+"\nNumero de Visitas: "+nroVisitas+"\nNivel: "+nivel+"\nPuntaje Bonus: "+this.calcularPuntoBonus ()+"\n";
    }

    public int getNroVisitas () {
        return nroVisitas;
    }

    public int getNivel () {
        return nivel;
    }
}
