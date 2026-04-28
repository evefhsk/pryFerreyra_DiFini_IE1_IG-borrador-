/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autogestionestudiantil;

/**
 *
 * @author ferre
 */
import java.util.ArrayList;

// promt: "Como conecto los metodos en la clase"
public class InscripcionMateria implements Evaluable {

   
    private Materia materia;
    private int totalClases;
    private int clasesAsistidas;
    private ArrayList<Double> notas;

    public InscripcionMateria(Materia materia) {
        this.materia = materia;
        this.totalClases = 0;
        this.clasesAsistidas = 0;
        this.notas = new ArrayList<>();
    }

    
    public Materia getMateria() {
        return materia;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public int getClasesAsistidas() {
        return clasesAsistidas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    

    // asistencia
    public void registrarAsistencia(boolean presente) {
        totalClases++;

        if (presente) {
            clasesAsistidas++;
        }
    }

    //nota
    public void agregarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println(" Nota inválida. Debe estar entre 0 y 10.");
            return;
        }

        if (notas.size() >= 5) {
            System.out.println(" No se pueden agregar más de 5 notas.");
            return;
        }

        notas.add(nota);
    }

    //porcentaje de asistencia
    public double getPorcentajeAsistencia() {
        if (totalClases == 0) {
            return 0;
        }

        return (clasesAsistidas * 100.0) / totalClases;
    }

    // obtener condición
    public String getCondicion() {
        if (getPorcentajeAsistencia() >= 75) {
            return "Regular";
        } else {
            return "Libre";
        }
    }

    //promedio
    public double getPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.size();
    }

    // corroborar si aprobo ono
    public boolean estaAprobada() {
        return getPromedio() >= 6 && getCondicion().equals("Regular");
    }
}



