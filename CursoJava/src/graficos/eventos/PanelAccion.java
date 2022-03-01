/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PanelAccion extends JPanel
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PanelAccion()
    {
        /*
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonAzul = new JButton("Azul");
        JButton botonRojo = new JButton("Rojo");
        
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
        */
        
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/eventos/imagenes/amarillo.png"), Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/eventos/imagenes/azul.png"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/eventos/imagenes/rojo.png"), Color.RED);
        
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        
        InputMap mapaEntrada;
        mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        //KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl Y"), "Fondo amarillo");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo azul");
        mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo rojo");
        
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("Fondo amarillo", accionAmarillo);
        mapaAccion.put("Fondo azul", accionAzul);
        mapaAccion.put("Fondo rojo", accionRojo);
    }
    
    private class AccionColor extends AbstractAction
    {

        @SuppressWarnings("OverridableMethodCallInConstructor")
        public AccionColor(String nombre, Icon icono, Color colorBoton)
        {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
            putValue("Color de fondo", colorBoton);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Color c = (Color) getValue("Color de fondo");
            setBackground(c);
            System.out.println("Nombre: " + getValue(Action.NAME) + ". Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    
    }
    
}
