package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\Terry\\Documents\\NetBeansProjects\\CursoUniJava\\ProgramacionJava\\CatalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();

    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige una opcion: \n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar peliculas"
                        + "\n3.- Listar peliculas"
                        + "\n4.- Buscar pelicula"
                        + "\n0.- Salir");
                opcion = Integer.parseInt(scanner.nextLine());
                
                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("Introduce el nombre de una pelicula a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        //3. listar catalogo completo
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        //4. Buscar pelicula
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }       
    }  
}
