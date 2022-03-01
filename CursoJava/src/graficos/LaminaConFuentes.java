/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaConFuentes extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Font miFuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(miFuente);
        g2.setColor(Color.BLUE);
        g2.drawString("Juan", 100, 100);
        g2.setFont(new Font("Arial", Font.ITALIC, 14));
        g2.setColor(new Color(128, 90, 50));
        g2.drawString("Curso de Java", 100, 200);
    }
}
