package CatalogoMuseo;

class Escultura extends ObraArtistica {

	private String material;

	private double altura;

	public Escultura(String titulo, int numeroInventario, Artista autor, int anio, String material, double altura) {

		super(titulo, numeroInventario, autor, anio);

		this.material = material;

		this.altura = altura;

	}

	public String getMaterial() {
		return material;
	}

	public double getAltura() {
		return altura;
	}

	public void muestra() {

		System.out.println(this);

	}

	public double calcularSuperficie() {
		return 0;
	}

	public String toString() {

		return super.toString() + ", Material: " + material + ", Altura: " + altura + "m";

	}

}