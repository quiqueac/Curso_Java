/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programaciongenerica.arraylistgenerico;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ArrayList {
    private int i = 0;
    private final Object[] datosElemento;

    public ArrayList(int z) {
        datosElemento = new Object[z];
    }

    public Object get(int i) {
        return datosElemento[i];
    }
    
    public void add(Object o) {
        datosElemento[i] = o;
        i++;
    }
}
