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
public class MarcoMuelle extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoMuelle() throws HeadlessException {
        setBounds(300, 400, 1000, 350);
        LaminaMuelle miLamina = new LaminaMuelle();
        add(miLamina);
        setVisible(true);
    }

}
