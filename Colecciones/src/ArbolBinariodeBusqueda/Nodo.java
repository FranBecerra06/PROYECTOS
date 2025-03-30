package ArbolBinariodeBusqueda;

public class Nodo {

	String nombre;
	String telefono;
	Nodo izquierda;
	Nodo derecha;

	public Nodo(String nombre, String telefono) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.izquierda = null;
		this.derecha = null;
	}
}
