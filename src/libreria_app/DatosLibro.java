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
    private ArrayList<Libro> libros = new ArrayList<>();

    public void llenarLibros() {
        Autor autor = new Autor("Miguel de Unamuno", "España", 1);
        libros.add(new Libro("La esfinge","La mia",1898,10,autor));
        libros.add(new Libro("La venda","La mia",1899,10,autor));
        libros.add(new Libro("La difunta","La mia",1909,10,autor));
    }
    
    
}
