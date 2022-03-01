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
public class MarcoEstado extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoEstado() throws HeadlessException
    {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        CambiaEstado nuevoEstado = new CambiaEstado();
        addWindowStateListener(nuevoEstado);
    }
    
}