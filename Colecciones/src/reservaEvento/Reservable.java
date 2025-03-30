package reservaEvento;


	public interface Reservable {
	    // Método para realizar una reserva para un usuario y una cantidad específica de plazas
	    boolean reservar(String usuario, int cantidad);

	    // Método para cancelar la reserva de un usuario
	    boolean cancelarReserva(String usuario);

	    // Método para obtener el número de plazas disponibles
	    int plazasDisponibles();
	}


