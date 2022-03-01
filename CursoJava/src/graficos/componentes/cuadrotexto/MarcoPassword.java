/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoPassword extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoPassword() throws HeadlessException {
        setBounds(400, 300, 550, 400);
        LaminaPassword miLamina = new LaminaPassword();
        add(miLamina);
        setVisible(true);
    }

}
