/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosdirectorios;

import java.io.File;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebasRutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo;
        archivo = new File("EjemploArchivo");
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());
    }
    
}
