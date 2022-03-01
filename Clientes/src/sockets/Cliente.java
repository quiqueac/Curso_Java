package sockets;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.Serializable;

public class Cliente {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MarcoCliente mimarco = new MarcoCliente();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class LaminaMarcoCliente extends JPanel implements Runnable {
    private final JTextField campo1, nick, ip;
    private final JButton miboton;
    private final JTextArea campoChat;
    
    @SuppressWarnings({"OverridableMethodCallInConstructor", "CallToThreadStartDuringObjectConstruction"})
    public LaminaMarcoCliente() {
        nick = new JTextField(5);
        add(nick);
        ip = new JTextField(8);
        JLabel texto = new JLabel("-CHAT-");
        add(texto);
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
                campoChat.append("\n" + paqueteRecibido.getNick() + ": " + paqueteRecibido.getMensaje());
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private class EnviaTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                try ( //System.out.println(campo1.getText());
                        Socket miSocket = new Socket("192.168.160.1", 8082)) {
                        PaqueteEnvio datos = new PaqueteEnvio();
                        datos.setNick(nick.getText());
                        datos.setIp(ip.getText());
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

class MarcoCliente extends JFrame {
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCliente() {
        setBounds(600, 300, 280, 350);
        LaminaMarcoCliente milamina = new LaminaMarcoCliente();
        add(milamina);
        setVisible(true);
    }	
}

class PaqueteEnvio implements Serializable {
    private String nick, ip, mensaje;

    public PaqueteEnvio() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}

