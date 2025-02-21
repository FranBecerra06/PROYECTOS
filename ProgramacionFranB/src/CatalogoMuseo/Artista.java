package CatalogoMuseo;


import java.util.Date;
/**
 * Representa un artista en el catálogo del museo.
 */
public class Artista {

	/**
	 * El nombre del artista.
	 */
	protected String nombre;

	/**
	 * EL lugar de nacimiento del artista.
	 */
	protected String lugar_nac;

	/**
	 * La fecha de nacimiento del artista.
	 */
	protected Date fecha_nac;

	/**
	 * La fecha de fallecimiento del artista.
	 */
	protected Date fecha_fall;

	/**
	 * Crea un nuevo artista con el nombre, lugar de nacimiento, fecha de nacimiento
	 * y fecha de fallecimiento.
	 * 
	 * @param nombre     El nombre del artista
	 * @param lugar_nac  El lugar de nacimiento del artista.
	 * @param fecha_nac  La fecha de nacimiento del artista.
	 * @param fecha_fall La fecha de fallecimiento del artista.
	 */

	public Artista(String nombre, String lugar_nac, Date fecha_nac, Date fecha_fall) {

		this.nombre = nombre;
		this.lugar_nac = lugar_nac;
		this.fecha_nac = fecha_nac;
		this.fecha_fall = fecha_fall;
	}

	/**
	 * Devuelve el nombre del artista.
	 * 
	 * @return EL nombre del artista.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el lugar de nacimiento del artista.
	 * 
	 * @return El lugar de nacimiento del artista.
	 */
	public String getLugar_nac() {
		return lugar_nac;
	}

	/**
	 * Devuelve la fecha de nacimiento del artista.
	 * 
	 * @return La fecha de nacimiento del artista.
	 */

	public Date getFecha_nac() {
		return fecha_nac;
	}

	/**
	 * Devuelve la fecha de fallecimiento del artista.
	 * 
	 * @return Fecha de fallecimiento.
	 */
	public Date getFecha_fall() {
		return fecha_fall;
	}

	/**
	 * Muestra la informacion del artista.
	 */
	public void muestra() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Lugar de nacimiento: " + lugar_nac);
		System.out.println("Fecha de nacimiento: " + fecha_nac);
		System.out.println("Fecha de fallecimiento: " + fecha_fall);

	}

	/**
	 * Compara este artista con el objeto para comprobar si son iguales.
	 * 
	 * @param obj El objeto a comparar con este artista.
	 * @return true si los objetos son iguales; false si son diferentes.
	 */
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Artista artista = (Artista) obj;

		if (!nombre.equals(artista.nombre))
			return false;
		if (!lugar_nac.equals(artista.lugar_nac))
			return false;
		if (!fecha_nac.equals(artista.fecha_nac))
			return false;
		return fecha_fall != null ? fecha_fall.equals(artista.fecha_fall) : artista.fecha_fall == null;

	}

	/**
	 * Devuelve una representacion en forma de cadena del artista.
	 * 
	 * @return Una cadena de texto que contiene el nomobre, lugar de nacimiento,
	 *         fecha de nacimiento y fecha de fallecimiento.
	 */
	public String toString() {
		return "Artista: Nombre=" + nombre + ", Lugar nacimiento=" + lugar_nac + ", Fecha nacimiento=" + fecha_nac
				+ ", Fecha fallecimiento=" + fecha_fall;
	}

}
