/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AtraparExcepciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            BufferedImage imagen = ImageIO.read(new File("src"));
            // ArrayIndexOutOfBoundsException excepcion = new ArrayIndexOutOfBoundsException();
            // throw excepcion;
        }
        catch(IOException e)
        {
            System.out.println("La imágen no se encuentra.");
        }
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");
		
        try (Scanner entrada = new Scanner (System.in))
        {
            int decision=entrada.nextInt();
            
            if (decision == 1)
            {
                pedirDatos();
            }
            else
            {
                System.out.println("Adios");
                System.exit(0);
            }
        }
    }
    static void pedirDatos()
    {
        try (Scanner entrada = new Scanner(System.in))
        {
            System.out.println("Introduce tu nombre, por favor");
            
            String nombre_usuario=entrada.nextLine();
            
            System.out.println("Introduce edad, por favor");
            
            int edad=entrada.nextInt();
            
            System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Ha ocurrido un error.");
        }
	System.out.println("Hemos terminado");	
    }
}
