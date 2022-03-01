/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones.treeset;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Articulo implements Comparable <Articulo> {
    private final int numeroArticulo;
    private final String descripcion;

    public Articulo(int numeroArticulo, String descripcion) {
        this.numeroArticulo = numeroArticulo;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        return numeroArticulo - o.numeroArticulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

}
