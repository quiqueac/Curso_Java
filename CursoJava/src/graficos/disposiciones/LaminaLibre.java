/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.disposiciones;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaLibre extends JPanel {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaLibre() {
        setLayout(new EnColumnas());
        /*
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        boton1.setBounds(50, 50, 120, 25);
        boton2.setBounds(200, 100, 120, 25);
        add(boton1);
        add(boton2);
        */
        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");
        JLabel edad = new JLabel("Edad: ");
        JLabel telefono = new JLabel("Teléfono: ");
        JTextField cNombre = new JTextField(10);
        JTextField cApellido = new JTextField(10);
        JTextField cEdad = new JTextField(10);
        JTextField cTelefono = new JTextField(10);
        /*
        nombre.setBounds(20, 20, 80, 10);
        cNombre.setBounds(100, 17, 100, 20);
        apellido.setBounds(20, 60, 80, 15);
        cApellido.setBounds(100, 55, 100, 20);
        */
        add(nombre);
        add(cNombre);
        add(apellido);
        add(cApellido);
        add(edad);
        add(cEdad);
        add(telefono);
        add(cTelefono);
    }

}
