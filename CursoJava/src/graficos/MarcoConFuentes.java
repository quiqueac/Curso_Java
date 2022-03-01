/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoConFuentes extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoConFuentes() throws HeadlessException
    {
        setTitle("Prueba con fuentes");
        setSize(400, 400);
        LaminaConFuentes miLamina = new LaminaConFuentes();
        add(miLamina);
        miLamina.setForeground(Color.BLUE);
    }
    
}
