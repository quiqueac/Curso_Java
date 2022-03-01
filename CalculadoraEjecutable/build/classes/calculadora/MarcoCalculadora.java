/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoCalculadora extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCalculadora() throws HeadlessException {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
        pack();
    }

}
