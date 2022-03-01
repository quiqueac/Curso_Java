/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoServidor extends JFrame implements Runnable {
    
    private final JTextArea areatexto;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "CallToThreadStartDuringObjectConstruction"})
    public MarcoServidor() throws HeadlessException {
        setBounds(1200, 300, 280, 350);				
        JPanel milamina = new JPanel();
        milamina.setLayout(new BorderLayout());
        areatexto = new JTextArea();
        milamina.add(areatexto,BorderLayout.CENTER);
        add(milamina);
        setVisible(true);
        Thread miHilo = new Thread(this);
        miHilo.start();
    }

    @Override
    @SuppressWarnings("null")
    public void run() {
        //System.out.println("Estoy a la escucha");
        ServerSocket servidor;
        try {
            servidor = new ServerSocket(8082);
            String nick, ip, mensaje;
            ArrayList <String> listaIp = new ArrayList <>();
            PaqueteEnvio paqueteRecibido;
            while(true) {
                try (Socket miSocket = servidor.accept()) {
                //InetAddress localizacion = miSocket.getInetAddress();
                //String ipRemota = localizacion.getHostAddress();
                //System.out.println("Online " + ipRemota);
                //DataInputStream flujoEntrada;
                //flujoEntrada = new DataInputStream(miSocket.getInputStream());
                //String mensajeTexto = flujoEntrada.readUTF();
                //areatexto.append("\n" + mensajeTexto);
                ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());
                paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
                nick = paqueteRecibido.getNick();
                ip = paqueteRecibido.getIp();
                mensaje = paqueteRecibido.getMensaje();
                if(!mensaje.equals(" online")) {
                    areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
                    //System.out.println("\n" + nick + ": " + mensaje + " para " + ip);
                    try (Socket enviaDestinatario = new Socket(ip, 9090)) {
                        try (ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream())) {
                            paqueteReenvio.writeObject(paqueteRecibido);
                        }
                        enviaDestinatario.close();
                    }
                    miSocket.close();
                }
                else {
                    InetAddress localizacion = miSocket.getInetAddress();
                    String ipRemota = localizacion.getHostAddress();
                    System.out.println("Online " + ipRemota);
                    listaIp.add(ipRemota);
                    paqueteRecibido.setIps(listaIp);
                    for (String z : listaIp) {
                        System.out.println("Array: " + z);
                        Socket enviaDestinatario = null;
                        try {
                            enviaDestinatario = new Socket(z, 9090);
                        } catch (IOException ex) {
                            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ObjectOutputStream paqueteReenvio = null;
                        try {
                            paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
                        } catch (IOException ex) {
                            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            paqueteReenvio.writeObject(paqueteRecibido);
                        } catch (IOException ex) {
                            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            enviaDestinatario.close();
                        } catch (IOException ex) {
                            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            miSocket.close();
                        } catch (IOException ex) {
                            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
