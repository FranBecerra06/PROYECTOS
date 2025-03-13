package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.List;

public class Carrera extends EventoDeportivo {

	// Atributo privado para la distancia de la carrera
	private double distancia;

	// Constructor de la clase Carrera
	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar);
		this.distancia = distancia;
	}

	// Método getter para obtener la distancia de la carrera
	public double getDistancia() {
		return distancia;
	}

	// Método setter para establecer la distancia de la carrera
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	// Método para obtener el ganador de la carrera
	public Participante obtenerGanador() {
		Participante ganador = null;
		double menorTiempo = Double.MAX_VALUE;

		// Obtener la lista de participantes de la carrera
		List<Participante> participantes = getParticipantes();

		// Iterar sobre la lista de participantes para encontrar al ganador
		for (int i = 0; i < participantes.size(); i++) {
			Participante p = participantes.get(i);

			// Comparar el tiempo del participante actual con el menor tiempo registrado
			if (p.getTiempo() < menorTiempo) {
				menorTiempo = p.getTiempo();
				ganador = p;
			}
		}

		return ganador;
	}
}
