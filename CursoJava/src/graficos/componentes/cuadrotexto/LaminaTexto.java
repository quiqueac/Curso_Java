/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaTexto extends JPanel {
    
    @SuppressWarnings("FieldMayBeFinal")
    private JTextField campo1;
    @SuppressWarnings("FieldMayBeFinal")
    private JLabel resultado;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel miLamina2 = new JPanel();
        miLamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel texto1 = new JLabel("Email: ");
        miLamina2.add(texto1);
        campo1 = new JTextField(20);
        miLamina2.add(campo1);
        add(resultado, BorderLayout.CENTER);
        JButton miBoton = new JButton("Comprobar");
        DameTexto miEvento = new DameTexto();
        miBoton.addActionListener(miEvento);
        miLamina2.add(miBoton);
        add(miLamina2, BorderLayout.NORTH);
    }
    
    private class DameTexto implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = campo1.getText().trim();
            for(int i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '@') {
                    correcto++;
                }
            }
            if(correcto != 1) {
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
            System.out.println(campo1.getText().trim());
        }
        
    }
    
}
