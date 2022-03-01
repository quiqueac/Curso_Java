/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programaciongenerica.clasesgenericas;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 * @param <T>
 */
public class Pareja <T> {
    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }
    
}
