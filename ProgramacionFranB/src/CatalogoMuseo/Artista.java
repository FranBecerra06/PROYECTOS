package CatalogoMuseo;

import java.util.Date;

abstract class Artista {

	protected String nombre;
	protected String lugar_nac;
	protected Date fecha_nac;
	protected Date fecha_fall;

	public Artista(String nombre, String lugar_nac, Date fecha_nac, Date fecha_fall) {

		this.nombre = nombre;
		this.lugar_nac = lugar_nac;
		this.fecha_nac = fecha_nac;
		this.fecha_fall = fecha_fall;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLugar_nac() {
		return lugar_nac;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public Date getFecha_fall() {
		return fecha_fall;
	}

	public void muestra() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Lugar de nacimiento: " + lugar_nac);
		System.out.println("Fecha de nacimiento: " + fecha_nac);
		System.out.println("Fecha de fallecimiento: " + fecha_fall);

	}

	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Artista artista = (Artista) obj;
		
		if (!nombre.equals(artista.nombre)) return false;
		if (!lugar_nac.equals(artista.lugar_nac)) return false;
		if (!fecha_nac.equals(artista.fecha_nac)) return false;
		return fecha_fall != null ? fecha_fall.equals(artista.fecha_fall) : artista.fecha_fall == null;
		
	}
	
	
	public String toString() {
		return "Artista: Nombre=" + nombre + ", Lugar nacimiento=" + lugar_nac + ", Fecha nacimiento=" + fecha_nac
				+ ", Fecha fallecimiento=" + fecha_fall;
	}

}
