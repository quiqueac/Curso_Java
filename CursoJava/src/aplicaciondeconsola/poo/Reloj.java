/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaciondeconsola.poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Reloj
{
    public void enMarcha(int intervalo, final boolean sonido)
    {
        class DameLaHora implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 sg: " + ahora);
                if (!sonido)
                {
                    System.out.println("Error");
                }
                else
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }
}
