package autogestionestudiantil;
import java.util.Scanner;

public class AutogestionEstudiantil 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Estudiante alumno = new Estudiante("Ana Garcia", "22001", "Interfaz Grafica", 2023);

        // Objetos de prueba para la clase Materia
        Materia m = new Materia("Matematica", "22033", 1, 2024);
        Materia a = new Materia("Lengua", "22034", 2, 2024);

        //Carga estos objetos en la lista de materias inscriptas
        alumno.inscribirse(m);
        alumno.inscribirse(a); 

        //Muestro esos objetos
        m.mostrarResumen();
        System.out.println("\n======");
        a.mostrarResumen();

        //Menu principal
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
                    System.out.println("PERFIL DE ALUMNO:");
                    
                    //Llama al método verPerfil usando el scanner
                    verPerfil(alumno, sc);
                    break;

                case 2:
                    //Llama al método menuMaterias y se abre un submenú
                    menuMaterias(alumno, sc);
                    break;

                case 3:
                    System.out.println("Función próximamente disponible.");
                    break;

                case 4:
                    System.out.println("Función próximamente disponible.");
                    break;

                case 5:
                    System.out.println("Función próximamente disponible.");
                    break;

                case 0:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }

    //Opcion 2: Gestion de materias (SubMenu)
    private static void menuMaterias(Estudiante alumno, Scanner sc) 
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

                    // Validación carácteres del código
                    if (codigo.length() < 3 || codigo.length() > 10) 
                    {
                        System.out.println("Error: El código debe tener entre 3 y 10 caracteres.");
                        break;
                    }

                    //Validación de código repetido
                    if (alumno.getInscripcion(codigo) != null) 
                    {
                        System.out.println("Error: Ya estás inscripto en una materia con ese código.");
                        break;
                    }

                    System.out.print("CUATRIMESTRE: ");
                    int cuatrimestre = sc.nextInt();

                    //Validación de número de cuatrimestre
                    if (cuatrimestre != 1 && cuatrimestre != 2) 
                    {
                        System.out.println("Error: El cuatrimestre debe ser 1 o 2.");
                        sc.nextLine();
                        break;
                    }

                    System.out.print("AÑO: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    //Crea variable para guardar la nueva materia desde la clase Materia
                    Materia nuevaMateria = new Materia(nombre, codigo, cuatrimestre, anio);
                    alumno.inscribirse(nuevaMateria);
                    sc.nextLine(); 
                    
                    System.out.println("Materia registrada correctamente:");
                    nuevaMateria.mostrarResumen();

                    break;

                case 2:

                    System.out.println("Dar de baja de una materia:");

                    System.out.print("Ingrese el código de la materia: ");
                    String codigoBaja = sc.nextLine();

                    //Elimina la materia según el código 
                    if (alumno.getInscripcion(codigoBaja) != null) 
                    {
                        alumno.darDeBaja(codigoBaja);
                        System.out.println("Materia eliminada correctamente.");
                    } 
                    else 
                    {
                        System.out.println("Materia no encontrada.");
                    }

                    break;

                case 3:
                    //Muestra los datos de las materias con lo guardado en las clases InscripcionMateria y Materia
                    if (alumno.getMaterias().isEmpty()) {
                        System.out.println("No hay materias inscriptas.");
                    } else {
                        System.out.println("=== MATERIAS INSCRIPTAS ===");

                        for (InscripcionMateria insc : alumno.getMaterias()) {
                            Materia mat = insc.getMateria();

                            System.out.println("Materia: " + mat.getNombre());
                            System.out.println("Código: " + mat.getCodigo());
                            System.out.println("Cuatrimestre: " + mat.getCuatrimestre());
                            System.out.println("Año: " + mat.getAnio());
                            System.out.println("Asistencia: " + insc.getPorcentajeAsistencia() + "%");
                            System.out.println("Promedio: " + insc.getPromedio());
                            System.out.println("Condición: " + insc.getCondicion());
                            System.out.println("----------------------");
                        }
                    }

                    break; 

                case 4:

                    System.out.println("Buscar materias...");
                    System.out.print("Ingrese código o nombre: ");
                    
                    break;

                case 0:

                    System.out.println("Volviendo al menú principal...");
                    break;

                default:

                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcionMateria != 0);
    }

    // Eve, Opcion 1: Ver perfil
    public static void verPerfil(Estudiante alumno, Scanner sc) 
    {
        alumno.mostrarResumen();

        System.out.println("Presione ENTER para volver...");
        sc.nextLine();
    }
} 