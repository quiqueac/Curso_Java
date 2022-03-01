/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos.eventos;

import javax.swing.JFrame;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EventosVentana
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarcos = new MarcoVentana();
        miMarcos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        miMarco.setTitle("Ventana 1");
        miMarcos.setTitle("Ventana 2");
        miMarco.setBounds(300, 300, 500, 350);
        miMarcos.setBounds(900, 300, 500, 350);
    }
}
