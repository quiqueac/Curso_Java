/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica.arraylistgenerico;

import java.io.File;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList archivos = new ArrayList(4);
        archivos.add("Juan");
        archivos.add("Enrique");
        archivos.add("Sandra");
        archivos.add("Carmen");
        String nombrePersona = (String) archivos.get(0);
        System.out.println(nombrePersona);
        //archivos.add(new File("src/graficos/imagenes/bola.png"));
    }
    
}
