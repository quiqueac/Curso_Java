/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ficherosdirectorios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
class Escribiendo {

    public void escribir(String archivoDestino) {
        String frase = "Esto es un ejemplo";
        try {
            try (FileWriter escritura = new FileWriter(archivoDestino)) {
                for(int i = 0; i < frase.length(); i++) {
                    escritura.write(frase.charAt(i));
                }
                escritura.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Escribiendo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
