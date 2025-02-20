package ejercicio;

/**
 * Interfaz que define los metodos para la reproduccion del contenido.
 * 
 * @author FranBecerra
 * @version 1.0
 */
public interface Reproducible {

	/**
	 * Inicia la reproduccion del contenido.
	 */
	void reproducir();

	/**
	 * Se pausa la reproduccion del contenido.
	 */
	void pausar();

	/**
	 * Obtiene el tipo de contenido que se esta reproduciendo.
	 * 
	 * @return Tipo de contenido
	 */
	TipoContenido obtenerTipoContenido();

}
