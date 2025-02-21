package CatalogoMuseo;

import java.util.Date;

import java.util.Scanner;

/**
 * 
 * Clase principal que contiene el método main para ejecutar el programa.
 * 
 * Se encarga de crear un catálogo de obras artísticas, agregar obras y mostrar
 * información relevante.
 * 
 */

public class Main {

	
	/**
     * Constructor de la clase Main.
     */
    public Main() {
    }
    
    /**
	 * 
	 * Método principal que ejecuta la aplicación.
	 * 
	 * 
	 * 
	 * @param args Argumentos de línea de comandos (no utilizados).
	 * 
	 */

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo();

		Scanner scanner = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("\nMenú del Catálogo del Museo");

			System.out.println("1. Agregar Pintura");

			System.out.println("2. Agregar Escultura");

			System.out.println("3. Mostrar Catálogo");

			System.out.println("4. Buscar Obra por Número de Inventario");

			System.out.println("5. Eliminar Obra");

			System.out.println("6. Mostrar Superficie Total de Pinturas");

			System.out.println("7. Mostrar Escultura Más Alta");

			System.out.println("8. Salir");

			System.out.print("Seleccione una opción: ");

			opcion = scanner.nextInt();

			scanner.nextLine();

			switch (opcion) {

			case 1:

				System.out.print("Ingrese título de la pintura: ");

				String tituloP = scanner.nextLine();

				System.out.print("Ingrese número de inventario: ");

				int numInvP = scanner.nextInt();

				System.out.print("Ingrese ancho: ");

				double ancho = scanner.nextDouble();

				System.out.print("Ingrese alto: ");

				double alto = scanner.nextDouble();

				scanner.nextLine();

				System.out.print("Ingrese soporte: ");

				String soporte = scanner.nextLine();

				Artista artistaP = new Artista("Desconocido", "Desconocido", new Date(), new Date());

				Pintura nuevaPintura = new Pintura(tituloP, numInvP, artistaP, 2023, ancho, alto, soporte);

				catalogo.agregarObra(nuevaPintura);

				System.out.println("Pintura agregada correctamente.");

				break;

			case 2:

				System.out.print("Ingrese título de la escultura: ");

				String tituloE = scanner.nextLine();

				System.out.print("Ingrese número de inventario: ");

				int numInvE = scanner.nextInt();

				scanner.nextLine();

				System.out.print("Ingrese material: ");

				String material = scanner.nextLine();

				System.out.print("Ingrese altura: ");

				double altura = scanner.nextDouble();

				Artista artistaE = new Artista("Desconocido", "Desconocido", new Date(), new Date());

				Escultura nuevaEscultura = new Escultura(tituloE, numInvE, artistaE, 2023, material, altura);

				catalogo.agregarObra(nuevaEscultura);

				System.out.println("Escultura agregada correctamente.");

				break;

			case 3:

				catalogo.mostrarCatalogo();

				break;

			case 4:

				System.out.print("Ingrese número de inventario: ");

				int numBuscar = scanner.nextInt();

				ObraArtistica obra = catalogo.buscarObra(numBuscar);

				if (obra != null) {

					System.out.println("Obra encontrada: " + obra);

				} else {

					System.out.println("No se encontró una obra con ese número de inventario.");

				}

				break;

			case 5:

				System.out.print("Ingrese número de inventario de la obra a eliminar: ");

				int numEliminar = scanner.nextInt();

				if (catalogo.eliminarObra(numEliminar)) {

					System.out.println("Obra eliminada correctamente.");

				} else {

					System.out.println("No se encontró una obra con ese número de inventario.");

				}

				break;

			case 6:

				System.out.println("Superficie total de pinturas: " + catalogo.superficie() + " m²");

				break;

			case 7:

				System.out.println("Número de inventario de la escultura más alta: " + catalogo.masAlta());

				break;

			case 8:

				System.out.println("Saliendo del programa...");

				break;

			default:

				System.out.println("Opción no válida. Intente de nuevo.");

				break;

			}

		} while (opcion != 8);

		scanner.close();

	}

}