/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica.clasesgenericas;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsoPareja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pareja <String> una;
        una = new Pareja <>();
        una.setPrimero("Juan");
        System.out.println(una.getPrimero());
        Persona persona = new Persona("Enrique");
        Pareja <Persona> otra;
        otra = new Pareja <>();
        otra.setPrimero(persona);
        System.out.println(otra.getPrimero());
    }
    
}
