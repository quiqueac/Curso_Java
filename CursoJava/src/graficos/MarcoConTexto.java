/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoConTexto extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoConTexto() throws HeadlessException
    {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer texto");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
    
}
