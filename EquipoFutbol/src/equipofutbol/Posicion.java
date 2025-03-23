package equipofutbol;

public enum Posicion {
	
	PORTERO(2000,3000), DEFENSA(2500,3500), CENTROCAMPISTA(3500,4000), DELANTERO(4000,5000);
	
	private int salarioMinimo;
	private int salarioMaximo;
	
	Posicion(int salarioMinimo, int salarioMaximo) {
		this.salarioMinimo = salarioMinimo;
		this.salarioMaximo = salarioMaximo;
	}

	public int getSalarioMinimo() {
		return salarioMinimo;
	}

	public int getSalarioMaximo() {
		return salarioMaximo;
	}
	

}
