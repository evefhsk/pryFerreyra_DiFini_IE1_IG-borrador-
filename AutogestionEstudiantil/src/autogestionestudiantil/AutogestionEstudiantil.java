package autogestionestudiantil;
import java.util.Scanner;

public class AutogestionEstudiantil {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        /*
        Estudiante alumno = new Estudiante("Ana Garcia", "22001", "Interfaz Grafica",2023);
        */
        //Objetos para la clase Materia
        Materia m = new Materia("Matematica", "22033", 4, 2004);
        Materia a = new Materia("Lengua", "22033", 1, 2004);
        m.mostrarResumen(); 
        System.out.println("\n======");  
        a.mostrarResumen(); 

        
        /*
        int opcion;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ver perfil");
            System.out.println("2. Gestion de materias");
            System.out.println("3. Registrar asistencia");
            System.out.println("4. Registrar calificacion");
            System.out.println("5. Ver reportes");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 ->
                    alumno.mostrarResumen();
                case 2 ->
                    menuMaterias(alumno, sc);
// ...
                case 0 ->
                    System.out.println("Hasta luego!");
                default ->
                    System.out.println("Opción invalida. Intente nuevamente.");
            }

        } while (opcion != 0); 
        */
    }
}
