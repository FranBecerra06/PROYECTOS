package ejercicio;

//LA CLASE PELICULA SE IMPLEMENTA A LA CLASE REPRODUCIBLE
public class Pelicula implements Reproducible{

	//IMPLEMENTAMOS METODOS
	public void reproducir() {
		
		System.out.println("Reproduciendo pelicula...");
		
	}
	
	public void pausar() {
		
		System.out.println("Pelicula pausada.");
		
	}
	
	//IMPLEMENTAMOS EL TIPO DE CONTENIDO
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.PELICULA;
		
	}
}
