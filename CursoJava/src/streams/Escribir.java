/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package streams;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Escribir {
     public void escritura() {
         String texto = "Hola, esto es una segunda prueba de crear un fichero en JAVA";
         try (FileWriter archivo = new FileWriter("src/streams/ejemplo.txt")) {
             archivo.write(texto);
             archivo.close();
         }
         catch (IOException e) {
         }
     }
}
