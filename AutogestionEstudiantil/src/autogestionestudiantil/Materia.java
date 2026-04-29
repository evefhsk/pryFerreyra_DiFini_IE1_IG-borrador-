/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autogestionestudiantil;
import java.util.HashSet;
public class Materia implements Consultable
{
    private String nombre;
    private String codigo;
    private int cuatrimestre;
    private int anio;

    private static HashSet<String> codigosUsados = new HashSet<>();

    public Materia(String nombre, String codigo, int cuatrimestre, int anio) 
    {
        this.nombre = nombre;
        setCodigo(codigo);
        setCuatrimestre(cuatrimestre);
        this.anio = anio;
    }
    
    @Override
    public void mostrarResumen() 
    {
        setCuatrimestre(cuatrimestre);

        System.out.println("Materia: " + nombre);
        System.out.println("Codigo: " + codigo);

        if (cuatrimestre == 1 || cuatrimestre == 2) 
        {
            System.out.println("Cuatrimestre: " + cuatrimestre);
        } 
        else 
        {
            System.out.println("Cuatrimestre inválido");
        }

        System.out.println("Año: " + anio);
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

    public void setCodigo(String codigo) {

        if (codigosUsados.contains(codigo)) 
        {
            System.out.println("Esta materia, " + nombre + " Tiene un código que ya existe.");
        } 
        else 
        {
            this.codigo = codigo;
            codigosUsados.add(codigo);
        }
    }

 
    public void setCuatrimestre(int cuatrimestre) 
    {
        if (cuatrimestre == 1 || cuatrimestre == 2) 
        {
            this.cuatrimestre = cuatrimestre;
        } 
        else 
        {
            System.out.println("Error: el cuatrimestre debe ser 1 o 2.");
        }
    }
    
    
}
