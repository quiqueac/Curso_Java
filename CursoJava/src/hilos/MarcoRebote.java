/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
//Marco con lámina y botones------------------------------------------------------------------------------
public class MarcoRebote extends JFrame {
    
    private final LaminaPelota lamina;
    private Thread t1, t2, t3;
    private final JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoRebote() {
        setBounds(600,300,400,350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones=new JPanel();
        arranca1 = new JButton("Hilo1");
        arranca1.addActionListener((ActionEvent e) -> {
            comienza_el_juego(e);
        });
        laminaBotones.add(arranca1);
        arranca2 = new JButton("Hilo2");
        arranca2.addActionListener((ActionEvent e) -> {
            comienza_el_juego(e);
        });
        laminaBotones.add(arranca2);
        arranca3 = new JButton("Hilo3");
        arranca3.addActionListener((ActionEvent e) -> {
            comienza_el_juego(e);
        });
        laminaBotones.add(arranca3);
        detener1 = new JButton("Detener1");
        detener1.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones.add(detener1);
        detener2 = new JButton("Detener2");
        detener2.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones.add(detener2);
        detener3 = new JButton("Detener3");
        detener3.addActionListener((ActionEvent e) -> {
            detener(e);
        });
        laminaBotones.add(detener3);
//        ponerBoton(laminaBotones, "Dale!", (ActionEvent evento) -> {
//            comienza_el_juego();
//        });
//        ponerBoton(laminaBotones, "Salir", (ActionEvent evento) -> {
//            System.exit(0);
//        });
//        ponerBoton(laminaBotones, "Detener", (ActionEvent evento) -> {
//            detener();
//        });
        add(laminaBotones, BorderLayout.SOUTH);
    }
    
    //Ponemos botones
//    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
//        JButton boton=new JButton(titulo);
//        c.add(boton);
//        boton.addActionListener(oyente);	
//    }

    //Añade pelota y la bota 1000 veces
    @SuppressWarnings("SleepWhileInLoop")
    public void comienza_el_juego(ActionEvent e) {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        Runnable r = new PelotaHilos(pelota, lamina);
        if(e.getSource().equals(arranca1)) {
            t1 = new Thread(r);
            t1.start();
        }
        else if(e.getSource().equals(arranca2)) {
            t2 = new Thread(r);
            t2.start();
        }
        else if(e.getSource().equals(arranca3)) {
            t3 = new Thread(r);
            t3.start();
        }
    }
    
    public void detener(ActionEvent e) {
        //t.stop();
        if(e.getSource().equals(detener1)) {
            t1.interrupt();
        }
        else if(e.getSource().equals(detener2)) {
            t2.interrupt();
        }
        else if(e.getSource().equals(detener3)) {
            t3.interrupt();
        }
    }
}
