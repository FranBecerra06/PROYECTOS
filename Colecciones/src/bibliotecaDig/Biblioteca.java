package bibliotecaDig;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);  // Agrega un libro a la biblioteca.
    }

    // Listar libros disponibles (no prestados)
    public List<Libro> listarLibrosDisponibles() {
        return libros.stream()
                     .filter(libro -> libro.getUsuarioPrestamo() == null)  // Filtra libros no prestados (usuarioPrestamo es null).
                     .collect(Collectors.toList());
    }

    // Mostrar los 3 libros más antiguos
    public List<Libro> mostrarLibrosMasAntiguos() {
        return libros.stream()
                     .sorted((libro1, libro2) -> libro1.getFechaPublicacion().compareTo(libro2.getFechaPublicacion()))  // Ordena por fecha de publicación.
                     .limit(3)  // Toma los 3 primeros.
                     .collect(Collectors.toList());
    }

    // Contar los libros prestados
    public long contarLibrosPrestados() {
        return libros.stream()
                     .filter(libro -> libro.getUsuarioPrestamo() != null)  // Filtra los libros prestados (usuarioPrestamo no es null).
                     .count();
    }

    // Filtrar libros por autor
    public List<Libro> filtrarLibrosPorAutor(String autor) {
        return libros.stream()
                     .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))  // Filtra libros por autor.
                     .collect(Collectors.toList());
    }
}
