package equipofutbol;

import java.util.*;

public class Equipo {

	private String nombre;
	private List<Futbolista> futbolistas;

	public Equipo(String nombre) {

		this.nombre = nombre;
		this.futbolistas = new ArrayList<>();
	}

	public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {

		int contador = 0;

		//-- COMENTO LA FORMA STREAM YA QUE NO SALTA LA EXCEPCION EN LA APLICACION--
//		long count = futbolistas.stream()
//		.filter(f -> f.getPosicion() == futbolista.getPosicion())
//		.count();

		//-- PARA ELLO HE USADO LA FORMA CON EL FOR--
		for (Futbolista f : futbolistas) {
	            if (f.getPosicion() == futbolista.getPosicion()) {
	                contador++; // Si la posición coincide, aumentamos el contador
	            }
	        }
		
		
		Map<Posicion, Integer> maxPosicion = Map.of(Posicion.PORTERO, 2, Posicion.DEFENSA, 5, Posicion.CENTROCAMPISTA,
				5, Posicion.DELANTERO, 4);

		if (contador >= maxPosicion.get(futbolista.getPosicion())) {

			throw new RegistroFutbolistaException("No se pueden añadir mas jugadores en la posicion: "+ futbolista.getPosicion());

		}

		futbolistas.add(futbolista);

	}

	public void listarFormacionDelEquipo() {
		futbolistas.sort(Comparator.comparing(f -> f.getPosicion().ordinal()));

		Iterator<Futbolista> iterator = futbolistas.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
