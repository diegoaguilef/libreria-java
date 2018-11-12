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

    public static void llenar() {
        Autor unamuno = new Autor("Miguel de Unamuno", "España", new Fecha(29, 9, 1864));
        agregar(new Libro("La esfinge","La mia",1898,10,unamuno));
        agregar(new Libro("La venda","La Casa",1899,10,unamuno));
        agregar(new Libro("La difunta","La mia",1909,10,unamuno));
        
        Autor marcela_paz = new Autor("Marcela Paz", "Chile", new Fecha(28, 2, 1902));
        agregar(new Libro("Soy colorina","LaCasa",1935,10,marcela_paz));
        agregar(new Libro("Papelucho casi huérfano","LaCasa",1951,10,marcela_paz));
        agregar(new Libro("Los Pecosos","LaBolsa",1980,10,marcela_paz));
    }
    
    public static int maxId(){
      int aux = 0, mId = 0;
      for(Libro libro : libros){
        if(libro.getId() > aux){
         mId = libro.getId();
         aux = mId;
        }
      }
      return mId;
    }
    
    public static ArrayList<Libro> getLibros(){
        return libros;
    }
    
    /**
     * 
     * @param libro
     * @return 
     */
    public static boolean agregar(Libro libro){
      if(libro != null){
        for(Libro lb:libros){
          if (lb.getNombre().equals(libro.getNombre())){  
              return false;
          }
        }
      }
      libro.setId(maxId() + 1);
      libros.add(libro);
      return true;
    }
    
    /**
     * 
     * @param libro
     * @return 
     */
    public static boolean eliminar(int id){
        int i = 0;
        for(Libro lb: libros){
          if(lb.getId() == id){
              libros.remove(i);
              return true;
          }
          i++;
        }
        return false;
    }
    
    /**
     * 
     * @param libro
     * @return 
     */
    public static boolean editar(Libro libro){
        int i = 0;
        for(Libro lb: libros){
          if(lb.getId() == libro.getId()){
            libros.set(i, libro);
            return true;
          }
          i++;
        }
        return false;
    }
    
    /**
     * 
     * @param autor
     * @return 
     */
    public static ArrayList<Libro> buscarLibrosAutor(String autor){
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for(Libro book:libros){
            if(book.getAutor().getNombre().equals(autor)){
                librosEncontrados.add(book);
            }
        }
        
        return librosEncontrados;
    }
    
    /**
     * 
     * @param nombreLibro
     * @return 
     */
    public static Libro buscarNombre(String nombreLibro){
        Libro libro = new Libro();
        boolean existe = false;
        for(Libro book:libros){
            if(book.getNombre().equals(nombreLibro)){
                return book;
            }
        }
        
        return libro;
    }
    
    public static Libro buscarId(int id){
        Libro libro = null;
        for(Libro book:libros){
            if(book.getId() == id){
                return book;
            }
        }
        
        return libro;
    }
}
