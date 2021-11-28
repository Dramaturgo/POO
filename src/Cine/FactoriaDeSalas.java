package Cine;

public class FactoriaDeSalas {

    public static SalaDeCine crearSala(String ...datos){
        return switch (datos[0]) {
            case "SR" -> new SalaRegular (datos[1], datos[2], Integer.parseInt (datos[3]), Double.parseDouble (datos[4]), Double.parseDouble (datos[5]));
            case "S4D" -> new Sala4D (datos[1], datos[2], Integer.parseInt (datos[3]), Double.parseDouble (datos[4]), datos[5], datos[6]);
            default -> null;
        };
    }
}
