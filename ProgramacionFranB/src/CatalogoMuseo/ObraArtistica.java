package CatalogoMuseo;

/**
 * La clase ObraArtistica representa una obra de arte con un título, número de
 * inventario, autor y año de creación. Proporciona métodos para obtener
 * información sobre la obra, mostrarla y calcular su superficie. También
 * incluye métodos para comparar obras artísticas y generar una representación
 * en forma de cadena.
 */
abstract class ObraArtistica {

	/**
	 * El título de la obra artística.
	 */
	protected String titulo;

	/**
	 * El número de inventario de la obra artística.
	 */
	protected int numeroInventario;

	/**
	 * El autor de la obra artística.
	 */
	protected Artista autor;

	/**
	 * El año de creación de la obra artística.
	 */
	protected int anio;

	/**
	 * Crea una nueva obra artística con el título, número de inventario, autor y
	 * año especificados.
	 * 
	 * @param titulo           El título de la obra artística.
	 * @param numeroInventario El número de inventario de la obra artística.
	 * @param autor            El autor de la obra artística.
	 * @param anio             El año de creación de la obra artística.
	 */
	public ObraArtistica(String titulo, int numeroInventario, Artista autor, int anio) {

		this.titulo = titulo;
		this.numeroInventario = numeroInventario;
		this.autor = autor;
		this.anio = anio;

	}

	/**
	 * Devuelve el título de la obra artística.
	 * 
	 * @return El título de la obra artística.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Devuelve el número de inventario de la obra artística.
	 * 
	 * @return El número de inventario de la obra artística.
	 */
	public int getNumeroInventario() {
		return numeroInventario;
	}

	/**
	 * Devuelve el autor de la obra artística.
	 * 
	 * @return El autor de la obra artística.
	 */
	public Artista getAutor() {
		return autor;
	}

	/**
	 * Devuelve el año de creación de la obra artística.
	 * 
	 * @return El año de creación de la obra artística.
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Muestra la información de la obra artística.
	 */
	public abstract void muestra();

	/**
	 * Calcula la superficie de la obra artística.
	 * 
	 * @return La superficie de la obra artística.
	 */
	public abstract double calcularSuperficie();

	/**
	 * Compara esta obra artística con el objeto especificado para determinar si son
	 * iguales.
	 * 
	 * @param obj El objeto a comparar con esta obra artística.
	 * @return true si los objetos son iguales; false en caso contrario.
	 */
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		ObraArtistica otra = (ObraArtistica) obj;

		return numeroInventario == otra.numeroInventario;

	}

	/**
	 * Devuelve una representación en forma de cadena de la obra artística.
	 * 
	 * @return Una cadena que contiene el título, número de inventario, autor y año
	 *         de la obra artística.
	 */
	public String toString() {

		return "Titulo: " + titulo + ", Inventario: " + numeroInventario + ", Autor: " + autor.getNombre() + ", Año: "
				+ anio;

	}

}