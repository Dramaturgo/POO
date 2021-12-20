package PC2a;

public class Categoria {

    private String codigo;
    private String nombreDeCategoria;

    public Categoria (String codigo, String nombreDeCategoria) {
        this.codigo = codigo;
        this.nombreDeCategoria = nombreDeCategoria;
    }

    public void categoriaAdmitido()throws Exception{
        if(!nombreDeCategoria.equalsIgnoreCase ("Terror")&&!nombreDeCategoria.equalsIgnoreCase ("Suspenso")&&
        !nombreDeCategoria.equalsIgnoreCase ("Accion")&&!nombreDeCategoria.equalsIgnoreCase ("Comedia")&&
        !nombreDeCategoria.equalsIgnoreCase ("Animacion"))throw new Exception ("Categoria Invalida");
    }
    public String getCodigo () {
        return codigo;
    }

    public String getNombreDeCategoria () {
        return nombreDeCategoria;
    }
}
