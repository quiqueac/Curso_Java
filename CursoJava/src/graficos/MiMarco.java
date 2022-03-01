/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Frame;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MiMarco extends JFrame
{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MiMarco() throws HeadlessException
    {
        //setSize(500, 300);
        //setLocation(500, 300);
        setBounds(500, 300, 550, 250);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
    }
}
