package gestionTorneo;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Jugador implements Competidor {
    private String nombre;  // Nombre del jugador.
    private LocalDate fechaRegistro;  // Fecha en la que se registró el jugador.
    private List<Integer> partidas;  // Lista de puntos obtenidos en cada partida.

    public Jugador(String nombre, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.partidas = new ArrayList<>();
    }

    // Registra los puntos de una partida
    
    public void registrarResultado(int puntos) {
        partidas.add(puntos);  // Agrega los puntos de la partida a la lista de partidas.
    }

    // Obtiene el total de puntos obtenidos en todas las partidas
    
    public int obtenerPuntosTotales() {
        return partidas.stream().mapToInt(Integer::intValue).sum();  // Suma los puntos de todas las partidas.
    }

    // Getter para el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    // Getter para la fecha de registro
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
}
