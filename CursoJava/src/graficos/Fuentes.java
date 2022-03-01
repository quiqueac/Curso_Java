/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fuentes
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean estaLaFuente = false;
        String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String nombreDeLaFuente: nombreDeFuentes)
        {
            if(nombreDeLaFuente.equals(fuente))
            {
                estaLaFuente = true;
                break;
            }
        }
        if(estaLaFuente)
        {
            System.out.println("Fuente instalada");
        }
        else
        {
            System.out.println("No está instalada");
        }
    }
    
}
