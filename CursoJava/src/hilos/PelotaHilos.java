/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PelotaHilos implements Runnable {
    
    private final Pelota pelota;
    private final Component componente;

    public PelotaHilos(Pelota unaPelota, Component unComponente) {
        pelota = unaPelota;
        componente = unComponente;
    }
    

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());
        while(!Thread.currentThread().isInterrupted()) {
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(MarcoRebote.class.getName()).log(Level.SEVERE, null, ex);
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
    }
}
