/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica.metodosgenericos;

import java.util.GregorianCalendar;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MetodosGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[] = {"José", "María", "Pepe"};
        String elementos = MisMatrices.getMenor(nombres);
        System.out.println(elementos);
        //Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500, 2, 1), new Empleado("Ana", 45, 2500, 2, 1), new Empleado("Ana", 45, 2500, 2, 1), new Empleado("Ana", 45, 2500, 2, 1)};
        //System.out.println(MisMatrices.getMenor(listaEmpleados));
        GregorianCalendar fechas[] = {new GregorianCalendar(2015, 07, 12), new GregorianCalendar(2015, 07, 12)};
        System.out.println(MisMatrices.getMenor(fechas).getTime());
    }
    
}
