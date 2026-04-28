/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autogestionestudiantil;

public class Materia 
{
    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio; 

    public Materia (String nombre, String codigo,int cuatrimestre, int anio ) 
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cuatrimestre = cuatrimestre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public int getAnio() {
        return anio;
    }
    
   
    public void setCodigo(String codigo) 
    {
        
        if (codigo != null && !nombre.isEmpty()) 
        {
            this.nombre = nombre;
        } 
        else 
        {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public void setLegajo(String legajo) 
    {
        if (legajo != null && !legajo.isEmpty()) 
        {
            this.legajo = legajo;
        } 
        else 
        {
            System.out.println("El legajo no puede estar vacio");
        }
    }
    
    public abstract void mostrarResumen();
    
    
}
