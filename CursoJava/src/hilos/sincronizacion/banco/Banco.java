/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos.sincronizacion.banco;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Banco {
    private final double[] cuentas;
    //private final Lock cierreBanco = new ReentrantLock();
    //private final Condition saldoSuficiente;

    public Banco() {
        cuentas = new double[100];
        for(int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 2000;
        }
        //saldoSuficiente = cierreBanco.newCondition();
    }
    
    @SuppressWarnings("UnnecessaryReturnStatement")
    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
        //cierreBanco.lock();
        //try {
            while(cuentas[cuentaOrigen] < cantidad) {
                //saldoSuficiente.await();
                wait();
            }
            System.out.println(Thread.currentThread());
            cuentas[cuentaOrigen] -= cantidad;
            System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
            cuentas[cuentaDestino] += cantidad;
            System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
            //saldoSuficiente.signalAll();
            notifyAll();
        //}
    }
    
    public double getSaldoTotal() {
        double sumaCuentas = 0;
        for(double a : cuentas) {
            sumaCuentas += a;
        }
        return sumaCuentas;
    }
}
