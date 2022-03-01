/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.slider;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaSliders extends JPanel {
    
    private final JLabel rotulo;
    private final JSlider control;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaSliders() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);
        //JSlider control = new JSlider(SwingConstants.VERTICAL, 20, 100, 25);
        control = new JSlider(8, 50, 12);
        //control.setOrientation(SwingConstants.VERTICAL);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        //control.setSnapToTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.addChangeListener(new EventosSlider());
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }
    
    private class EventosSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            //System.out.println("Estas manipulando el deslizante: " + control.getValue());
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }
        
    }

}
