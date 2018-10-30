/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app;

import java.util.ArrayList;

/**
 *
 * @author kdieg
 */
public class DatosLibro {
    private static ArrayList<Libro> libros = new ArrayList<>();

    public static void llenarLibros() {
        Autor unamuno = new Autor("Miguel de Unamuno", "España", 1);
        libros.add(new Libro("La esfinge","La mia",1898,10,unamuno));
        libros.add(new Libro("La venda","La Casa",1899,10,unamuno));
        libros.add(new Libro("La difunta","La mia",1909,10,unamuno));
        
        Autor marcela_paz = new Autor("Marcela Paz", "Chile", 2);
        libros.add(new Libro("Soy colorina","LaCasa",1935,10,marcela_paz));
        libros.add(new Libro("Papelucho casi huérfano","LaCasa",1951,10,marcela_paz));
        libros.add(new Libro("Los Pecosos","LaBolsa",1980,10,marcela_paz));
    }
    
    public static ArrayList<Libro> getLibros(){
        return libros;
    }
    
    public static ArrayList<Libro> buscarLibrosAutor(String autor){
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for(Libro book:libros){
            System.out.println(autor);
            System.out.println(book.getAutor().getNombre());
            if(book.getAutor().getNombre().equals(autor)){
                librosEncontrados.add(book);
            }
        }
        
        return librosEncontrados;
    }
    
    public static Libro buscarLibro(String nombreLibro){
        Libro libro = new Libro();
        boolean existe = false;
        for(Libro book:libros){
            if(book.getNombre().equals(nombreLibro)){
                return book;
            }
        }
        
        return libro;
    }
    
    
    
    
}
