/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Arrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /*
           int [] matriz = new int[5];
            
            matriz[0] = 5;
            matriz[1] = 38;
            matriz[2] = -15;
            matriz[3] = 92;
            matriz[4] = 71;
        */
        /*
            int [] matriz = {5, 38, -15, 92, 71};

            for (int i = 0; i < 5; i++)
            {
                System.out.println(matriz[i]);
            }
        */
        
        String [] paises = {"México", "Alemania", "Estados Unidos", "Gran Bretaña", "Nueva Zelanda"};
        
        for (String elemento:paises)
        {
            System.out.println("País: " + elemento);
        }
    }
    
}
