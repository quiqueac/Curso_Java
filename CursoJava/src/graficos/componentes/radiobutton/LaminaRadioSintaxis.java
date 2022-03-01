/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.radiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaRadioSintaxis extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaRadioSintaxis() {
        ButtonGroup miGrupo1 = new ButtonGroup();
        ButtonGroup miGrupo2 = new ButtonGroup();
        JRadioButton boton1 = new JRadioButton("Azul", false);
        JRadioButton boton2 = new JRadioButton("Rojo", true);
        JRadioButton boton3 = new JRadioButton("Verde", false);
        JRadioButton boton4 = new JRadioButton("Masculino", false);
        JRadioButton boton5 = new JRadioButton("Femenino", false);
        miGrupo1.add(boton1);
        miGrupo1.add(boton2);
        miGrupo1.add(boton3);
        miGrupo2.add(boton4);
        miGrupo2.add(boton5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }

}
