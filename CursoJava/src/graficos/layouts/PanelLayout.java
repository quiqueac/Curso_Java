/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PanelLayout extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
    }

}
