/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.disposiciones;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoCaja extends JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCaja() throws HeadlessException {
        setTitle("Marco en la caja");
        setBounds(600, 350, 200, 200);
        JLabel rotulo1 = new JLabel("Nombre");
        JTextField texto1 = new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());
        Box cajaH1 = Box.createHorizontalBox();
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(texto1);
        JLabel rotulo2 = new JLabel("Contraseña");
        JTextField texto2 = new JTextField(10);
        texto2.setMaximumSize(texto1.getPreferredSize());
        Box cajaH2 = Box.createHorizontalBox();
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(boton1);
        cajaH3.add(Box.createGlue());
        cajaH3.add(boton2);
        Box cajaVertical = Box.createVerticalBox();
        cajaVertical.add(cajaH1);
        cajaVertical.add(cajaH2);
        cajaVertical.add(cajaH3);
        add(cajaVertical, BorderLayout.CENTER);
    }

}
