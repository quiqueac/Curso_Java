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
public class MetodoVariableEstatico 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Empleado trabajadorEnrique = new Empleado("Enrique");
        Empleado trabajadorJuan = new Empleado("Juan");
        
        // Método estático
        System.out.println(Empleado.getId());
    }
    
}
