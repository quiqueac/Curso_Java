/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.menuemergente;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoEmergente extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoEmergente() throws HeadlessException {
        setBounds(100, 100, 300, 250);
        LaminaEmergente miLamina = new LaminaEmergente();
        add(miLamina);
        setVisible(true);
    }

}
