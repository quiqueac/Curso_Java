/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos.sincronizacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HilosVariosA extends Thread {
    
    private final Thread hilo;

    public HilosVariosA(Thread hilo) {
        this.hilo = hilo;
    }
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosVariosA.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i < 15; i++) {
            try {
                System.out.println("Ejecutando hilo" + getName());
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(HilosVarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
