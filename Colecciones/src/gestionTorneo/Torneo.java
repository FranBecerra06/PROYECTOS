package gestionTorneo;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Torneo {
    private List<Jugador> jugadores;  // Lista de jugadores en el torneo.

    public Torneo() {
        this.jugadores = new ArrayList<>();
    }

    // Método para agregar un jugador al torneo
    public void agregarJugador(Jugador jugador) throws JugadorYaregistradoException {
        // Verifica si el jugador ya está registrado
        for (Jugador j : jugadores) {
            if (j.getNombre().equals(jugador.getNombre())) {
                throw new JugadorYaregistradoException("El jugador " + jugador.getNombre() + " ya está registrado.");
            }
        }
        jugadores.add(jugador);  // Si no está registrado, lo agrega a la lista de jugadores.
    }

    // Método para obtener los 3 jugadores con más puntos
    public List<Jugador> top3Jugadores() {
        return jugadores.stream()
                        .sorted(Comparator.comparingInt(Jugador::obtenerPuntosTotales).reversed())  // Ordena por puntos de mayor a menor
                        .limit(3)  // Limita la lista a los 3 primeros jugadores
                        .collect(Collectors.toList());  // Recolecta los resultados en una lista.
    }

    // Método para filtrar jugadores que tienen más de X puntos
    public List<Jugador> filtrarJugadoresConMasDeXPuntos(int puntos) {
        return jugadores.stream()
                        .filter(jugador -> jugador.obtenerPuntosTotales() > puntos)  // Filtra los jugadores con más de X puntos
                        .collect(Collectors.toList());  // Recolecta los resultados en una lista.
    }
}
