package PA2;

public abstract class  Vehiculo {


    private String codigo;
    private String añoCompra;
    private String marca;
    private String modelo;
    private String color;

        public Vehiculo (String codigo, String añoCompra, String marca, String modelo, String color) {
                this.codigo = codigo;
                this.añoCompra = añoCompra;
                this.marca = marca;
                this.modelo = modelo;
                this.color = color;
        }

        public abstract int calcularVelocidadMaxima();


        public String getCodigo () {
                return codigo;
        }

        public String getAñoCompra () {
                return añoCompra;
        }

        public String getMarca () {
                return marca;
        }

        public String getModelo () {
                return modelo;
        }

        public String getColor () {
                return color;
        }
}
