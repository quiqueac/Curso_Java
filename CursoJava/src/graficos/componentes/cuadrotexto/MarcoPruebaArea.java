/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.componentes.cuadrotexto;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoPruebaArea extends JFrame {
    
    @SuppressWarnings("FieldMayBeFinal")
    private JPanel laminaBotones;
    @SuppressWarnings("FieldMayBeFinal")
    private JButton botonInsertar, botonSaltoLinea;
    private JTextArea areaTexto;
    @SuppressWarnings("FieldMayBeFinal")
    private JScrollPane laminaConBarras;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "Convert2Lambda"})
    public MarcoPruebaArea() throws HeadlessException {
        setTitle("Probando area de texto");
        setBounds(500, 300, 500, 350);
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();
        botonInsertar = new JButton("Insertar");
        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("En un lugar de la Mancha cuyo nombre no quiero acordarme...");
            }
        });
        laminaBotones.add(botonInsertar);
        botonSaltoLinea = new JButton("Salto línea");
        botonSaltoLinea.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                if(saltar) {
                    botonSaltoLinea.setText("Quitar salto");
                } else {
                    botonSaltoLinea.setText("Salto línea");
                }
            }
        });
        laminaBotones.add(botonSaltoLinea);
        add(laminaBotones, BorderLayout.SOUTH);
        areaTexto = new JTextArea(8, 20);
        laminaConBarras = new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);
    }

}
