/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Calculos {
    private static int resultado;
    
    public static int suma(int numeroA, int numeroB) {
        resultado = numeroA + numeroB;
        return resultado;
    }
    
    public static int resta(int numeroA, int numeroB) {
        resultado = numeroA - numeroB;
        return resultado;
    }
    
    public static int multiplicacion(int numeroA, int numeroB) {
        resultado = numeroA * numeroB;
        return resultado;
    }
    
    public static int division(int numeroA, int numeroB) {
        resultado = numeroA / numeroB;
        return resultado;
    }
}
