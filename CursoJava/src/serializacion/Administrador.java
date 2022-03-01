/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacion;

import programaciongenerica.arraylist.Empleado;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Administrador extends Empleado {
    
    private double incentivo;
    private static final long serialVersionUID = 1L;

    public Administrador(String n, double s, int agno, int mes, int dia) {
        super(n, s, agno, mes, dia);
        incentivo = 0;
    }
    
    @Override
    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        return sueldoBase+incentivo;
    }
    
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    
    @Override
    public String toString() {
        return super.toString()+ " Incentivo = " + incentivo;
    }
}
