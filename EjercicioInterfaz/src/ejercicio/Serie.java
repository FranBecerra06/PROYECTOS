package ejercicio;

/**
 * Representa un tipo de contenido serie que se puede reproducir. Implementa la
 * Interfaz Reproducible
 * 
 * @author FranBecerra
 * @version 1.0
 */

public class Serie implements Reproducible {

	/**
	 * Constructor de la clase Serie.
	 */
	public Serie() {
	}

	/**
	 * Se inicia la reproduccion.
	 */
	public void reproducir() {

		System.out.println("Reproduciendo serie...");

	}

	/**
	 * Se pausa la reproduccion.
	 */
	public void pausar() {

		System.out.println("Serie pausada.");

	}

	/**
	 * Obtiene el tipo de contenido, que en este caso es Serie.
	 * 
	 * @return Tipo de contenido SERIE.
	 */

	public TipoContenido obtenerTipoContenido() {

		return TipoContenido.SERIE;

	}

}
