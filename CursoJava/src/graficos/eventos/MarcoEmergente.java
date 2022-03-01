/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoEmergente extends JFrame
{
    
    private static int contador = 0;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoEmergente(JButton botonPrincipal) throws HeadlessException
    {
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40 * contador, 40 * contador, 300, 150);
        CierraTodo oyenteCerrar = new CierraTodo();
        botonPrincipal.addActionListener(oyenteCerrar);
    }
    
    private class CierraTodo implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            dispose();
        }
        
    }
    
}
