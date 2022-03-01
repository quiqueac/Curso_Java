/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.menu;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuFrame extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MenuFrame() throws HeadlessException {
        setBounds(500, 300, 550, 400);
        MenuLamina miLamina = new MenuLamina();
        add(miLamina);
        setVisible(true);
    }
    
}
