/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones.mapa;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre) {
        this.nombre = nombre;
        sueldo = 2000;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
}
