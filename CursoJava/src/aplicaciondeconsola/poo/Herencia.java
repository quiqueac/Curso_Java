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
public class Herencia 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Coche miCoche = new Coche();
        miCoche.setColor("Azul marino");
        
        Furgoneta miFurgoneta = new Furgoneta(4, 6);
        miFurgoneta.setColor("Verde");
        miFurgoneta.getCapacidad();
        miFurgoneta.getColor();
    }
    
}
