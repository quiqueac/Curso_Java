/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaciondeconsola.poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DarHora implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Date hora = new Date();
        System.out.println("Te pongo la hora cada 5 sg: " + hora);
        Toolkit.getDefaultToolkit().beep();
    }
}
