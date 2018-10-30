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
        autores.add(new Autor("Miguel de Unamuno", "España", 1));
        autores.add(new Autor("Marcela Paz", "Chile", 2));
        autores.add(new Autor("Oscar Wilde", "Irlanda", 3));
        autores.add(new Autor("Federico García Lorca", "España", 4));
    }
    
    public static ArrayList<Autor> getAutores(){
        return autores;
    }
    
    public boolean agregarAutor(Autor autor){
        for(Autor xx: autores){
            if(xx.getAutorId() != autor.getAutorId()){
                return false;
            }
        }
        autores.add(autor);
        return true;
    }
    
    public boolean eliminarAutor(Autor autor){
        int i = 0;
        for(Autor at: autores){
            if(at.getAutorId() == autor.getAutorId()){
                autores.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean editarAutor(Autor autor){
        int i = 0;
        for(Autor at: autores){
            if(at.getAutorId() == autor.getAutorId()){
                autores.add(i, autor);
                return true;
            }
        }
        return false;
    }
    
}
