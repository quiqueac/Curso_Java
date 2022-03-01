/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libroA;
        Libro libroB;
        libroA = new Libro("P en Java", "Juan", 25);
        libroB = new Libro("P en Java", "Juan", 25);
        //libroA = libroB;
        if(libroA.equals(libroB)) {
            System.out.println("Es el mismo libro");
            System.out.println(libroA.hashCode());
            System.out.println(libroB.hashCode());
        }
        else {
            System.out.println("No es el mismo libro");
            System.out.println(libroA.hashCode());
            System.out.println(libroB.hashCode());
        }
    }
    
}
