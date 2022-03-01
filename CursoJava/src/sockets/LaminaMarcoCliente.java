/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaMarcoCliente extends JPanel implements Runnable {
    private final JTextField campo1;
    private final JComboBox ip;
    private final JLabel nick;
    private final JButton miboton;
    private final JTextArea campoChat;
    
    @SuppressWarnings({"OverridableMethodCallInConstructor", "CallToThreadStartDuringObjectConstruction"})
    public LaminaMarcoCliente() {
        String nickUsuario = JOptionPane.showInputDialog("Nick: ");
        JLabel nNick = new JLabel("Nick: ");
        add(nNick);
        nick = new JLabel();
        nick.setText(nickUsuario);
        add(nick);
        JLabel texto = new JLabel("Online: ");
        add(texto);
        ip = new JComboBox();
        /*
        ip.addItem("Usuario 1");
        ip.addItem("Usuario 2");
        ip.addItem("Usuario 3");
        */
        //ip.addItem("192.168.160.2");
        //ip.addItem("192.168.160.3");
        add(ip);
        campoChat = new JTextArea(12, 20);
        add(campoChat);
        campo1 = new JTextField(20);
        add(campo1);
        miboton = new JButton("Enviar");
        EnviaTexto miEvento = new EnviaTexto();
        miboton.addActionListener(miEvento);
        add(miboton);
        Thread mihilo = new Thread(this);
        mihilo.start();
    }

    @Override
    public void run() {
        try {
            ServerSocket servidorCliente = new ServerSocket(9090);
            Socket cliente;
            PaqueteEnvio paqueteRecibido;
            while(true) {
                cliente = servidorCliente.accept();
                ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
                paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();
                if(!paqueteRecibido.getMensaje().equals(" online")) {
                    campoChat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
                }
                else {
                    //campoChat.append("\n" + paqueteRecibido.getIps());
                    @SuppressWarnings("UnusedAssignment")
                    ArrayList <String> IpsMenu = new ArrayList <>();
                    IpsMenu = paqueteRecibido.getIps();
                    ip.removeAllItems();
                    for(String z : IpsMenu) {
                        ip.addItem(z);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private class EnviaTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                campoChat.append("\n" + campo1.getText());
                try ( //System.out.println(campo1.getText());
                        Socket miSocket = new Socket("192.168.160.1", 8082)) {
                        PaqueteEnvio datos = new PaqueteEnvio();
                        datos.setNick(nick.getText());
                        datos.setIp((String) ip.getSelectedItem());
                        datos.setMensaje(campo1.getText());
                    try (ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream())) {
                        paqueteDatos.writeObject(datos);
                        paqueteDatos.close();
                        miSocket.close();
                        //try (DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream())) {
                        //    flujoSalida.writeUTF(campo1.getText());
                        //}
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
