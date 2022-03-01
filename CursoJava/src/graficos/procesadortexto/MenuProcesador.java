/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.procesadortexto;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuProcesador extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MenuProcesador() throws HeadlessException {
        setBounds(500, 300, 550, 400);
        LaminaProcesador miLamina = new LaminaProcesador();
        add(miLamina);
        setVisible(true);
    }
    
}
