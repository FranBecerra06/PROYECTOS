package reservaEvento;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ordenarPorFecha {
	public List<Evento> ordenarPorFecha(List<Evento> eventos) {  // Método que recibe una lista de eventos y los ordena por fecha.
	    return eventos.stream()  // Convierte la lista de eventos en un stream para aplicar operaciones funcionales.
	                  .sorted(Comparator.comparing(Evento::getFecha))  // Ordena los eventos por fecha usando un comparador.
	                  .collect(Collectors.toList());  // Recolecta los eventos ordenados en una nueva lista y la devuelve.
	}
}
