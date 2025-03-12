package gestionEventoDeportivo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws ParticipanteNoValidoException {
        Carrera carrera = new Carrera("Maratón", LocalDate.now(), "Ciudad", 42.195);
        Participante p1 = new Participante("Juan", "Pérez", 25, 120.5);
        Participante p2 = new Participante("Ana", "Gómez", 22, 115.3);
        carrera.inscribirParticipante(p1);
        carrera.inscribirParticipante(p2);
        System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());
        
        TorneoDeFutbol torneo = new TorneoDeFutbol("Liga", LocalDate.now(), "Estadio");
        Equipo equipo1 = new Equipo("Tigres", null, 0);
        Equipo equipo2 = new Equipo("Leones", null, 0);
        equipo1.añadirJugador(p1);
        equipo2.añadirJugador(p2);
        equipo1.setPuntos(10);
        equipo2.setPuntos(15);
        torneo.inscribirEquipo(equipo1);
        torneo.inscribirEquipo(equipo2);
        System.out.println("Ganador del torneo: " + torneo.obtenerGanador());;
	}

}