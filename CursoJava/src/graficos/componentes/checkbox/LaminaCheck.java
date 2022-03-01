/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.checkbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaCheck extends JPanel {
    
    @SuppressWarnings("FieldMayBeFinal")
    private JLabel texto;
    @SuppressWarnings("FieldMayBeFinal")
    private JCheckBox check1, check2;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaCheck() {
        setLayout(new BorderLayout());
        Font miLetra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(miLetra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        JPanel laminaChecks = new JPanel();
        laminaChecks.add(check1);
        laminaChecks.add(check2);
        add(laminaChecks, BorderLayout.SOUTH);
    }
    
    private class ManejaChecks implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if(check1.isSelected()) {
                tipo += Font.BOLD;
            }
            if (check2.isSelected()) {
                tipo += Font.ITALIC;
            }
            texto.setFont(new Font("Serif", tipo, 24));
        }
        
    }

}
