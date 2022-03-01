/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaPrincipal extends JPanel
{
    
    JButton botonCerrar;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaPrincipal()
    {
        JButton botonNuevo = new JButton("Nuevo");
        add(botonNuevo);
        botonCerrar = new JButton("Cerrar todo");
        add(botonCerrar);
        OyenteNuevo miOyente = new OyenteNuevo();
        botonNuevo.addActionListener(miOyente);
    }
    
    private class OyenteNuevo implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            MarcoEmergente marco = new MarcoEmergente(botonCerrar);
            marco.setVisible(true);
        }
        
    }
    
}
