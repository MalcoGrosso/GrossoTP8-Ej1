/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn8ej1;

/**
 *
 * @author yo125
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        

        Materia Mat1 = new Materia (1,"Ingles I de primer año", 2020);
        Materia Mat2 = new Materia (2,"Matemáticas de primer año", 2020);
        Materia Mat3 = new Materia (3,"Laboratorio 1 de primer año", 2020);
        Materia Mat4 = new Materia (3,"Laboratorio 1 de primer año", 2020);
        
        Alumno Alu1= new Alumno (1001,"Lopez","Martin");
        Alumno Alu2= new Alumno (1002,"Martinez","Brenda" );
        
        
        Alu1.agregarMateria(Mat1);
        Alu1.agregarMateria(Mat2);
        Alu1.agregarMateria(Mat3);
        
        Alu2.agregarMateria(Mat1);
        Alu2.agregarMateria(Mat2);
        Alu2.agregarMateria(Mat3);
        Alu2.agregarMateria(Mat3);
        
            
        
        System.out.println("El alumno/a " + Alu1.getApellido() + " se inscribio en las siguientes materias: " + Alu1.m()+ "\n");
        System.out.println("El alumno/a " + Alu2.getApellido() + " se inscribio en las siguientes materias: " +Alu2.m()+ "\n");
        System.out.println("La cantidad de materias a cursar son: " + Alu1.cantidadMaterias());
        
        
    }
    
}
