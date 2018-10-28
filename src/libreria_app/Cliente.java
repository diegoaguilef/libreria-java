/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app;

import java.util.ArrayList;

/**
 *
 * @author Diego Aguilef
 */
public class Cliente  extends Persona{
    private Fecha fecha_subscripcion;
    private int libros_adquiridos;
    private ArrayList<Libro> libros;

    public Cliente() {
    }
    /**
     * 
     * @param rut
     * @param nombre
     * @param edad 
     */
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
        this.fecha_subscripcion = new Fecha();
        this.libros_adquiridos = 0;
        this.libros = new ArrayList<>();
    }

    public Fecha getFecha_subscripcion() {
        return fecha_subscripcion;
    }

    public void setFecha_subscripcion(Fecha fecha_subscripcion) {
        this.fecha_subscripcion = fecha_subscripcion;
    }

    public int getLibros_adquiridos() {
        return libros_adquiridos;
    }

    public String getLibros() {
        String lista = "";
        int i = 0;
        for(Libro libro:libros){
            lista += (i + ": "+libro.getNombre() + "\n");
            i++;
        }
        return lista;
    }
    /**
     * 
     * @param libro 
     */
    public void setLibro(Libro libro) {
        this.libros.add(libro);
        this.libros_adquiridos += 1;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.getNombre() + 
                "Fecha Subscripcion: " + fecha_subscripcion.toString() + 
                ", Libros Adquiridos: " + libros_adquiridos + 
                ", libros: " + this.getLibros();
    }
    
}
