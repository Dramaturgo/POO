package PCFinalB;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private static Ciudad ciudad=new Ciudad ();
    public static Ciudad getInstance(){
        return ciudad;
    }

    private List<Empresa> listaDeEmpresas;
    private List<Persona> listaDePersonas;

    public Ciudad () {
        this.listaDeEmpresas = new ArrayList<> ();
        this.listaDePersonas = new ArrayList<> ();
    }

    public void registrarEmpresa(Empresa empresa)throws Exception{
        empresa.validarDigitosRuc ();
        this.listaDeEmpresas.add(empresa);
    }
    public void registrarPersona(Persona persona){
        this.listaDePersonas.add(persona);
    }

    public List<Empresa> getListaDeEmpresas () {
        return listaDeEmpresas;
    }

    public List<Persona> getListaDePersonas () {
        return listaDePersonas;
    }
}
