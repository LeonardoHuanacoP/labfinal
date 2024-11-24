/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Entidades.Persona;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class PersonaExtras extends Persona {
    
    public String getTextoLista(){
        return "Id: "+getIdpersona()+"\t | Nombre: " + getNombre();
        
    }
    
    public PersonaExtras (ResultSet rs){
        try{
            setIdpersona(rs.getInt(1));
            setNombre(rs.getString(2));
            setApellido(rs.getString(3));
            setDni(rs.getString(4));
            setEdad(rs.getInt(5));
            setCorreo(rs.getString(6));
        }catch(Exception s){
        System.err.println(s.getMessage());
        }
    }
    
    public static List<Persona> fromResultSet(ResultSet rs){
        List<Persona> personas = new ArrayList<>();
        try{
            while (rs.next()){
                personas.add(new PersonaExtras(rs));
                
            }
        }catch(Exception s){
            System.err.println(s.getMessage());
        }
        return personas;
    }
}
        
    
   
    
    
   

