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
public class PruebaListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        LinkedList <String> paises;
        paises = new LinkedList <>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("México");
        paises.add("Perú");
        
        LinkedList <String> capitales;
        capitales = new LinkedList <>();
        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");
        
        System.out.println(paises);
        System.out.println(capitales);
        
        ListIterator <String> iterarPaises = paises.listIterator();
        ListIterator <String> iterarCapitales = capitales.listIterator();
        
        while(iterarCapitales.hasNext()) {
            if(iterarPaises.hasNext()) {
                iterarPaises.next();
            }
            iterarPaises.add(iterarCapitales.next());
        }
        System.out.println(paises);
//        iterarCapitales = capitales.listIterator();
//        while(iterarCapitales.hasNext()) {
//            iterarCapitales.next();
//            if(iterarCapitales.hasNext()) {
//                iterarCapitales.next();
//                iterarCapitales.remove();
//            }
//        }
        paises.removeAll(capitales);
        System.out.println(paises);
    }
    
}
