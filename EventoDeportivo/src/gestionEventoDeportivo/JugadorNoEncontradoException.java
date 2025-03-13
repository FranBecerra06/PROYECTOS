package gestionEventoDeportivo;

// Definición de una clase personalizada de excepción llamada JugadorNoEncontradoException
public class JugadorNoEncontradoException extends Exception {

	// Constructor de la clase que recibe un mensaje de error
	public JugadorNoEncontradoException(String mensaje) {
		
		super(mensaje);
	}
}
