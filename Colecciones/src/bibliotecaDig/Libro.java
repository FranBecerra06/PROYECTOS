package bibliotecaDig;

import java.time.LocalDate;

public class Libro implements Prestable {
	private String titulo; // Título del libro.
	private String autor; // Autor del libro.
	private LocalDate fechaPublicacion; // Fecha de publicación.
	private String usuarioPrestamo; // Usuario al que se le ha prestado el libro. Puede ser `null` si no está
									// prestado.

	public Libro(String titulo, String autor, LocalDate fechaPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.usuarioPrestamo = null; // Inicialmente el libro no está prestado.
	}

	public boolean prestar(String usuario) {
		if (usuarioPrestamo != null) {
			return false; // El libro ya está prestado.
		}
		usuarioPrestamo = usuario; // Marca al libro como prestado a un usuario.
		return true;
	}

	public boolean devolver(String usuario) {
		if (usuarioPrestamo != null && usuarioPrestamo.equals(usuario)) {
			usuarioPrestamo = null; // Marca el libro como no prestado.
			return true;
		}
		return false; // No se puede devolver si el libro no estaba prestado a ese usuario.
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getUsuarioPrestamo() {
		return usuarioPrestamo;
	}
}
