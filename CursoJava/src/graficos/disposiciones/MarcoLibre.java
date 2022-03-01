/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.disposiciones;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoLibre extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoLibre() throws HeadlessException {
        setBounds(450, 350, 350, 400);
        LaminaLibre miLamina = new LaminaLibre();
        add(miLamina);
        setVisible(true);
    }

}
