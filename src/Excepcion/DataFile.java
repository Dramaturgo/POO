package Excepcion;

import java.io.FileInputStream;
import java.util.Scanner;

public class DataFile {

    public static void leerFile(String path) throws Exception {
        Scanner sc = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);//checked exception
            sc = new Scanner(fis);    //file to be scanned
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());      //returns the line that was skipped
            }
        } catch (Exception e) {//e captura el mensaje de la Excepción
            //se debe enviar al log del programador
            System.out.println("Programador:" + e);
            //e.printStackTrace();
            throw new Exception("Cliente: No se puede leer el archivo, Gracias.");

        }finally{
            if(fis!=null)
                fis.close();
            if(sc!=null){
                sc.close();
            }
        }
    }
}

