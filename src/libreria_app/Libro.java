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
    private Fecha fecha_publicacion;
    private int stock;
    private Autor autor;

    public Libro() {
        this.autor = new Autor();
        this.fecha_publicacion = new Fecha();
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

    public Fecha getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    @Override
    public String toString() {
        return "Libro: "+ nombre + 
                ", Editorial:" + editorial + 
                ", Fecha Publicacion: " + fecha_publicacion.toString() + 
                ", Autor: " + autor.getNombre();
    }

  
    
    
}
