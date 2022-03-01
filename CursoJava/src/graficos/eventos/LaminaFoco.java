/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaFoco extends JPanel
{
    JTextField cuadro1;
    JTextField cuadro2;
    
    @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       setLayout(null);
       cuadro1 = new JTextField();
       cuadro2 = new JTextField();
       cuadro1.setBounds(120, 10, 150, 20);
       cuadro2.setBounds(120, 50, 150, 20);
       add(cuadro1);
       add(cuadro2);
       LanzaFocos elFoco = new LanzaFocos();
       cuadro1.addFocusListener(elFoco);
    }
    
    private class LanzaFocos implements FocusListener
    {

        @Override
        public void focusGained(FocusEvent e)
        {
        }

        @Override
        public void focusLost(FocusEvent e)
        {
            System.out.println("He perdido el foco");
            String email = cuadro1.getText();
            boolean comprobacion = false;
            for(int i = 0; i < email.length(); i++)
            {
                if(email.charAt(i) == '@')
                {
                    comprobacion = true;
                    break;
                }
            }
            if(comprobacion)
            {
                System.out.println("Correcto");
            }
            else
            {
                System.out.println("Incorrecto");
            }
        }
    
    }
}
