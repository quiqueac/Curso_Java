/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.layouts;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoLayout extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoLayout() throws HeadlessException {
        setTitle("Prueba acciones");
        setBounds(600, 350, 600, 300);
        PanelLayout lamina = new PanelLayout();
        PanelLayoutA laminaA = new PanelLayoutA();
        add(lamina, BorderLayout.NORTH);
        add(laminaA, BorderLayout.SOUTH);
    }

}
