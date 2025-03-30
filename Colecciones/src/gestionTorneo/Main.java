package gestionTorneo;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		try {
			Torneo torneo = new Torneo();

			Jugador jugador1 = new Jugador("Carlos", LocalDate.of(2023, 1, 16));
			Jugador jugador2 = new Jugador("Sara", LocalDate.of(2023, 1, 17));
			Jugador jugador3 = new Jugador("Juan", LocalDate.of(2023, 1, 18));

			jugador1.registrarResultado(100);
			jugador2.registrarResultado(150);
			jugador3.registrarResultado(200);

			torneo.agregarJugador(jugador1);
			torneo.agregarJugador(jugador2);
			torneo.agregarJugador(jugador3);

			// Ver el top 3 jugadores
			System.out.println("Top 3 Jugadores:");
			torneo.top3Jugadores()
			.forEach(j -> System.out.println(j.getNombre() + ": " + j.obtenerPuntosTotales()));

			// Filtrar jugadores con más de 100 puntos
			System.out.println("\nJugadores con más de 100 puntos:");
			torneo.filtrarJugadoresConMasDeXPuntos(100)
					.forEach(j -> System.out.println(j.getNombre() + ": " + j.obtenerPuntosTotales()));

		} catch (JugadorYaregistradoException e) {
			System.out.println(e.getMessage());
		}
	}
}