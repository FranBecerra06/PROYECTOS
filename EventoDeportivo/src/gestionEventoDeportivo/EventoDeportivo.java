package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

	protected String nombre;
	protected LocalDate fecha;
	protected String lugar;
	protected ArrayList<Participante> participantes;

	public abstract Participante obtenerGanador();

	public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {

		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = new ArrayList<>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void inscribirParticipante(Participante participante) {

		if (participante != null) {
			this.participantes.add(participante);
			System.out.println("Participante inscrito.");
		} else {
			System.out.println("No se puede inscribir el participante.");
		}

	}

}
