package PC2a;

public class Actor {
    private String nombreDelActor;
    private String nacionalidad;

    public Actor (String nombreDelActor, String nacionalidad) {
        this.nombreDelActor = nombreDelActor;
        this.nacionalidad = nacionalidad;
    }

    public String getNombreDelActor () {
        return nombreDelActor;
    }

    public String getNacionalidad () {
        return nacionalidad;
    }
}
