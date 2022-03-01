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
public class MarcoPrueba extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoPrueba() throws HeadlessException {
        setBounds(500, 300, 500, 350);
        LaminaPrueba miLamina = new LaminaPrueba();
        add(miLamina);
        setVisible(true);
    }
    
}
