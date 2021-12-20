package PCFinalB;

public class Factory {

    public static Sistema create(String opcion,String...args){

        return switch (opcion) {
            case "Empresa" -> new Empresa (Double.parseDouble (args[0]), args[1], args[2]);
            case "Persona" -> new Persona (Double.parseDouble (args[0]), args[1], args[2], args[3]);
            default -> null;
        };
    }
}
