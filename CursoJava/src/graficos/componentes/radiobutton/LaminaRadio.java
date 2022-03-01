/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.radiobutton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaRadio extends JPanel {
    
    private final JLabel texto;
    private final ButtonGroup miGrupo;
    private final JPanel laminaBotones;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaRadio() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        laminaBotones = new JPanel();
        miGrupo = new ButtonGroup();
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", false, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 26);
        add(laminaBotones, BorderLayout.SOUTH);
    }
    
    public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        miGrupo.add(boton);
        laminaBotones.add(boton);
        @SuppressWarnings("Convert2Lambda")
        ActionListener miEvento = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
            }
            
        };
        
        boton.addActionListener(miEvento);
        
    }

}
