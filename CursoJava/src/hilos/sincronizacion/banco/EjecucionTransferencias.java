/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos.sincronizacion.banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EjecucionTransferencias implements Runnable {
    
    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;

    public EjecucionTransferencias(Banco b, int de, double max) {
        banco = b;
        deLaCuenta = de;
        cantidadMax = max;
    }

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        while(true) {
            int paraLaCuenta = (int)(100 * Math.random());
            double cantidad = cantidadMax * Math.random();
            try {
                banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(EjecucionTransferencias.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep((int)(Math.random() * 10));
            } catch (InterruptedException ex) {
                Logger.getLogger(EjecucionTransferencias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
