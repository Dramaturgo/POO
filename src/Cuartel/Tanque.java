package Cuartel;

public class Tanque extends Ataque {

    private String modelo;
    private Torreta torreta;

    public Tanque (String modelo,String modeloTorreta,String tipoMunicion) {
        this.modelo = modelo;
        this.torreta = new Torreta (modeloTorreta,tipoMunicion);
    }

    public String ataque(){
        return "POW POW !!";
    }

    public String getModelo () {
        return modelo;
    }

    public Torreta getTorreta () {
        return torreta;
    }

    @Override
   public String listarDatos(){
        return this.getClass ().getSimpleName ()+"\nModelo: "+modelo+"\nModelo de torreta: "+torreta.getModeloTorreta ()+"\nTipo de Municion: "+torreta.getTipoMunicion ()
                +"\nAtaque: "+ataque ()+"\n";
    }
}
