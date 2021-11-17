package Excepcion;

public class Control {
    public static void main(String[] args) {
        Programador programador = new Programador ();
        try {
            programador.leerArchivo("C:\\Users\\Usuario\\Datos.tx");
        } catch (Exception e) {
            System.out.println(e.getMessage());//enviar mensaje al cliente
        }
    }
}
