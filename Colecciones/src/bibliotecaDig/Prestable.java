package bibliotecaDig;

public interface Prestable {
	boolean prestar(String usuario); // Permite prestar el libro a un usuario.

	boolean devolver(String usuario); // Permite devolver el libro prestado.
}
