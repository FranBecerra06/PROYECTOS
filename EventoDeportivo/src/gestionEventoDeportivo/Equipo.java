package gestionEventoDeportivo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	// Atributos privados del equipo
	private String nombre;
	private List<Participante> jugadores;
	private int puntos = 0;

	// Constructor de la clase Equipo
	public Equipo(String nombre, List<Participante> jugadores, int puntos) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
		this.puntos = puntos;
	}

	// Método para obtener el capitán del equipo
	public Participante getCapitan() {
		return jugadores.isEmpty() ? null : jugadores.get(0);
	}

	// Métodos getter y setter para el nombre del equipo
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para la lista de jugadores
	public List<Participante> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Participante> jugadores) {
		this.jugadores = jugadores;
	}

	// Métodos getter y setter para los puntos del equipo
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	// Método para añadir un jugador al equipo
	public void añadirJugador(Participante jugador) {
		jugadores.add(jugador);
	}

	// Método para eliminar un jugador del equipo
	public void eliminarJugador(Participante jugador) {
		jugadores.remove(jugador);
	}

	// Método toString para obtener la representación del objeto en forma de cadena
	public String toString() {
		return "Equipo nombre=" + nombre + ", jugadores=" + jugadores + ", puntos=" + puntos + "]";
	}

	// Método estático para añadir un equipo (a implementar)
	public static void add(Equipo equipo) {
		// TODO Auto-generated method stub
	}
}
