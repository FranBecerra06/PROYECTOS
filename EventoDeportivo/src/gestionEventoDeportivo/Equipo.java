package gestionEventoDeportivo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<Participante> jugadores;
	private int puntos = 0;

	public Equipo(String nombre, List<Participante> jugadores, int puntos) {

		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
		this.puntos = puntos;
	}

	public Participante getCapitan() {

		return jugadores.isEmpty() ? null : jugadores.get(0);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Participante> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Participante> jugadores) {
		this.jugadores = jugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void añadirJugador(Participante jugador) {
		jugadores.add(jugador);
	}

	public void eliminarJugador(Participante jugador) {

		jugadores.remove(jugador);

	}

	public String toString() {
		return "Equipo nombre=" + nombre + ", jugadores=" + jugadores + ", puntos=" + puntos + "]";
	}

	public static void add(Equipo equipo) {
		// TODO Auto-generated method stub

	}

}
