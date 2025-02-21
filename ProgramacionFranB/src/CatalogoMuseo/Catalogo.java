package CatalogoMuseo;

import java.util.ArrayList;

import java.util.List;

/**
 * La clase Catalogo representa un catálogo de obras artísticas en un museo.
 * Permite agregar, eliminar, buscar obras, calcular la superficie total de las
 * pinturas y encontrar la obra más alta. También puede mostrar la información
 * del catálogo.
 */

class Catalogo {

	/**
	 * La lista de obras artísticas en el catálogo.
	 */
	private List<ObraArtistica> obras;

	/**
	 * Crea un nuevo catálogo vacío.
	 */
	public Catalogo() {

		this.obras = new ArrayList<>();

	}

	/**
	 * Agrega una nueva obra al catálogo si no está ya presente.
	 * 
	 * @param obra La obra artística a agregar.
	 * @return true si la obra fue agregada, false si ya estaba presente.
	 */
	public boolean agregarObra(ObraArtistica obra) {

		if (!obras.contains(obra)) {

			obras.add(obra);

			return true;

		}

		return false;

	}

	/**
	 * Elimina una obra del catálogo por su número de inventario.
	 * 
	 * @param numeroInventario El número de inventario de la obra a eliminar.
	 * @return true si la obra fue eliminada, false si no se encontró.
	 */
	public boolean eliminarObra(int numeroInventario) {

		return obras.removeIf(obra -> obra.getNumeroInventario() == numeroInventario);

	}

	/**
	 * Busca una obra en el catálogo por su número de inventario.
	 * 
	 * @param numeroInventario El número de inventario de la obra a buscar.
	 * @return La obra artística si se encontró, null si no se encontró.
	 */
	public ObraArtistica buscarObra(int numeroInventario) {

		for (ObraArtistica obra : obras) {

			if (obra.getNumeroInventario() == numeroInventario) {

				return obra;

			}

		}

		return null;

	}

	/**
	 * Calcula la superficie total de todas las pinturas en el catálogo.
	 * 
	 * @return La superficie total de las pinturas.
	 */
	public double superficie() {

		double totalSuperficie = 0;

		for (ObraArtistica obra : obras) {

			if (obra instanceof Pintura) {

				totalSuperficie += ((Pintura) obra).calcularSuperficie();

			}

		}

		return totalSuperficie;

	}

	/**
	 * Encuentra la obra más alta en el catálogo.
	 * 
	 * @return El número de inventario de la obra más alta, o -1 si no se encontró
	 *         ninguna escultura.
	 */
	public int masAlta() {

		double maxAltura = 0;

		int inventarioMasAlta = -1;

		for (ObraArtistica obra : obras) {

			if (obra instanceof Escultura) {

				double altura = ((Escultura) obra).getAltura();

				if (altura > maxAltura) {

					maxAltura = altura;

					inventarioMasAlta = obra.getNumeroInventario();

				}

			}

		}

		return inventarioMasAlta;

	}

	/**
	 * Muestra la información de todas las obras en el catálogo.
	 */
	public void mostrarCatalogo() {

		for (ObraArtistica obra : obras) {

			obra.muestra();

		}

	}

	/**
	 * Devuelve una representación en forma de cadena del catálogo.
	 * 
	 * @return Una cadena que contiene la información de todas las obras en el
	 *         catálogo.
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder("Catálogo del museo:\n");

		for (ObraArtistica obra : obras) {

			sb.append(obra.toString()).append("\n");

		}

		return sb.toString();

	}

}