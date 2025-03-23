package equipofutbol;

public enum Posicion {
	PORTERO(2000, 3000), DEFENSA(2500, 3500), CENTROCAMPISTA(3500, 4000), DELANTERO(4000, 5000);
	// Enum para las posiciones, con sus salarios mínimo y máximo

	private int salarioMinimo; // Salario mínimo para la posición
	private int salarioMaximo; // Salario máximo para la posición

	Posicion(int salarioMinimo, int salarioMaximo) {
		this.salarioMinimo = salarioMinimo; // Inicializa el salario mínimo
		this.salarioMaximo = salarioMaximo; // Inicializa el salario máximo
	}

	public int getSalarioMinimo() {
		return salarioMinimo;
	} // Devuelve el salario mínimo

	public int getSalarioMaximo() {
		return salarioMaximo;
	} // Devuelve el salario máximo
}
