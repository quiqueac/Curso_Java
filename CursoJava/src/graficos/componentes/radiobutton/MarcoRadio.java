/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.radiobutton;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoRadio extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoRadio() throws HeadlessException {
        setBounds(550, 300, 500, 350);
        LaminaRadio miLamina = new LaminaRadio();
        add(miLamina);
        setVisible(true);
    }

}
