package gestionEventoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParticipanteNoValidoException {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        Carrera carrera = null;
        Equipo equipo = null;
        TorneoDeFutbol torneo = null;
        

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Crear carrera");
            System.out.println("2. Inscribir participante en carrera");
            System.out.println("3. Mostrar ganador de la carrera");
            System.out.println("4. Crear torneo de fútbol");
            System.out.println("5. Añadir jugador a equipo de fútbol");
            System.out.println("6. Asignar puntos a equipo de fútbol");
            System.out.println("7. Mostrar ganador del torneo de fútbol");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la carrera: ");
                    String nombreCarrera = scanner.nextLine();
                    System.out.print("Ciudad de la carrera: ");
                    String ciudadCarrera = scanner.nextLine();
                    System.out.print("Distancia de la carrera (km): ");
                    double distanciaCarrera = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer
                    carrera = new Carrera(nombreCarrera, LocalDate.now(), ciudadCarrera, distanciaCarrera);
                    System.out.println("Carrera creada.");
                    break;
                case 2:
                    System.out.print("Nombre del participante: ");
                    String nombreParticipante = scanner.nextLine();
                    System.out.print("Apellido del participante: ");
                    String apellidoParticipante = scanner.nextLine();
                    System.out.print("Edad del participante: ");
                    int edadParticipante = scanner.nextInt();
                    System.out.print("Tiempo en segundos del participante: ");
                    double tiempoRealizado = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer
                    Participante participante = new Participante(nombreParticipante, apellidoParticipante, edadParticipante, tiempoRealizado);
                    carrera.inscribirParticipante(participante);
                    System.out.println("Participante inscrito: " + participante);
                    break;
                case 3:
                    System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());
                    break;
                case 4:
                    System.out.print("Nombre del torneo: ");
                    String nombreTorneo = scanner.nextLine();
                    System.out.print("Nombre del estadio: ");
                    String nombreEstadio = scanner.nextLine();
                    torneo = new TorneoDeFutbol(nombreTorneo, LocalDate.now(), nombreEstadio, null);
                    System.out.println("Torneo creado.");
                    break;
                case 5:
                    System.out.print("Nombre del equipo: ");
                    String nombreEquipo = scanner.nextLine();
                    equipo = new Equipo(nombreEquipo, new ArrayList<>(), 0);
                    System.out.print("Nombre del jugador: ");
                    String nombreJugador = scanner.nextLine();
                    System.out.print("Apellido del jugador: ");
                    String apellidoJugador = scanner.nextLine();
                    System.out.print("Edad del jugador: ");
                    int edadJugador = scanner.nextInt();
                    System.out.println("Tiempo del jugador: ");
                    double tiempo = scanner.nextDouble();
                    Participante jugador = new Participante(nombreJugador, apellidoJugador, edadJugador, tiempo);
                    equipo.añadirJugador(jugador);
                    System.out.println("Jugador añadido");
                    break;
                case 6:
                    System.out.print("Nombre del equipo: ");
                    String nombreEquipoPuntos = scanner.nextLine();
                    System.out.print("Puntos del equipo: ");
                    int puntosEquipo = scanner.nextInt();
                    scanner.nextLine(); 
                    equipo.setPuntos(puntosEquipo);
                    System.out.println("Nombre del equipo: "+ nombreEquipoPuntos + " / Puntos asignados: " + puntosEquipo);
                    break;
                case 7:
                    System.out.println("Ganador del torneo: " + torneo.obtenerGanador());
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
