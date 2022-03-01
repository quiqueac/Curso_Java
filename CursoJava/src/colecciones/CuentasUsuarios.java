/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CuentasUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente clientes[];
        clientes = new Cliente[5];
        clientes[0] = new Cliente("Antonio Banderas", "00001", 200000);
        clientes[1] = new Cliente("Rafael Nadal", "00002", 250000);
        clientes[2] = new Cliente("Penelope Cruz", "00003", 300000);
        clientes[3] = new Cliente("Julio Iglesias", "00004", 500000);
        clientes[4] = new Cliente("Antonio Banderas", "00001", 200000);
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        Set <Cliente> clientesBanco;
        clientesBanco = new HashSet<>();
        clientesBanco.add(clientes[0]);
        clientesBanco.add(clientes[1]);
        clientesBanco.add(clientes[2]);
        clientesBanco.add(clientes[3]);
        Iterator <Cliente> it = clientesBanco.iterator();
        while(it.hasNext()) {
            String nombreCliente;
            nombreCliente = it.next().getNombre();
            if(nombreCliente.equals("Julio Iglesias")) {
                it.remove();
            }
        }
        clientesBanco.stream().forEach((Cliente cliente) -> {
            System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());
            /*
            if(cliente.equals("Julio Iglesias")) {
                clientesBanco.remove(cliente);
            }
            */
        });
    }
    
}
