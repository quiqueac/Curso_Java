/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.spinner;

import java.awt.Dimension;
//import java.awt.GraphicsEnvironment;
import javax.swing.JPanel;
import javax.swing.JSpinner;
//import javax.swing.SpinnerDateModel;
//import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaSpinner extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaSpinner() {
        //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
            
        @Override
        public Object getNextValue() {
            return super.getPreviousValue();
        }
        
        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
        });
        Dimension d = new Dimension(200, 20);
        control.setPreferredSize(d);
        add(control);
        
    }
    
    /*
    private class MiModeloSpinner extends SpinnerNumberModel {

        public MiModeloSpinner() {
            super(5, 0, 10, 1);
        }
        
        @Override
        public Object getNextValue() {
            return super.getPreviousValue();
        }
        
        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
        
    }
    */

}
