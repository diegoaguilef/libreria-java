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
public class Library {
    private Libro libro;
    private Cliente cliente;
    private String nombre;
    private String direccion;
    private int telefono;

    public Library() {
        this.libro = new Libro();
        this.cliente = new Cliente();
    }

    public Library(String _nombre, String _direccion, int _telefono) {
        this.libro = new Libro();
        this.cliente = new Cliente();
        this.nombre = _nombre;
        this.direccion = _direccion;
        this.telefono = _telefono;
    }
    
    
    
}
