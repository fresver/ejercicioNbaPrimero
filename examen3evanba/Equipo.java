package examen3evanba;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private Tecnico tecnico;
	private List<Jugador> listaDeJugadores= new ArrayList<>();

	@Override
	public String toString() {
		return nombre.toUpperCase()+"\n"+"Tecnico:\n"+tecnico+"\nJugadores:\n"+jugadoresDelToString();
	}
	
	public StringBuilder jugadoresDelToString() {
		StringBuilder sb1=new StringBuilder();
		listaDeJugadores.forEach(j->sb1.append(j+"\n"));
		return sb1;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Jugador> getListaDeJugadores() {
		return listaDeJugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

}
