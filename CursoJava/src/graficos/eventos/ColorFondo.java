/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ColorFondo implements ActionListener
{
    private final Color colorDeFondo;
    
    public ColorFondo(Color c)
    {
        colorDeFondo = c;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //setBackground(colorDeFondo);
    }
}
