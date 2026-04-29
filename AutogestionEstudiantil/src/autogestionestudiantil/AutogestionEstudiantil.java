package autogestionestudiantil;
import java.util.Scanner;

public class AutogestionEstudiantil {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Objetos de prueba para la clase Materia
        /*
        Materia m = new Materia("Matematica", "22033", 4, 2004);
        Materia a = new Materia("Lengua", "22033", 1, 2004);
        m.mostrarResumen(); 
        System.out.println("\n======");  
        a.mostrarResumen(); 
        */
        
        int opcion;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ver perfil");
            System.out.println("2. Gestion de materias");
            System.out.println("3. Registrar asistencia");
            System.out.println("4. Registrar calificacion");
            System.out.println("5. Ver reportes");
            System.out.println("0. Salir");
            System.out.println("-------------");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) 
            {
                case 1:
                    alumno.mostrarResumen();
                case 2:
                    menuMaterias(alumno, sc);
                case 0:
                    System.out.println("Hasta luego!");
                default: 
                    System.out.println("Opción invalida. Intente nuevamente.");
            }
        
        } while (opcion != 0);         
    }
    
    public static void menuMaterias(Scanner sc) 
    {
        int opcionMateria;

        do {
            System.out.println("\n=== GESTIÓN DE MATERIAS ===");
            System.out.println("1. Inscribir materia");
            System.out.println("2. Darse de baja de una materia");
            System.out.println("3. Ver materias");
            System.out.println("4. Buscar materias");
            System.out.println("0. Volver");
            System.out.println("-------------");
            System.out.print("Opción: ");
            opcionMateria = sc.nextInt();
            sc.nextLine();

            switch (opcionMateria) 
            {
                case 1:
                    System.out.println("Inscribirse a una materia:");

                    System.out.print("NOMBRE: ");
                    String nombre = sc.nextLine();

                    System.out.print("CODIGO: ");
                    String codigo = sc.nextLine();

                    System.out.print("CUATRIMESTRE: ");
                    int cuatrimestre = sc.nextInt();

                    System.out.print("AÑO: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    Materia nuevaMateria = new Materia(nombre, codigo, cuatrimestre, anio);

                    System.out.println("Materia registrada:");
                    nuevaMateria.mostrarResumen();

                    break;

                case 2:
                    System.out.println("Mostrando materias...");
                    break;

                case 3:
                    System.out.println("Eliminando materia...");
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default: 
                    System.out.println("Opción inválida.");
            }

        } while (opcionMateria != 0);
    }
    
}
