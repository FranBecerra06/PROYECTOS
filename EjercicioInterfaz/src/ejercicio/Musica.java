package ejercicio;

/**
 * Representa un tipo de contenido de musica que puede ser reproducido.
 * Implementa la interfaz Reproducible.
 * 
 * @author FranBecerra
 * @version 1.0
 */

public class Musica implements Reproducible {

	/**
	 * Se reproduce la música.
	 */
	
	public void reproducir() {
		
		System.out.println("Reproduciendo música...");
		
	}
	
	/**
	 * Se pausa la musica.
	 */
	
	public void pausar() {
		
		System.out.println("Musica pausada.");
		
	}
	

	/**
	 * Se obtiene el tipo de contenido, en este caso, la musica.
	 * @return Tipo de contenido MÚSICA
	 */
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.MUSICA;
		
	}
}
