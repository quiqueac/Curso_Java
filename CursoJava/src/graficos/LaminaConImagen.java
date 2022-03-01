/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaConImagen extends JPanel
{
    private Image imagen;

    public LaminaConImagen()
    {
        File miImagen  = new File("src/graficos/imagenes/bola.png");
        try
        {
            imagen = ImageIO.read(miImagen);
        }
        catch (IOException ex)
        {
            Logger.getLogger(LaminaConImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //int anchuraImagen = imagen.getWidth(this);
        //int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 5, 5, null);
        for(int i = 0; i < 300; i++)
        {
            for(int j = 0; j < 200; j++)
            {
                g.copyArea(0, 0, 20, 20, 20 * i, 20 * j);
            }
        }
        //g.copyArea(0, 0, 15, 15, 150, 75);
    }
}
