package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TorneoDeFutbol extends EventoDeportivo {
	// Atributo privado para la lista de equipos
	private ArrayList<Equipo> equipos;

	// Constructor de la clase TorneoDeFutbol
	public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Equipo> equipos) {
		super(nombre, fecha, lugar);
		this.equipos = equipos;
	}

	// Método getter para obtener la lista de equipos
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	// Método para inscribir un equipo en el torneo
	public void inscribirEquipo(Equipo equipo) {
		equipos.add(equipo); // Corregir el uso de equipos en lugar de Equipo
	}

	// Método para obtener el ganador del torneo
	public Participante obtenerGanador() {
		Equipo equipoganador = null;
		int maxpuntos = Integer.MIN_VALUE;

		// Obtener la lista de equipos del torneo
		List<Equipo> equipo = getEquipos();

		// Iterar sobre la lista de equipos para encontrar al ganador
		for (int i = 0; i < equipo.size(); i++) {
			Equipo e = equipo.get(i);

			// Comparar los puntos del equipo actual con el máximo registrado
			if (e.getPuntos() > maxpuntos) {
				maxpuntos = e.getPuntos();
				equipoganador = e;
			}
		}

		// Devolver el capitán del equipo ganador, si existe
		return equipoganador != null ? equipoganador.getCapitan() : null;
	}
}
