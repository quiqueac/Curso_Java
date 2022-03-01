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
public class Libro {
    private final String titulo;
    private final String autor;
    private final int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }
    
    public String getDatos() {
        return "El título es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Libro) {
            Libro otro = (Libro) obj;
            return this.ISBN == otro.ISBN;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.ISBN;
        return hash;
    }
    
}
