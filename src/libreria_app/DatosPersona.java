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
public class DatosPersona {
    private ArrayList<Persona> personas = new ArrayList<>();
    public DatosPersona() {
        personas.add(new Persona("18366475-1", "Diego", 25));
        personas.add(new Persona("17893741-0", "Raul", 21));
        personas.add(new Persona("19209667-k", "Maria", 20));
        personas.add(new Persona("18500154-0", "Laura", 24));
        personas.add(new Persona("19908111-1", "Carlos", 19));
    }
    
    public ArrayList<Persona> listaPersonas(){
        return personas;
    }
    
    public boolean agregarPersona(Persona persona){
        for(Persona xx: personas){
            if(!xx.getRut().equals(persona.getRut())){
                return false;
            }
        }
        personas.add(persona);
        return true;
    }
    
    public boolean eliminarPersona(Persona persona){
        boolean status =  false;
        int i = 0;
        for(Persona xx: personas){
            if(xx.getRut().equals(persona.getRut())){
                personas.remove(i);
                status = true;
                break;
            }
        }
        
        return status;
    }
    
    public boolean editarPersona(Persona persona){
        boolean status =  false;
        int i = 0;
        for(Persona xx: personas){
            if(xx.getRut().equals(persona.getRut())){
                personas.add(i, persona);
                status = true;
                break;
            }
        }
        
        return status;
    }

    @Override
    public String toString() {
        return "DatosPersona{" + "personas=" + personas + '}';
    }
    
    
    
}
