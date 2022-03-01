/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola.poo;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Objetos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Coche Renault = new Coche();
        System.out.println("El color es " + Renault.getColor() + ".");
        Renault.setColor("Azul");
        System.out.println("El color es " + Renault.getColor() + ".");
    }
    
}
