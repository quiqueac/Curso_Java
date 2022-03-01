/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MVentana extends WindowAdapter
{

//    @Override
//    public void windowOpened(WindowEvent e)
//    {
//        System.out.println("Ventana abierta");
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e)
//    {
//        System.out.println("Cerrando ventana");
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e)
//    {
//        System.out.println("La ventana ha sido cerrada");
//    }

    @Override
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Ventana minimizada");
    }

//    @Override
//    public void windowDeiconified(WindowEvent e)
//    {
//        System.out.println("Ventana restaurada");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e)
//    {
//        System.out.println("Ventana activada");
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e)
//    {
//        System.out.println("Ventana desactivada");
//    }
    
}
