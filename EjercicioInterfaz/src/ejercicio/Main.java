package ejercicio;

import java.util.Scanner;

/**
 * Clase principal que permite al usuario seleccionar y reproducir el contenido.
 * 
 * @author FranBecerra
 * @version 1.0
 */

public class Main {
	
	/**
	 * Metodo que gestiona la seleccion y reproduccion del contenido.
	 * @param args Argumentos
	 */
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

      // Mostrar opciones al usuario
      System.out.println("Seleccione un tipo de contenido para reproducir:");
      System.out.println("1. Música");
      System.out.println("2. Película");
      System.out.println("3. Serie");
      System.out.println("4. Podcast");

      // Obtener la selección del usuario
      int opcion = scanner.nextInt();
      Reproducible contenido = null;

      // Crear la instancia correspondiente
      switch (opcion) {
          case 1:
              contenido = new Musica();
              break;
          case 2:
              contenido = new Pelicula();
              break;
          case 3:
              contenido = new Serie();
              break;
          case 4:
              contenido = new Podcast();
              break;
          default:
              System.out.println("Opción no válida.");
              scanner.close();
              return;
      }

      // Mostrar el tipo de contenido seleccionado
      System.out.println("Has seleccionado: " + contenido.obtenerTipoContenido());

      // Menú de acciones
      System.out.println("¿Qué desea hacer?");
      System.out.println("1. Reproducir");
      System.out.println("2. Pausar");

      int accion = scanner.nextInt();

      if (accion == 1) {
          contenido.reproducir();
      } else if (accion == 2) {
          contenido.pausar();
      } else {
          System.out.println("Acción no válida.");
          
      }
      scanner.close();
      
  }
}      


