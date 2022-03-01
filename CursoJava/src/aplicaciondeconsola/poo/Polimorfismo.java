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
public class Polimorfismo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Empleado [] misEmpleados = new Empleado[3];
        Jefatura jefe = new Jefatura("Enrique");
        
        misEmpleados[0] = new Empleado("Jorge");
        misEmpleados[1] = jefe;
        misEmpleados[2] = new Jefatura("Vargas");
    }
    
}
