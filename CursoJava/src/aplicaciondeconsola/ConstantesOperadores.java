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
public class ConstantesOperadores 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        // Constante
        final double pulgadas;
        pulgadas = 254;
        
        // Operadores
        int a;
        int b;
        int c;
        
        a = 5;
        b = 7;
        
        c = a + b;
        
        System.out.println(c);
        
        c = a + b;
        c++;
        
        System.out.println(c);
        
        c = a + b;
        c += 6;
        
        System.out.println(c);
        
        c = a + b;
        c -= 6;
        
        System.out.println(c);
        
        c = a + b;
        c /= 6;
        
        System.out.println(c);
        
        c = a / b;
        
        System.out.println(c);
        
        final double Pulgadas;
        double cm;
        double resultado;
        
        Pulgadas = 2.54;
        cm = 6;
        resultado = cm / Pulgadas;
        
        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas.");
    }
    
}
