/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.eventos;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoBotones extends JFrame
{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoBotones() throws HeadlessException
    {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    } 
}
