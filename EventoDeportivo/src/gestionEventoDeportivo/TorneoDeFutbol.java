package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TorneoDeFutbol extends EventoDeportivo {
	private ArrayList<Equipo> equipos;

	public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Equipo> equipos) {
		super(nombre, fecha, lugar);
		this.equipos = equipos;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void inscribirEquipo(Equipo equipo) {

		Equipo.add(equipo);

	}

	public Participante obtenerGanador() {

		Equipo equipoganador = null;
		int maxpuntos = Integer.MIN_VALUE;

		List<Equipo> equipo = getEquipos();

		for (int i = 0; i < equipo.size(); i++) {

			Equipo e = equipo.get(i);

			if (e.getPuntos() > maxpuntos) {

				maxpuntos = e.getPuntos();
				equipoganador = e;
			}

		}

		return equipoganador != null ? equipoganador.getCapitan() : null;
	}
}
