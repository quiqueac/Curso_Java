/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Enumerado
{
    /*
    enum Talla
    {
        MINI,
        MEDIANO,
        GRANDE,
        MUY_GRANDE
    }
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Talla talla = Talla.MINI;
        
        Scanner entrada = new Scanner(System.in);
        Talla talla;
        String entradaDatos;
        
        System.out.print("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE: ");
        
        entradaDatos = entrada.next().toUpperCase();
        talla = Enum.valueOf(Talla.class, entradaDatos);
        
        System.out.println("Talla: " + talla);
        System.out.println("Abreviatura: " + talla.getAbreviatura());
    }
    
}
