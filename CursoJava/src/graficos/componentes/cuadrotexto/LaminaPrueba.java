/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaPrueba extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaPrueba() {
        JTextField miCampo = new JTextField(20);
        EscuchaTexto elEvento = new EscuchaTexto();
        Document miDocumento = miCampo.getDocument();
        miDocumento.addDocumentListener(elEvento);
        add(miCampo);
    }
    
    private class EscuchaTexto implements DocumentListener
    {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
    
}
