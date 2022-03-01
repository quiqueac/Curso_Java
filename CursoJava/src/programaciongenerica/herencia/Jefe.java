/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programaciongenerica.herencia;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Jefe extends Empleado {

    public Jefe(String n, double s, int agno, int mes, int dia) {
        super(n, s, agno, mes, dia);
    }
    
    public double incentivo(double inc) {
        return inc;
    }

}
