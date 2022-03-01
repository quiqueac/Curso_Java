/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.ejercicio;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaBotones extends JPanel {
    
    private final ButtonGroup grupo;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaBotones(String titulo, String [] opciones) {
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        grupo = new ButtonGroup();
        boolean condicion = false;
        for (String opcion : opciones) {
            JRadioButton bot = new JRadioButton(opcion);
            bot.setActionCommand(opcion);
            add(bot);
            grupo.add(bot);
            if(condicion == false) {
                condicion = true;
                bot.setSelected(true);
            }
            else {
                bot.setSelected(false);
            }
        }
    }
    
    public String dameSeleccion() {
        /*
        ButtonModel miBoton = grupo.getSelection();
        String s = miBoton.getActionCommand();
        return s;
        */
        return grupo.getSelection().getActionCommand();
    }

}
