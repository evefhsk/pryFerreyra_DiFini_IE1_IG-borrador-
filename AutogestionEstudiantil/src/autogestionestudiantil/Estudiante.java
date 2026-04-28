/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autogestionestudiantil;

/**
 *
 * @author ferre

public class Estudiante extends PersonaAcademica implements Consultable 
{
    private String carrera;
    private int anioIngreso;
 
    //java.util.ArrayList para evitar imports por ahora
    private java.util.ArrayList<InscripcionMateria> materias;
}

public Estudiante (String nombre, String legajo, String carrera,int anioIngreso) 
{
    super(nombre, legajo);
    this.carrera = carrera;
    this.anioIngreso = anioIngreso;
    this.materias = new java.util.AbstractList<>();
   
    
    
}
  */


    

