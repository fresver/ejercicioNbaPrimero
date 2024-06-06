package examen3evanba;

public class Jugador extends Persona{

	private String nombre;
	private String apellido;
	private Posicion posicion;
	private int edad;
	private int dorsal;
	private int alturaEnCm;
	
	public Jugador(String nombre, String apellido, Posicion posicion, int edad, int dorsal, int alturaEnCm) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.posicion = posicion;
		this.edad = edad;
		this.dorsal = dorsal;
		this.alturaEnCm = alturaEnCm;
	}

	@Override
	public String toString() {
		return nombre+" "+apellido+" de "+edad+" años, mide "+alturaEnCm+"cm, juega en la posición de "+posicion+" con el dorsal "+dorsal;
	}

	public int getEdad() {
		return edad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public int getAlturaEnCm() {
		return alturaEnCm;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDorsal() {
		return dorsal;
	}
	
}
