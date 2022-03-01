/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.checkbox;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoCheck extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCheck() throws HeadlessException {
        setBounds(550, 300, 600, 350);
        setVisible(true);
        LaminaCheck miLamina = new LaminaCheck();
        add(miLamina);
    }

}
