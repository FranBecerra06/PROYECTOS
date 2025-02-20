package ejercicio;

//LA CLASE PODCAST IMPLEMENTA A REPRODUCIBLE
public class Podcast implements Reproducible {

	//IMPLEMENTAMOS METODOS Y EL TIPO DE CONTENIDO
	public void reproducir() {
		
		System.out.println("Reproduciendo podcast...");
		
	}
	
	public void pausar() {
		
		System.out.println("Podcast pausado.");
		
	}
	
	//TIPO DE CONTENIDO
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.PODCAST;
		
	}
	
}
