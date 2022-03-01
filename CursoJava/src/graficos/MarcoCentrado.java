/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MarcoCentrado extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoCentrado() throws HeadlessException
    {
        Toolkit miPantalla = getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Marco centrado");
        Image miIcono = miPantalla.getImage("hat.png");
        setIconImage(miIcono);
    }
    
}
