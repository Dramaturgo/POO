package Terminal;

public class Motor {

    private String modelo;
    private int nroCilindros;

    public Motor(String modelo, int nroCilindros) {
        this.modelo = modelo;
        this.nroCilindros = nroCilindros;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNroCilindros() {
        return nroCilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", nroCilindros=" + nroCilindros +
                '}';
    }
}
