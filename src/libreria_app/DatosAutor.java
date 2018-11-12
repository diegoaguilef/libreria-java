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
public class DatosAutor {
    private static ArrayList<Autor> autores = new ArrayList<>();
    public DatosAutor() {
    }
    
    public static void llenarAutores(){
        agregar(new Autor("Miguel de Unamuno", "España", new Fecha(29, 9, 1864)));
        agregar(new Autor("Marcela Paz", "Chile", new Fecha(28, 2, 1902)));
        agregar(new Autor("Oscar Wilde", "Irlanda", new Fecha(16, 10, 1854)));
        agregar(new Autor("Federico García Lorca", "España", new Fecha(5, 6, 1898)));
    }
    
    public static ArrayList<Autor> getAutores(){
        return autores;
    }
    
    public static int maxId(){
      int aux = 0, mId = 0;
      for(Autor autor : autores){
        if(autor.getId() > aux){
         mId = autor.getId();
         aux = mId;
        }
      }
      return mId;
    }
    
    /**
     * 
     * @param autor
     * @return 
     */
    public static boolean agregar(Autor autor){
      for(Autor xx: autores){
          if(xx.getNombre().equals(autor.getNombre())){
              return false;
          }
      }
      autor.setId(maxId() + 1);
      autores.add(autor);
      return true;
    }
    
    public static boolean eliminar(int id){
        int i = 0;
        for(Autor at: autores){
          if(at.getId() == id){
              autores.remove(i);
              return true;
          }
          i++;
        }
        return false;
    }
    /**
     * @param autor
     * @return 
    */
    public static boolean editar(Autor autor){
        int i = 0;
        for(Autor at: autores){
          if(at.getId() == autor.getId()){
              autores.set(i, autor);
              return true;
          }
          i++;
        }
        return false;
    }
    
    
    /**
     * 
     * @param nombre
     * @return 
     */
    
    public static Autor buscarId(int id){
        Autor autor = null;
        for(Autor at: autores){
            if(at.getId()== id){
                autor = at;
            }
        }
        return autor;
    }
    
    public static Autor buscarNombre(String nombre){
        Autor autor = null;
        for(Autor at: autores){
            if(at.getNombre().equals(nombre)){
                autor = at;
            }
        }
        return autor;
    }
    
}