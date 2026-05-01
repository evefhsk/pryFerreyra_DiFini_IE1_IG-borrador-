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
        System.out.println("=== RESUMEN DE MATERIA ===");
      
        System.out.println("Materia: " + nombre);
        System.out.println("Año: " + anio);

        if (codigo != null) {
            System.out.println("Código: " + codigo);
        } else {
            System.out.println("Código inválido o repetido");
        }

        if (cuatrimestre == 1 || cuatrimestre == 2) {
            System.out.println("Cuatrimestre: " + cuatrimestre);
        } else {
            System.out.println("Cuatrimestre inválido");
        }
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
            this.codigo = null;
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
            this.cuatrimestre =  -1; 
        }
    }
    
    
}
  
