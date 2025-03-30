package bibliotecaDig;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Biblioteca Digital ===");

        // Crear una instancia de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear y agregar libros a la biblioteca.
        Libro libro1 = new Libro("Don Quijote", "Cervantes", LocalDate.of(1605, 1, 16));
        Libro libro2 = new Libro("La sombra del viento", "Zafón", LocalDate.of(2001, 4, 4));
        Libro libro3 = new Libro("Cien años de soledad", "García Márquez", LocalDate.of(1967, 5, 30));
        Libro libro4 = new Libro("El principito", "Antoine de Saint-Exupéry", LocalDate.of(1943, 4, 6));

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        // Intentar prestar el libro "Don Quijote" al usuario "user1"
        boolean prestado = libro1.prestar("user1");
        if (prestado) {
            System.out.println("El libro 'Don Quijote' ha sido prestado a user1.");
        } else {
            System.out.println("No se pudo prestar 'Don Quijote'.");
        }

        // Intentar devolver el libro "Don Quijote" por parte de "user1"
        boolean devuelto = libro1.devolver("user1");
        if (devuelto) {
            System.out.println("El libro 'Don Quijote' ha sido devuelto por user1.");
        } else {
            System.out.println("No se pudo devolver 'Don Quijote'.");
        }

        // Listar y mostrar los libros disponibles (aquellos que no estén prestados)
        System.out.println("\nLibros disponibles:");
        List<Libro> disponibles = biblioteca.listarLibrosDisponibles();
        disponibles.forEach(libro -> System.out.println(libro.getTitulo()));

        // Mostrar los 3 libros más antiguos de la colección
        System.out.println("\nLos 3 libros más antiguos:");
        List<Libro> masAntiguos = biblioteca.mostrarLibrosMasAntiguos();
        masAntiguos.forEach(libro -> 
            System.out.println(libro.getTitulo() + " - Publicado: " + libro.getFechaPublicacion())
        );

        // Contar y mostrar la cantidad de libros actualmente prestados
        long prestadosCount = biblioteca.contarLibrosPrestados();
        System.out.println("\nTotal de libros prestados: " + prestadosCount);

        // Filtrar libros por autor (por ejemplo, "Cervantes") y mostrarlos
        System.out.println("\nLibros del autor 'Cervantes':");
        List<Libro> librosCervantes = biblioteca.filtrarLibrosPorAutor("Cervantes");
        librosCervantes.forEach(libro -> System.out.println(libro.getTitulo()));
    }
}