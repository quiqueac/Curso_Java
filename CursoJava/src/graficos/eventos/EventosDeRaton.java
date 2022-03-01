/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EventosDeRaton extends MouseAdapter implements MouseMotionListener
{

    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Has hecho click");
        System.out.println("Coordenada X: " + e.getX() + ". Coordenada Y: " + e.getY() + ".");
        System.out.println("Clics: " + e.getClickCount());
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Acabas de presionar");
        switch (e.getModifiersEx())
        {
            case MouseEvent.BUTTON1_DOWN_MASK:
                System.out.println("Has pulsado el botón izquierdo");
                break;
            case MouseEvent.BUTTON2_DOWN_MASK:
                System.out.println("Has pulsado la rueda del ratón");
                break;
            case MouseEvent.BUTTON3_DOWN_MASK:
                System.out.println("Has pulsado el botón derecho");
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Acabas de salir");
    }
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        System.out.println("Estás arrastrando");
    }
    
    @Override
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("Estás moviendo");
    }
    
}
