/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Condicionales 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /*
            String nombre;
            String edad;
            int edadUsuario;

            nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
            edad = JOptionPane.showInputDialog("Introduce tu edad, por favor: ");

            edadUsuario = Integer.parseInt(edad);

            if (edadUsuario > 17)
            {
                System.out.println("Hola " + nombre + " tienes " + edadUsuario + " años.");
            }
            else
            {
                System.out.println("Eres menor de edad.");
            }
        */
        Scanner entrada = new Scanner(System.in);
        int figura;
        
        System.out.println("Elige una opción: \n1: cuadrado.\n2: rectángulo.\n3: triángulo.\n4: círculo.");
        figura = entrada.nextInt();
        
        switch(figura)
        {
            case 1:
                int lado;
                
                lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                
                System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
                break;
            case 2: 
                int base;
                int altura;
                
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                
                System.out.println("El área del triángulo es " + base * altura);
                break;
            case 3: 
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                
                System.out.println("El área del triángulo es " + (base * altura) / 2);
                break;
            case 4:
                int radio;
                
                radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                
                System.out.print("El área del círculo es ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;
            default:
                System.out.println("La opción no es correcta.");
        }
    }
}
