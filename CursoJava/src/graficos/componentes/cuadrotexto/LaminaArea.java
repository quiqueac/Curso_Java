/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaArea extends JPanel {
    
    private JTextArea miArea;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaArea() {
        miArea = new JTextArea(8, 20);
        JScrollPane laminaBarra = new JScrollPane(miArea);
        miArea.setLineWrap(true);
        add(laminaBarra);
        JButton miBoton = new JButton("Dale");
        miBoton.addActionListener(new GestionaArea());
        add(miBoton);
    }
    
    private class GestionaArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(miArea.getText());
        }
        
    }

}
