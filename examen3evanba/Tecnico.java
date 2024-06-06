package examen3evanba;

public class Tecnico extends Persona {

	private String nombre;
	private String apellido;
	private int edad;

	public Tecnico(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre + " "+ apellido + " de " + edad + " años.";
	}

	public String getNombre() {
		return nombre;
	}
	
}
