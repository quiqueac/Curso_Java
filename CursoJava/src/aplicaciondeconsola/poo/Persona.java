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
public abstract class Persona 
{
    private final String Apellido;

    public Persona(String Apellido) 
    {
        this.Apellido = Apellido;
    }

    public String getApellido() 
    {
        return Apellido;
    }
    
    public abstract String dameDescripcion();
}
