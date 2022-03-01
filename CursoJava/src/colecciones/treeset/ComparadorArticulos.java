/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones.treeset;

import java.util.Comparator;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ComparadorArticulos implements Comparator <Articulo> {

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();
        return descripcionA.compareTo(descripcionB);
    }

}
