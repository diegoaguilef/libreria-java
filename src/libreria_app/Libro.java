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
    private int anioPublicacion;
    private int stock;
    private Autor autor;
    private int id;

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
        this.anioPublicacion = anio_publicacion;
        this.stock = stock;
        this.autor = autor;
    }
    
    public Libro(String nombre, String editorial, int anio_publicacion, int stock, Autor autor, int id) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anioPublicacion = anio_publicacion;
        this.stock = stock;
        this.autor = autor;
        this.id = id;
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
    
    public Autor getAutor(){
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio_publicacion) {
        this.anioPublicacion = anio_publicacion;
    }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

    @Override
    public String toString() {
        return "Id: "+id+", Libro: "+ nombre + 
                ", Editorial:" + editorial + 
                ", Fecha Publicacion: " + anioPublicacion + 
                ", Autor: " + autor.getNombre();
    }

  
    
    
}
