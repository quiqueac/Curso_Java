/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaCalculadora extends JPanel {

    @SuppressWarnings("FieldMayBeFinal")
    private JPanel miLamina2;
    @SuppressWarnings("FieldMayBeFinal")
    private JButton pantalla;
    private boolean principio = true;
    private double resultado;
    private String ultimaOperacion;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));
        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        String[] arreglo = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for(String nombre: arreglo) {
            JButton boton = new JButton(nombre);
            if(Character.isDigit(nombre.charAt(0)) || nombre.charAt(0) == '.')
            {
                boton.addActionListener(insertar);
            }
            else
            {
                boton.addActionListener(orden);
            }
            miLamina2.add(boton);
        }
        add(miLamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";
    }
    
    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if(principio)
            {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }
    
    private class AccionOrden implements ActionListener {
                
        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            principio = true;
            Calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
        }

        private void Calcular(double parseDouble) {
            switch (ultimaOperacion) {
                case "+":
                    resultado += parseDouble;
                    break;
                case "-":
                    resultado -= parseDouble;
                    break;
                case "*":
                    resultado *= parseDouble;
                    break;
                case "/":
                    resultado /= parseDouble;
                    break;
                case "=":
                    resultado = parseDouble;
                    break;
                default:
                    break;
            }
            
            pantalla.setText("" + resultado);
            
        }
        
    }
    
}
