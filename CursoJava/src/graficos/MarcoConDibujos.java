/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoConDibujos extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoConDibujos() throws HeadlessException
    {
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
        //miLamina.setBackground(Color.PINK);
        miLamina.setBackground(SystemColor.window);
    }
    
}
