/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosdirectorios;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Creando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //File ruta = new File("src" + File.separator + "serializacion" + File.separator + "nuevodirectorio");
        //ruta.mkdir();
        File ruta = new File("src" + File.separator + "serializacion" + File.separator + "pruebatexto.txt");
        String archivoDestino = ruta.getAbsolutePath();
        try {
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Creando.class.getName()).log(Level.SEVERE, null, ex);
        }
        Escribiendo accede = new Escribiendo();
        accede.escribir(archivoDestino);
    }
    
}
