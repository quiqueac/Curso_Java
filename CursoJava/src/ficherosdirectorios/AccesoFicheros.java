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
public class AccesoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File ruta = new File("src" + File.separator + "serializacion");
        System.out.println(ruta.getAbsolutePath());
        String[] nombreArchivos = ruta.list();
        for (String nombreArchivo : nombreArchivos) {
            System.out.println(nombreArchivo);
            File f = new File(ruta.getAbsolutePath(), nombreArchivo);
            if(f.isDirectory()) {
                String[] archivosSubCarpeta = f.list();
                for (String archivo : archivosSubCarpeta) {
                    System.out.println(archivo);
                }
            }
        }
    }
    
}
