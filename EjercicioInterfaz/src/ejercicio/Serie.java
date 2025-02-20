package ejercicio;

//LA CLASE SERIE SE IMPLEMENTA A LA CLASE REPRODUCIBLE
public class Serie implements Reproducible{

	//IMPLEMENTAMOS METODOS Y EL TIPO DE CONTENIDO
	public void reproducir() {
		
		System.out.println("Reproduciendo serie...");
		
	}
	
	public void pausar() {
		
		System.out.println("Serie pausada.");
		
	}
	
	//TIPO DE CONTENIDO
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.SERIE;
		
	}
	
	
}
