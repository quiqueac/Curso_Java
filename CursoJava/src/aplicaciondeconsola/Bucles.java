/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeconsola;

import javax.swing.JOptionPane;
//import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Bucles 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        /*
            String clave;
            String pass;

            clave = "Enrique";
            pass = "";

            while(clave.equals(pass) == false)
            {
                pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor: ");

                if (clave.equals(pass) == false)
                {
                    System.out.println("Contraseña incorrecta.");
                }
            }

            System.out.println("Contraseña correcta. Acceso permitido");
        */
        /*
            Scanner entrada;
            int aleatorio;
            int numero;
            int intentos;

            aleatorio = (int)(Math.random() * 100);
            entrada = new Scanner(System.in);
            numero = 0;
            intentos = 0;

            while(numero != aleatorio)
            {
                intentos++;

                System.out.println("Introduce un número, por favor: ");
                numero = entrada.nextInt();

                if(aleatorio < numero)
                {
                    System.out.println("Más bajo.");
                }
                else
                {
                    System.out.println("Más alto.");
                }
            }
            System.out.println("Correcto, lo has conseguido en " + intentos + " intentos.");
        */
        /*
            String genero;

            do
            {
                genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
            } while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        */
        /*
            for (int i = 0; i < 10; i++)
            {
                System.out.println(i + 1);
            }
        */
        String mail;
        boolean arroba;
        
        mail = JOptionPane.showInputDialog("Introduce mail");
        arroba = false;
        
        for (int i = 0; i < mail.length(); i++)
        {
            if (mail.charAt(i) == '@')
            {
                arroba = true;
                break;
            }
        }
        
        if (arroba == true)
        {
            System.out.println("Es correcto.");
        }
        else
        {
            System.out.println("Es incorrecto.");
        }
    }
    
}
