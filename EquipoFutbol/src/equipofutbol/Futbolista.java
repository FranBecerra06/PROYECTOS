package equipofutbol;

import java.util.List;

public class Futbolista implements Deportista {

	private String nombre;
	private int edad;
	private Posicion posicion;
	private int anyosProfesional;
	private List<String> listadoEquipos;
	private int totalTrofeos;

	public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, List<String> listadoEquipos,
			int totalTrofeos) {

		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.anyosProfesional = anyosProfesional;
		this.listadoEquipos = listadoEquipos;
		this.totalTrofeos = totalTrofeos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getAnyosProfesional() {
		return anyosProfesional;
	}

	public void setAnyosProfesional(int anyosProfesional) {
		this.anyosProfesional = anyosProfesional;
	}

	public List<String> getListadoEquipos() {
		return listadoEquipos;
	}

	public void setListadoEquipos(List<String> listadoEquipos) {
		this.listadoEquipos = listadoEquipos;
	}

	public int getTotalTrofeos() {
		return totalTrofeos;
	}

	public void setTotalTrofeos(int totalTrofeos) {
		this.totalTrofeos = totalTrofeos;
	}

	public String toString() {
		return "Futbolista: Nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ",Años profesional="
				+ anyosProfesional + ", listadoEquipos=" + listadoEquipos + ", totalTrofeos=" + totalTrofeos;
	}

}
