package CatalogoMuseo;

/**
 * La clase Pintura representa una obra de arte que es una pintura, con ancho,
 * alto y soporte. Extiende la clase ObraArtistica y proporciona métodos para
 * obtener información sobre la pintura, mostrarla y calcular su superficie.
 */
class Pintura extends ObraArtistica {

	/**
	 * El ancho de la pintura en metros.
	 */
	private double ancho;

	/**
	 * El alto de la pintura en metros.
	 */
	private double alto;

	/**
	 * El soporte de la pintura (por ejemplo, lienzo, papel).
	 */
	private String soporte;

	/**
	 * Crea una nueva pintura con el título, número de inventario, autor, año,
	 * ancho, alto y soporte especificados.
	 * 
	 * @param titulo           El título de la pintura.
	 * @param numeroInventario El número de inventario de la pintura.
	 * @param autor            El autor de la pintura.
	 * @param anio             El año de creación de la pintura.
	 * @param ancho            El ancho de la pintura en metros.
	 * @param alto             El alto de la pintura en metros.
	 * @param soporte          El soporte de la pintura.
	 */
	public Pintura(String titulo, int numeroInventario, Artista autor, int anio, double ancho, double alto,
			String soporte) {

		super(titulo, numeroInventario, autor, anio);

		this.ancho = ancho;

		this.alto = alto;

		this.soporte = soporte;

	}

	/**
	 * Devuelve el ancho de la pintura en metros.
	 * 
	 * @return El ancho de la pintura.
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * Devuelve el alto de la pintura en metros.
	 * 
	 * @return El alto de la pintura.
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * Devuelve el soporte de la pintura.
	 * 
	 * @return El soporte de la pintura.
	 */
	public String getSoporte() {
		return soporte;
	}

	/**
	 * Muestra la información de la pintura.
	 */
	public void muestra() {

		System.out.println(this);

	}

	/**
	 * Calcula la superficie de la pintura.
	 * 
	 * @return La superficie de la pintura en metros cuadrados.
	 */
	public double calcularSuperficie() {

		return ancho * alto;

	}

	/**
	 * Devuelve una representación en forma de cadena de la pintura.
	 * 
	 * @return Una cadena que contiene la información de la pintura.
	 */
	public String toString() {

		return super.toString() + ", Dimensiones: " + ancho + "x" + alto + "m, Soporte: " + soporte;

	}

}