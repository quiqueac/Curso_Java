/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaciondeconsola.poo;
import java.util.GregorianCalendar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Empleado extends Persona implements Trabajadores
{
    private GregorianCalendar calendario;
    private final String nombre;
    private String seccion;
    private static int id;
    
    public Empleado(String nombre) 
    {
        this(nombre, 23, 5, 2002);
    }
    
    public Empleado(String nombre, int dia, int mes, int agno)
    {
        super("Ayala");
        this.nombre = nombre;
        seccion = "Administración";
        id += 1;
        calendario = new GregorianCalendar(dia, mes - 1, agno);
    }
    
    public void setSeccion(String seccion)
    {
        this.seccion = seccion;
    }

    public String getSeccion() 
    {
        return seccion;
    }
    
    public static int getId()
    {
        return id;
    }

    @Override
    public String dameDescripcion()
    {
        return "Hola desde empleado";
    }

    @Override
    public double EstableceBonus(double gratificacion)
    {
        double prima = 5000;
        return Trabajadores.BONUS + gratificacion + prima;
    }
}
