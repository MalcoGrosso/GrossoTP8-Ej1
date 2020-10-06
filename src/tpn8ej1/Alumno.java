/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn8ej1;
import java.util.*;
/**
 *
 * @author yo125
 */
public class Alumno {
 
    
     private int legajo;
    private String apellido;
    private String nombre;
    private Materia materia;
    private HashSet Mat = new HashSet();
    //private HashSet< Materia > Mat= new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public String toString(){
    
    return this.legajo + " / " + this.apellido + " / " + this.nombre;
    
        
    
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia m){
    
 
    Mat.add(m);
    Iterator <Materia> it = Mat.iterator();
    while (it.hasNext()){
    it.next();
    //System.out.println(it.next());
    
    
    
    
    }
            
     }
    //Iterator <Materia> it = Mat.iterator();
    //System.out.println(it.next()); 
    //System.out.println(m); 
    //Iterator it=Mat.iterator();
      
        
     //       System.out.println(it.next());
           
    
        
    //    }
        
        
        
     
        
        
        
        

    
     
    //Iterator it=Mat.iterator();
    //Iterator <Materia> it = Mat.iterator();
    //System.out.println(it.next()); 
    //System.out.println(m); 
   // while (it.hasNext()){
    
     
     
        
      // System.out.println(it.next());
      
        
             
      
        
        
    
   
    
       
    //}
       
     
    public HashSet m(){
    
       
    return Mat;
        
    }
    
    
    public int cantidadMaterias(){
  
    return  Mat.size();
    
}
    }
    
    

