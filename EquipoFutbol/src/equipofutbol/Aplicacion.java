package equipofutbol;

import java.util.*;

public class Aplicacion {

	public static void main(String[] args) {

		Equipo equipo = new Equipo("Los Tigres");

		try {
		    equipo.agregarFutbolista(new Futbolista("Carlos", 28, Posicion.PORTERO, 5, Arrays.asList("Real Madrid", "Barcelona"), 10));
		    equipo.agregarFutbolista(new Futbolista("Juan", 25, Posicion.PORTERO, 3, Arrays.asList("Valencia"), 3));
		    equipo.agregarFutbolista(new Futbolista("Luis", 22, Posicion.DEFENSA, 2, Arrays.asList("Sevilla"), 2));
		    equipo.agregarFutbolista(new Futbolista("Pedro", 26, Posicion.DEFENSA, 4, Arrays.asList("Betis"), 5));
		    equipo.agregarFutbolista(new Futbolista("Andres", 29, Posicion.CENTROCAMPISTA, 7, Arrays.asList("Villarreal"), 8));
		    equipo.agregarFutbolista(new Futbolista("Miguel", 23, Posicion.DELANTERO, 3, Arrays.asList("Getafe"), 4));
		    
		    // Prueba para lanzar la excepción (tercer portero)
		    equipo.agregarFutbolista(new Futbolista("Sergio", 30, Posicion.PORTERO, 6, Arrays.asList("Atletico"), 9));

		} catch (RegistroFutbolistaException e) {
		    System.out.println("Excepcion encontrada: " + e.getMessage());
		}

		System.out.println("\n Formacion del equipo:");
		equipo.listarFormacionDelEquipo();
		
	}

}
