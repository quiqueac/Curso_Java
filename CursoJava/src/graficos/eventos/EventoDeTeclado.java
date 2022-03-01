/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EventoDeTeclado implements KeyListener
{

    @Override
    public void keyTyped(KeyEvent e)
    {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int codigo = e.getKeyCode();
        System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    
}
