package reservaEvento;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class eventosProximos {
	public List<Evento> eventosProximos(List<Evento> eventos) {  // Método que recibe una lista de eventos y devuelve los próximos eventos en los próximos 7 días.
	    LocalDate ahora = LocalDate.now();  // Obtiene la fecha actual (sin hora) utilizando LocalDate.now().
	    LocalDate sieteDiasDespues = ahora.plusDays(7);  // Calcula la fecha que está 7 días después de la fecha actual.

	    // Filtra los eventos que ocurren entre la fecha actual y los próximos 7 días.
	    return eventos.stream()  // Convierte la lista de eventos en un stream para poder usar operaciones de filtrado y recolección.
	                  .filter(evento -> !evento.getFecha().isBefore(ahora) && evento.getFecha().isBefore(sieteDiasDespues))  
	                  // Filtra solo los eventos cuya fecha no sea antes de "ahora" y que ocurra antes de "sieteDiasDespues".
	                  .collect(Collectors.toList());  // Recolecta los eventos filtrados en una lista y la devuelve.
	}
}
