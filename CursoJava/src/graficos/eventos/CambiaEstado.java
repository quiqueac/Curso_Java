/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CambiaEstado implements WindowStateListener
{

    @Override
    public void windowStateChanged(WindowEvent e)
    {
        System.out.println("La ventana ha cambiado de estado");
        System.out.println(e.getNewState());
        
        switch (e.getNewState())
        {
            case Frame.MAXIMIZED_BOTH:
                System.out.println("La ventana está a pantalla completa");
                break;
            case Frame.NORMAL:
                System.out.println("La ventana está normal");
                break;
            case Frame.ICONIFIED:
                System.out.println("La ventana está minimizada");
                break;
            default:
                break;
        }
    }
    
}
