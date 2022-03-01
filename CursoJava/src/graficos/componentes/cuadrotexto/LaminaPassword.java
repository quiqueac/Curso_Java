/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaPassword extends JPanel {
    
    @SuppressWarnings("FieldMayBeFinal")
    private JPasswordField cContra;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField cUsuario = new JTextField(15);
        CompruebaPassword miEvento = new CompruebaPassword();
        cContra = new JPasswordField(15);
        cContra.getDocument().addDocumentListener(miEvento);
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(cUsuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(cContra);
        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);
    }
    
    private class CompruebaPassword implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            char [] contraseña;
            contraseña = cContra.getPassword();
            if(contraseña.length < 8 || contraseña.length > 12) {
                cContra.setBackground(Color.RED);
            } else {
                cContra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char [] contraseña;
            contraseña = cContra.getPassword();
            if(contraseña.length < 8 || contraseña.length > 12) {
                cContra.setBackground(Color.RED);
            } else {
                cContra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
    
}
