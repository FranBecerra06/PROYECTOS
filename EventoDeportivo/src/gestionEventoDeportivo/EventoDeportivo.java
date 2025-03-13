package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

	// Atributos protegidos del evento deportivo
	protected String nombre;
	protected LocalDate fecha;
	protected String lugar;
	protected ArrayList<Participante> participantes;

	// Método abstracto para obtener el ganador del evento deportivo
	public abstract Participante obtenerGanador();

	// Constructor de la clase EventoDeportivo
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = new ArrayList<>();
	}

	// Métodos getter y setter para el nombre del evento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos getter y setter para la fecha del evento
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	// Métodos getter y setter para el lugar del evento
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	// Método getter para obtener la lista de participantes del evento
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	// Método para inscribir un participante en el evento deportivo
	public void inscribirParticipante(Participante participante) {
		if (participante != null) {
			this.participantes.add(participante);
			System.out.println("Participante inscrito.");
		} else {
			System.out.println("No se puede inscribir el participante.");
		}
	}
}
