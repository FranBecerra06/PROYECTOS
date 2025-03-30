package reservaEvento;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		// Crear instancias de eventos
		Evento evento1 = new Evento("Concierto Rock", LocalDate.now().plusDays(3), 100);
		Evento evento2 = new Evento("Exposición de Arte", LocalDate.now().plusDays(5), 50);

		// Mostrar plazas disponibles inicialmente
		System.out.println("Evento: " + evento1.getNombre() + " - Plazas disponibles: " + evento1.plazasDisponibles());
		System.out.println("Evento: " + evento2.getNombre() + " - Plazas disponibles: " + evento2.plazasDisponibles());

		// Intentar reservar 30 plazas para "Fran" en evento1
		try {
			System.out.println("\nReservando 30 plazas para 'Fran' en " + evento1.getNombre());
			evento1.reservar("Fran", 30);
			System.out.println("Reserva exitosa para 'Fran'");
		} catch (Exception e) {
			System.out.println("Error en reserva para 'Fran': " + e.getMessage());
		}

		// Mostrar las plazas disponibles tras la reserva
		System.out.println("Plazas disponibles en " + evento1.getNombre() + ": " + evento1.plazasDisponibles());

		// Intentar reservar más plazas de las disponibles para "Andres" en evento1
		try {
			System.out.println("\nReservando 80 plazas para 'Andres' en " + evento1.getNombre());
			evento1.reservar("Andres", 80);
			System.out.println("Reserva exitosa para 'Andres'");
		} catch (Exception e) {
			System.out.println("Error en reserva para 'Andres': " + e.getMessage());
		}

		// Cancelar la reserva de "Fran"
		try {
			System.out.println("\nCancelando reserva para 'Fran' en " + evento1.getNombre());
			evento1.cancelarReserva("Fran");
			System.out.println("Reserva cancelada exitosamente para 'Fran'");
		} catch (Exception e) {
			System.out.println("Error al cancelar reserva para 'Fran': " + e.getMessage());
		}

		// Mostrar plazas disponibles tras la cancelación
		System.out.println("Plazas disponibles en " + evento1.getNombre() + " después de cancelar la reserva: "
				+ evento1.plazasDisponibles());

		// Intentar cancelar una reserva inexistente para "Juan"
		try {
			System.out.println("\nCancelando reserva para 'Juan' en " + evento1.getNombre());
			evento1.cancelarReserva("Juan");
		} catch (Exception e) {
			System.out.println("Error al cancelar reserva para 'Juan': " + e.getMessage());
		}
	}
}