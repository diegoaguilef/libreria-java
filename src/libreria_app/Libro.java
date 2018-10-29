/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app;

/**
 *
 * @author kdieg
 */
public class Libro {
    private String nombre;
    private String editorial;
    private int anio_publicacion;
    private int stock;
    private Autor autor;

    public Libro() {
        this.autor = new Autor();
    }
    
    /**
     * 
     * @param nombre
     * @param editorial
     * @param fecha_publicacion
     * @param stock
     * @param autor 
     */
    public Libro(String nombre, String editorial, int anio_publicacion, int stock, Autor autor) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anio_publicacion = anio_publicacion;
        this.stock = stock;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setFecha_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    @Override
    public String toString() {
        return "Libro: "+ nombre + 
                ", Editorial:" + editorial + 
                ", Fecha Publicacion: " + anio_publicacion + 
                ", Autor: " + autor.getNombre();
    }

  
    
    
}
