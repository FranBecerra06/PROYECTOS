package reservaEvento;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Evento implements Reservable {  // La clase Evento implementa la interfaz Reservable.
    
    private String nombre;                     // Atributo que almacena el nombre del evento.
    private LocalDate fecha;                   // Atributo que almacena la fecha del evento.
    private int capacidad;                     // Atributo que almacena la capacidad máxima del evento.
    private Map<String, Integer> reservas;     // Un mapa que guarda las reservas de los usuarios (clave: usuario, valor: cantidad de plazas).

    // Constructor de la clase Evento que inicializa los atributos.
    public Evento(String nombre, LocalDate fecha, int capacidad) {
        this.nombre = nombre;                // Inicializa el nombre del evento.
        this.fecha = fecha;                  // Inicializa la fecha del evento.
        this.capacidad = capacidad;          // Inicializa la capacidad máxima del evento.
        this.reservas = new HashMap<>();     // Inicializa el mapa de reservas vacío.
    }

    // Método que permite realizar una reserva para el evento.
    
    public boolean reservar(String usuario, int cantidad) {
        int plazasDisponibles = this.plazasDisponibles();  // Llama al método plazasDisponibles() para obtener las plazas libres.
        
        // Si la cantidad de plazas solicitadas supera las plazas disponibles, lanza una excepción.
        if (cantidad > plazasDisponibles) {
            throw new IllegalStateException("No hay suficientes plazas disponibles");  // Excepción si no hay plazas suficientes.
        }

        reservas.put(usuario, cantidad);  // Agrega la reserva al mapa (usuario, cantidad de plazas).
        return true;  // Devuelve true si la reserva se ha realizado correctamente.
    }

    // Método que permite cancelar una reserva de un usuario.
    
    public boolean cancelarReserva(String usuario) {
        // Si no existe una reserva para el usuario, lanza una excepción.
        if (!reservas.containsKey(usuario)) {
            throw new IllegalArgumentException("No existe una reserva para el usuario: " + usuario);  // Excepción si no se encuentra la reserva.
        }
        
        reservas.remove(usuario);  // Elimina la reserva del usuario del mapa de reservas.
        return true;  // Devuelve true si la cancelación ha sido exitosa.
    }

    // Método que calcula el número de plazas disponibles en el evento.
    
    public int plazasDisponibles() {
        // Suma todas las reservas (cantidad de plazas reservadas por cada usuario).
        int totalReservado = reservas.values().stream()
        		.mapToInt(Integer::intValue).sum(); 
   
        
        return capacidad - totalReservado;  // Devuelve la diferencia entre la capacidad total y las plazas ya reservadas.
    }

    // Métodos getter para acceder a los atributos privados de la clase.
    public String getNombre() {
        return nombre;  // Devuelve el nombre del evento.
    }

    public LocalDate getFecha() {
        return fecha;  // Devuelve la fecha del evento.
    }

    public int getCapacidad() {
        return capacidad;  // Devuelve la capacidad máxima del evento.
    }
}