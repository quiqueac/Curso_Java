/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EnvioOnline extends WindowAdapter {
    
    @Override
    public void windowOpened(WindowEvent e) {
        try (Socket miSocket = new Socket("192.168.160.1", 8082)) {
            PaqueteEnvio datos = new PaqueteEnvio();
            datos.setMensaje(" online");
            ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream());
            paqueteDatos.writeObject(datos);
        } catch (IOException ex) {
            Logger.getLogger(EnvioOnline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
