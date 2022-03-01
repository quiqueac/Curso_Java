/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoConTeclas extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoConTeclas() throws HeadlessException
    {
        setVisible(true);
        setBounds(700, 300, 600, 450);
        EventoDeTeclado tecla = new EventoDeTeclado();
        addKeyListener(tecla);
    }
    
}
