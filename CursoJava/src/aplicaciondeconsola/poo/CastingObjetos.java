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
public class CastingObjetos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Empleado miEmpleado = new Jefatura("Enrique");
        
        // Casting
        Jefatura jefazo = (Jefatura) miEmpleado;
    }
    
}
