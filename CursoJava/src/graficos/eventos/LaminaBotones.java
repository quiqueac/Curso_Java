/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaBotones extends JPanel
{
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public LaminaBotones()
    {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo rojo = new ColorFondo(Color.RED);
        botonAzul.addActionListener(azul);
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
    }
    public class ColorFondo implements ActionListener
    {
        private final Color colorDeFondo;

        public ColorFondo(Color c)
        {
            colorDeFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            setBackground(colorDeFondo);
        }
    }
}
