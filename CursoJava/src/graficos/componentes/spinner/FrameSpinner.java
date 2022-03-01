/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.spinner;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FrameSpinner extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrameSpinner() throws HeadlessException {
        setBounds(550, 350, 550, 350);
        add(new LaminaSpinner());
        setVisible(true);
    }

}
