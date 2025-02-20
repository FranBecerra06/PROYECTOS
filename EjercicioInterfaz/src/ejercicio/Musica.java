package ejercicio;

//LA CLASE MUSICA SE IMPLEMENTA A LA CLASE REPRODUCIBLE
public class Musica implements Reproducible {

	//IMPLEMENTAMOS LOS METODOS
	public void reproducir() {
		
		System.out.println("Reproduciendo música...");
		
	}
	
	public void pausar() {
		
		System.out.println("Musica pausada.");
		
	}
	
	//OBTENEMOS EL TIPO DE CONTENIDO
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.MUSICA;
		
	}
}
