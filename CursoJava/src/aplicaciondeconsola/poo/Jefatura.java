/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaciondeconsola.poo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public final class Jefatura extends Empleado implements Jefes
{
    private double incentivo;
    
    public Jefatura(String nombre)
    {
        super(nombre);
        incentivo = 100.20;
    }

    public void setIncentivo(double incentivo) 
    {
        this.incentivo = incentivo;
    }

    public double getIncentivo() 
    {
        return incentivo;
    }

    @Override
    public String getSeccion() 
    {
        String seccion = super.getSeccion();
        return seccion;
    }

    @Override
    public String TomarDecisiones(String decision)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double EstableceBonus(double gratificacion)
    {
        double prima = 2000;
        return Trabajadores.BONUS + gratificacion + prima;
    }
}
