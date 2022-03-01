/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
// Lámina que dibuja las pelotas----------------------------------------------------------------------
public class LaminaPelota extends JPanel {
    
    private final ArrayList<Pelota> pelotas = new ArrayList<>();
    
    //Añadimos pelota a la lámina
    public void add(Pelota b) {
        pelotas.add(b);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        pelotas.stream().forEach((b) -> {
            g2.fill(b.getShape());
        });
    }
}
