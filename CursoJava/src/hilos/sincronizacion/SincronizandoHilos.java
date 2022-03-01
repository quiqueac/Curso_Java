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
public class SincronizandoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HilosVarios hilo1 = new HilosVarios();
        HilosVariosA hilo2 = new HilosVariosA(hilo1);
        hilo2.start();
        hilo1.start();
        System.out.println("Terminadas todas las tareas");
    }
    
}
