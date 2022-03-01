/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
//Movimiento de la pelota-----------------------------------------------------------------------------------------
public class Pelota {
    
    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
    
    // Mueve la pelota invirtiendo posición si choca con límites
    public void mueve_pelota(Rectangle2D limites) {
        x += dx;
        y += dy;
        
        if(x < limites.getMinX()) {
            x = limites.getMinX();
            dx =- dx;
        }
        
        if(x + TAMX >= limites.getMaxX()) {
            x = limites.getMaxX() - TAMX;
            dx =- dx;
        }
		
        if(y < limites.getMinY()) {
            y = limites.getMinY();
            dy =- dy;
        }
        
        if(y + TAMY >= limites.getMaxY()){
            y = limites.getMaxY() - TAMY;
            dy =- dy;
        }
    }
	
    //Forma de la pelota en su posición inicial
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x,y,TAMX,TAMY);
    }	
}
