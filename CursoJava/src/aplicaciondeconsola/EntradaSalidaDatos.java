/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

// import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EntradaSalidaDatos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /*
            Scanner entrada = new Scanner(System.in);
            String nombre;
            int edad;

            System.out.print("Escribe tu nombre, por favor: ");
            nombre = entrada.nextLine();

            System.out.print("Escribe tu edad, por favor: ");
            edad = entrada.nextInt();

            System.out.println("Hola " + nombre + " tienes " + edad + " años.");
        */
        
        /*
            String nombre;
            String edad;
            int edadUsuario;

            nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
            edad = JOptionPane.showInputDialog("Introduce tu edad, por favor: ");

            edadUsuario = Integer.parseInt(edad);

            System.out.println("Hola " + nombre + " tienes " + edadUsuario + " años.");
        */
        
        /*
            double x = 10.0;
            System.out.printf("%1.2f", x/3);
            System.out.println();
        */
        
        String numero;
        double numeroUsuario;
        
        numero = JOptionPane.showInputDialog("Introduce un número, por favor: ");
        numeroUsuario = Double.parseDouble(numero);
        
        System.out.print("La raíz de " + numeroUsuario + " es: ");
        System.out.printf("%1.4f", Math.sqrt(numeroUsuario));
        System.out.println();
    }
    
}
