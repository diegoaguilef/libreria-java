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
public class DatosCliente extends DatosPersona {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public DatosCliente() {
    }
     
    public boolean agregarCliente(Persona persona){
        boolean status =  false;
        for(Cliente cl: clientes){
            if(!cl.getRut().equals(persona.getRut())){
                Cliente cliente = new Cliente(
                        persona.getRut(), 
                        persona.getNombre(), 
                        persona.getEdad());
                Fecha fecha = new Fecha(27,10,2018);
                cliente.setFecha_subscripcion(fecha);
                clientes.add(cliente);
                status = true;
                break;
            }
        }
        
        return status;
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
        }
        
        return status;
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
