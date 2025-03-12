package gestionEventoDeportivo;

import java.time.LocalDate;

import java.util.List;

public class Carrera extends EventoDeportivo {

	private double distancia;

	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar);
		this.distancia = distancia;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public Participante obtenerGanador() {

		Participante ganador = null;
		double menorTiempo = Double.MAX_VALUE;

		List<Participante> participantes = getParticipantes();

		for (int i = 0; i < participantes.size(); i++) {

			Participante p = participantes.get(i);

			if (p.getTiempo() < menorTiempo) {

				menorTiempo = p.getTiempo();
				ganador = p;

			}

		}

		return ganador;

	}

}
