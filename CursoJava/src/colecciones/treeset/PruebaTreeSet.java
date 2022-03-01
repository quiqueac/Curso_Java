/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet <String> ordenaPersonas = new TreeSet <>();
        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");
        ordenaPersonas.stream().forEach((s) -> {
            System.out.println(s);
        });
        Articulo primero = new Articulo(1, "Primer artículo");
        Articulo segundo = new Articulo(2, "Segundo artículo");
        Articulo tercero = new Articulo(3, "Tercer artículo");
        TreeSet <Articulo> ordenaArticulos = new TreeSet <>();
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(primero);
        ordenaArticulos.stream().forEach((Articulo art) -> {
            System.out.println(art.getDescripcion());
        });
        //ComparadorArticulos comparaArticulos = new ComparadorArticulos();
        TreeSet <Articulo> ordenaArticulosA = new TreeSet <>((Articulo o1, Articulo o2) -> {
            String descripcionA = o1.getDescripcion();
            String descripcionB = o2.getDescripcion();
            return descripcionA.compareTo(descripcionB);
        });
        ordenaArticulosA.add(primero);
        ordenaArticulosA.add(segundo);
        ordenaArticulosA.add(tercero);
        ordenaArticulosA.stream().forEach((Articulo art) -> {
            System.out.println(art.getDescripcion());
        });
    }
}
