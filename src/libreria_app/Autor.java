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
  private Fecha fechaNacimiento = new Fecha();
  private String pais;
  private int id;

  public Autor() {
  }

  /**
   * 
   * @param nombre
   * @param pais
   * @param fecha_nacimiento
   * @param id
   */
  public Autor(String nombre, String pais, Fecha fecha_nacimiento, int id) {
      this.nombre = nombre;
      this.pais = pais;
      this.fechaNacimiento = fecha_nacimiento;
      this.id = id;
  }
  public Autor(String nombre, String pais, Fecha fecha_nacimiento) {
      this.nombre = nombre;
      this.pais = pais;
      this.fechaNacimiento = fecha_nacimiento;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public Fecha getFechaNacimiento() {
      return fechaNacimiento;
  }

  public void setFechaNacimiento(Fecha fecha_nacimiento) {
      this.fechaNacimiento = fecha_nacimiento;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
    
  public String getPais() {
      return pais;
  }

  public void setPais(String pais) {
      this.pais = pais;
  }

  @Override
  public String toString() {
      return "Id: "+id+", Autor: "+ nombre + ", Fecha Nacimiento: " + fechaNacimiento.toString() + ", País: " + pais;
  }
    
}
