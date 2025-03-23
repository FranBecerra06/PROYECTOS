package equipofutbol; 

import java.util.List; 

public interface Deportista { // Define un contrato para clases que implementen esta interfaz
	int getAnyosProfesional(); // Devuelve años como profesional

	List<String> getListadoEquipos(); // Lista de equipos en los que ha jugado

	int getTotalTrofeos(); // Total de trofeos ganados
}