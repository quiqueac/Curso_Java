/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> personas;
        personas = new LinkedList <>();
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");
        System.out.println(personas.size());
        //personas.add("Juan");
        ListIterator <String> it = personas.listIterator();
        it.next();
        it.add("Juan");
        personas.stream().forEach((persona) -> {
            System.out.println(persona);
        });
    }
    
}
