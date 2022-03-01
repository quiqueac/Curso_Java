/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LeerFichero {
    
    private FileReader entrada;
    
    public void lee() {
        try {
            entrada = new FileReader("src/streams/ejemplo.txt");
            BufferedReader miBuffer = new BufferedReader(entrada);
            try {
                String linea = "";
                while(linea != null) {
                    linea = miBuffer.readLine();
                    if(linea != null) {
                        System.out.println(linea);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
