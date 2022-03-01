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
public class MarcoPrincipal extends JFrame
{

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public MarcoPrincipal() throws HeadlessException
    {
        setTitle("Prueba varios");
        setBounds(1300, 100, 300, 200);
        LaminaPrincipal lamina = new LaminaPrincipal();
        add(lamina);
    }
    
}
