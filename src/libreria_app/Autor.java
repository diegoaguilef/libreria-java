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
public class Autor {
    private String nombre;
    private Fecha fecha_nacimiento = new Fecha();
    private String pais;
    private int autor_id;

    public Autor() {
    }
    
    /**
     * 
     * @param nombre
     * @param pais
     * @param id 
     */
    public Autor(String nombre, String pais, int id) {
        this.nombre = nombre;
        this.pais = pais;
        this.autor_id = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAutorId() {
        return autor_id;
    }

    public void setAutorId(int id) {
        this.autor_id = id;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Autor: "+ nombre + ", Fecha Nacimiento: " + fecha_nacimiento + ", País: " + pais;
    }
    
}
