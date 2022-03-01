/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AtraparVariasExcepciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            Division();
        }
        catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println("Estás ingresando algo mal.");
        }
        finally
        {
            System.out.println("Se terminó.");
        }
    }
    static void Division()
    {
        int numeroA;
        int numeroB;
        
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        
        System.out.println("El resultado es: " + numeroA/numeroB);
    }
}
