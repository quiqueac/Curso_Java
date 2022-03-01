/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LaminaConFiguras extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
        //g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.BLUE);
        g2.draw(rectangulo);
        g2.setPaint(Color.RED);
        //g2.draw(rectangulo);
        g2.fill(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        Color miColor = new Color(125, 189, 200);
        //g2.setPaint(new Color(0, 140, 255).brighter());
        //g2.setPaint(new Color(0, 140, 255).darker());
        g2.setPaint(miColor);
        //g2.draw(elipse);
        g2.fill(elipse);
        /*
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
        g2.draw(circulo);
        */
    }
}
