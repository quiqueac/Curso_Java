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
public class MarcoVentana extends JFrame
{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoVentana() throws HeadlessException
    {
        //setTitle("Respondiendo");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        //MVentana oyenteVentana = new MVentana();
        addWindowListener(new MVentana());
    }  
}
