/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaTemporizadorA
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);
    }
    
}
