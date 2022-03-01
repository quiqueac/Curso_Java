/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.leyendoescribiendobytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int datosEntrada[] = new int[74130];
        
        try {
            // TODO code application logic here
            FileInputStream archivoLectura = new FileInputStream("src/graficos/imagenes/bola.png");
            boolean finalAr = false;
            while(!finalAr) {
                try {
                    int byteEntrada = archivoLectura.read();
                    if(byteEntrada != -1) {
                        datosEntrada[contador] = byteEntrada;
                    }
                    else {
                        finalAr = true;
                    }
                    System.out.println(datosEntrada[contador]);
                    contador++;
                } catch (IOException ex) {
                    Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                archivoLectura.close();
            } catch (IOException ex) {
                Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(contador);
        creaFichero(datosEntrada);
    }
    
    static void creaFichero(int datosNuevoFichero[]) {
        try {
            FileOutputStream ficheroNuevo = new FileOutputStream("src/graficos/imagenes/bolas.png");
            for(int i = 0; i < datosNuevoFichero.length; i++) {
                try {
                    ficheroNuevo.write(datosNuevoFichero[i]);
                } catch (IOException ex) {
                    Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
