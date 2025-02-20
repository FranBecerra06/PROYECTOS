package ejercicio;

/**
 * Representa un tipo de contenido de podcast que puede ser reproducido.
 * Implementa la interfaz Reproducible.
 * 
 * @author FranBecerra
 * @version 1.0
 */

public class Podcast implements Reproducible {

	
	/**
	 * Constructor de la clase Podcast.
	 */
	
	public Podcast() {
	//VACIO	
	}
	
	
/**
 * Se reproduce el podcast.
 */
	public void reproducir() {
		
		System.out.println("Reproduciendo podcast...");
		
	}
	
	/**
	 * Se pausa el podcast.
	 */
	public void pausar() {
		
		System.out.println("Podcast pausado.");
		
	}
	
/**
 * Obtiene el tipo de contenido que es Podcast.
 * 
 * @return Tipo de contenido PODCAST
 */
	
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.PODCAST;
		
	}
	
}
