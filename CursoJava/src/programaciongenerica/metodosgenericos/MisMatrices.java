/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programaciongenerica.metodosgenericos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MisMatrices {

    /**
     *
     * @param <T>
     * @param a
     * @return
     */
    public static <T extends Comparable> T getMenor(T [] a) {
        
        T elementoMenor = a[0];
        
        if (a == null || a.length == 0) {
            return null;
        }
        
        for(int i = 1; i < a.length; i++) {
            if(elementoMenor.compareTo(a[i]) > 0) {
                elementoMenor = a[i];
            }
        }
        
        return elementoMenor;
    }
}
