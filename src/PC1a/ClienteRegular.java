package PC1a;


public class ClienteRegular extends Cliente {

    private int cantidadDeComprasRealizadas;

    public ClienteRegular (String codigo, String nombre, int añoRegistro, int cantidadDeComprasRealizadas) {
        super (codigo, nombre, añoRegistro);
        this.cantidadDeComprasRealizadas = cantidadDeComprasRealizadas;
    }

    @Override
    public int calcularPuntoBonus () {
        int añoActual=2021;
        int añosDeAntiguedad=añoActual-super.getAñoRegistro ();
        int puntos=0;
        if(añosDeAntiguedad<2){
            puntos=50*añosDeAntiguedad;
        }else if(añosDeAntiguedad>=2&&añosDeAntiguedad<=5){
            puntos=110*añosDeAntiguedad;
        }else if(añosDeAntiguedad>5){
            puntos=170*añosDeAntiguedad;
        }

        return puntos;
    }

    @Override
    public String ListarDatos () {
        return super.ListarDatos ()+"\nCompras Realizadas: "+cantidadDeComprasRealizadas+"\nPuntaje Bonus: "+this.calcularPuntoBonus ()+"\n";
    }

    public int getCantidadDeComprasRealizadas () {
        return cantidadDeComprasRealizadas;
    }
}
