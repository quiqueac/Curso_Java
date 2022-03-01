/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.ejercicio;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoDialogos extends JFrame {
    
    private final LaminaBotones laminaTipo, laminaTipoMensajes, laminaMensaje, laminaTipoOpcion, laminaOpciones, laminaEntrada;
    private final String cadenaMensaje = "Mensaje";
    private final Icon iconoMensaje = new ImageIcon("src/graficos/imagenes/bola.png");
    private final Object objetoMensaje = new Date();
    private final Component componenteMensaje = new LaminaEjemplo();

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoDialogos() throws HeadlessException {
        setTitle("Prueba de diálogos");
        setBounds(500, 300, 600, 450);
        JPanel laminaCuadricula = new JPanel();
        laminaCuadricula.setLayout(new GridLayout(2, 3));
        String primero[] = {"Mensaje", "Confirmar", "Opción", "Entrada"};
        laminaTipo = new LaminaBotones("Tipo", primero);
        laminaTipoMensajes = new LaminaBotones("Tipo de mensaje", new String[]{"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});
        laminaMensaje = new LaminaBotones("Mensaje", new String[]{"Cadena", "Icono", "Componente", "Otros", "Object[]"});
        laminaTipoOpcion = new LaminaBotones("Confirmar", new String[]{"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"});
        laminaOpciones = new LaminaBotones("Opción", new String[]{"String[]", "Icon[]", "Object[]"});
        laminaEntrada = new LaminaBotones("Entrada", new String[]{"Campo de texto", "Combo"});
        setLayout(new BorderLayout());
        laminaCuadricula.add(laminaTipo);
        laminaCuadricula.add(laminaTipoMensajes);
        laminaCuadricula.add(laminaMensaje);
        laminaCuadricula.add(laminaTipoOpcion);
        laminaCuadricula.add(laminaOpciones);
        laminaCuadricula.add(laminaEntrada);
        JPanel laminaMostrar = new JPanel();
        JButton botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener(new AccionMostrar());
        laminaMostrar.add(botonMostrar);
        add(laminaMostrar, BorderLayout.SOUTH);
        add(laminaCuadricula, BorderLayout.CENTER);
    }
    
    public Object dameMensaje() {
        String s = laminaMensaje.dameSeleccion();
        switch (s) {
            case "Cadena":
                return cadenaMensaje;
            case "Icono":
                return iconoMensaje;
            case "Componente":
                return componenteMensaje;
            case "Otros":
                return objetoMensaje;
            case "Object[]":
                return new Object[] {
                    cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objetoMensaje
                };
            default:
                return null;
        }
    }
    
    public int dameTipo(LaminaBotones lamina) {
        String s = lamina.dameSeleccion();
        switch (s) {
            case "ERROR_MESSAGE":
            case "YES_NO_OPTION":
                return 0;
            case "INFORMATION_MESSAGE":
            case "YES_NO_CANCEL_OPTION":
                return 1;
            case "WARNING_MESSAGE":
            case "OK_CANCEL_OPTION":
                return 2;
            case "QUESTION_MESSAGE":
                return 3;
            case "PLAIN_MESSAGE":
            case "DEFAULT_OPTION":
                return -1;
            default:
                return 0;
        }
    }
    
    public Object[] dameOpciones(LaminaBotones lamina) {
        String s = lamina.dameSeleccion();
        switch (s) {
            case "String[]":
                return new String[]{"Amarillo", "Azul", "Rojo"};
            case "Icon[]":
                return new Object[]{new ImageIcon("src/graficos/imagenes/bola.png"), new ImageIcon("src/graficos/imagenes/bola.png"), new ImageIcon("src/graficos/imagenes/bola.png")};
            case "Object[]":
                return new Object[] {
                    cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objetoMensaje
                };
            default:
                return null;
        }
    }
    
    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(laminaTipo.dameSeleccion());
            switch (laminaTipo.dameSeleccion()) {
                case "Mensaje":
                    JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensajes));
                    break;
                case "Confirmar":
                    JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoOpcion), dameTipo(laminaTipoMensajes));
                    break;
                case "Entrada":
                    if(laminaEntrada.dameSeleccion().equals("Campo de texto")) {
                        JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensajes));
                    }
                    else {
                        JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensajes), null, new String[]{"Amarillo", "Azul", "Rojo"}, "Azul");
                    }
                    break;
                case "Opción":
                    JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Título", 0, dameTipo(laminaTipoMensajes), null, dameOpciones(laminaOpciones), null);
                    break;
                default:
                    break;
            }
        }
        
    }

}
