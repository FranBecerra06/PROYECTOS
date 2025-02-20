package ejercicio;

/**
 * Representa un tipo de contenido pelicula que puede ser reproducido.
 * Implementa la interfaz Reproducible
 * 
 * @author FranBecerra
 * @version 1.0
 */

public class Pelicula implements Reproducible{

	/**
	 * Inicia la reproducción de la película.
	 */
	
	public void reproducir() {
		
		System.out.println("Reproduciendo pelicula...");
		
	}
	
	/**
	 * Se pausa la película.
	 */
	public void pausar() {
		
		System.out.println("Pelicula pausada.");
		
	}
	
/**
 * Se obtiene el tipo de contenido, en este caso la pelicula.
 * 
 * @return Tipo de contenido PELÍCULA
 */
	
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.PELICULA;
		
	}
}
