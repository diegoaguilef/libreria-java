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
public class Persona {
    private String rut;
    private String nombre;
    private int edad;

    public Persona() {
    }
    
    /**
     * 
     * @param rut
     * @param nombre
     * @param edad 
     */
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " + "rut: " + rut + ", nombre: " + nombre + ", edad: " + edad ;
    }
    
    
}
