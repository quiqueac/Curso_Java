/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.combobox;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoCombo extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCombo() throws HeadlessException {
        setBounds(550, 300, 550, 400);
        LaminaCombo miLamina = new LaminaCombo();
        add(miLamina);
        setVisible(true);
    }

}
