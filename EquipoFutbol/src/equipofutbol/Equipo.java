package equipofutbol;

import java.util.*;

public class Equipo { 
    private String nombre; // Nombre del equipo
    private List<Futbolista> futbolistas; // Lista de jugadores del equipo

    public Equipo(String nombre) { 
        this.nombre = nombre; // Inicializa el nombre
        this.futbolistas = new ArrayList<>(); // Inicializa la lista vacía
    }

    public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException { 
        int contador = 0; // Contador de futbolistas en la misma posición

      //-- COMENTO LA FORMA STREAM YA QUE NO SALTA LA EXCEPCION EN LA APLICACION--
      //long count = futbolistas.stream()
      //.filter(f -> f.getPosicion() == futbolista.getPosicion())
      //.count();
        
        // Versión con for para contar futbolistas por posición
        for (Futbolista f : futbolistas) { 
            if (f.getPosicion() == futbolista.getPosicion()) { 
                contador++; 
            }
        }

        Map<Posicion, Integer> maxPosicion = Map.of( 
            Posicion.PORTERO, 2, // Máx. porteros
            Posicion.DEFENSA, 5, // Máx. defensas
            Posicion.CENTROCAMPISTA, 5, // Máx. centrocampistas
            Posicion.DELANTERO, 4 // Máx. delanteros
        );

        if (contador >= maxPosicion.get(futbolista.getPosicion())) { 
            throw new RegistroFutbolistaException( 
                "No se pueden añadir mas jugadores en la posicion: " + futbolista.getPosicion()
            );
        }

        futbolistas.add(futbolista); // Agrega el futbolista a la lista
    }

    public void listarFormacionDelEquipo() { 
        // Ordena por la posición del futbolista (ordinal)
        futbolistas.sort(Comparator.comparing(f -> f.getPosicion().ordinal()));

        // Itera y muestra cada futbolista
        Iterator<Futbolista> iterator = futbolistas.iterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next());
        }
    }
}
