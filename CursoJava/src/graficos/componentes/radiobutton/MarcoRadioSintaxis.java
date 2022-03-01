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
public class MarcoRadioSintaxis extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoRadioSintaxis() throws HeadlessException {
        setVisible(true);
        setBounds(550, 300, 500, 300);
        LaminaRadioSintaxis miLamina = new LaminaRadioSintaxis();
        add(miLamina);
    }

}
