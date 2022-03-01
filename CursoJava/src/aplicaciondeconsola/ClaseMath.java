/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClaseMath 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double raiz;
        double numeros;
        float numero;
        int resultado;
        
        raiz = Math.sqrt(9);
        numero = 5.85F;
        resultado = Math.round(numero);
        
        System.out.println(raiz);
        System.out.println(resultado);
        
        numeros = 6.85;
        resultado = (int) Math.round(numeros);
        
        System.out.println(resultado);
        
        double base;
        double exponente;
        
        base = 5;
        exponente = 3;
        
        resultado = (int) Math.pow(base, exponente);
        
        System.out.println(resultado);
    }
    
}
