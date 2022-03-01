/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.slider;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FrameSliders extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameSliders() throws HeadlessException {
        setBounds(550, 400, 550, 350);
        LaminaSliders miLamina = new LaminaSliders();
        add(miLamina);
        setVisible(true);
    }

}
