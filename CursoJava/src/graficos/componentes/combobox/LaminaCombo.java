/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.combobox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaCombo extends JPanel {

    private final JLabel texto;
    private final JComboBox miCombo;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaCombo() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel laminaNorte = new JPanel();
        miCombo = new JComboBox();
        //miCombo.setEditable(true);
        miCombo.addItem("Serif");
        miCombo.addItem("SansSerif");
        miCombo.addItem("Monospaced");
        miCombo.addItem("Dialog");
        EventoCombo miEvento = new EventoCombo();
        miCombo.addActionListener(miEvento);
        laminaNorte.add(miCombo);
        add(laminaNorte, BorderLayout.NORTH);
    }
    
    private class EventoCombo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, 18));
        }
        
    }

}
