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
public class DatosCliente {
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public DatosCliente() {
    }
     
    public boolean agregar(Libro libro, Persona persona){
        boolean status =  false;
        boolean existe = false;
        Cliente cliente = null;
        Libro lb = DatosLibro.buscarNombre(libro.getNombre());
        int stockLibro = lb.getStock();
        if(stockLibro == 0){
          return false;
        }
        for(Cliente cl: clientes){
          if(cl.getRut().equals(persona.getRut())){
            cliente = cl;  
            existe = true;
          }
        }
        if(existe){
          lb.setStock(stockLibro - 1 );
          DatosLibro.editar(lb);
          cliente.setLibro(libro);
          status = true;
        }else{
          cliente = new Cliente(
            persona.getRut(), 
            persona.getNombre()
          );
          lb.setStock(stockLibro - 1 );
          DatosLibro.editar(lb);
          Fecha fecha = new Fecha(27,10,2018);
          cliente.setFechaSubscripcion(fecha);
          cliente.setLibro(libro);
          clientes.add(cliente);
          status = true;
        }
        
        return status;
    }
  
    public static void disociarLibro(Libro libro, Cliente cliente){
      int i = 0;
      for(Libro libroCliente: cliente.getLibrosAdquiridos()){
        if(libro.getNombre().equals(libroCliente.getNombre())){
          Libro lb = DatosLibro.buscarNombre(libro.getNombre());
          lb.setStock(lb.getStock() + 1 );
          DatosLibro.editar(libro);
          cliente.setLibrosAdquiridos(cliente.getLibrosAdquiridos().remove(i));
          editar(cliente);
        }
      }
    }
    
  public boolean eliminarCliente(String rut){
      boolean status =  false;
      int i = 0;
      for(Cliente cl: clientes){
        if(cl.getRut().equals(rut)){
          
          clientes.remove(i);
          status = true;
          break;
        }
        i++;
      }

      return status;
  }
  
  public static boolean editar(Cliente cliente){
    int i = 0;
    for(Cliente cl: clientes){
      if(cl.getRut().equals(cliente.getRut())){
          clientes.set(i, cliente);
          return true;
      }
      i++;
    }
    return false;
  }
    
  public Cliente buscarCliente(String rut){
    Cliente cliente = new Cliente();
    for(Cliente cl: clientes){
      if(cl.getRut().equals(rut)){
          cliente = cl;
          break;
      }
    }
    return cliente;
  }
}
