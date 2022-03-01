/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos.disposiciones;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EnColumnas implements LayoutManager {
    
    private int x = 20;
    private int y = 20;

    @Override
    public void addLayoutComponent(String name, Component comp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container parent) {
        int d = parent.getWidth();
        x = d / 2;
        int contador = 0;
        int n = parent.getComponentCount();
        for(int i = 0; i < n; i++) {
            contador++;
            Component c = parent.getComponent(i);
            c.setBounds(x - 100, y, 100, 20);
            x += 100;
            if(contador % 2 == 0) {
                x = d / 2;
                y += 40;
            }
        }
    }

}
