package examen3evanba;

public enum Posicion {

	BA("Base"),
	AL("Alero"),
	ES("Escolta"),
	AP("Ala-Pívot"),
	PT("Pívot");
	
	private String posicion;

	private Posicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPosicion() {
		return posicion;
	}

}
