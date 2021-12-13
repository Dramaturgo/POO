package PCFinalA;

public class Factory {
   public static Pasajero createPersona(String...args){
         return new Pasajero (args[0],args[1],Integer.parseInt (args[2]),args[3]);

   }

   public static  Bus createBus(String...args){
      return new Bus (args[0]);
   }

}
