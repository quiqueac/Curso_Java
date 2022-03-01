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
public class MarcoTexto extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoTexto() throws HeadlessException {
        setBounds(600, 300, 600, 350);
        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
        setVisible(true);
    }
    
}
