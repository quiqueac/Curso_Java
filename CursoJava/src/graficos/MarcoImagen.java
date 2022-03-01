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
public class MarcoImagen extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoImagen() throws HeadlessException
    {
        setTitle("Marco con imagen");
        setBounds(750, 300, 300, 200);
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);
    }
    
}
