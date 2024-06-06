package examen3evanba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LigaNba {

	private static List<Equipo>listaDeEquipos = new ArrayList<>();
	private static Equipo lakers80_81;
	private static Equipo chicagoBulls95_96;
	private static Equipo spurs00_01;
	private static Equipo miamiHeat12_13;
	//private static Map<Integer,List<Jugador>>mapEdades; //Perdón profe
	
	public static void crearLiga() {
		lakers80_81= new Equipo();
		lakers80_81.setNombre("Ángeles Lakers 80_81");
		lakers80_81.setTecnico(new Tecnico("Paul","Westhead",50));
		lakers80_81.getListaDeJugadores().add(new Jugador("Magic","Johnson",Posicion.BA,25,32,206));
		lakers80_81.getListaDeJugadores().add(new Jugador("Kareem","Abdul-Jabbar",Posicion.PT,27,33,218));
		lakers80_81.getListaDeJugadores().add(new Jugador("James","Worthy",Posicion.AL,30,28,203));
		lakers80_81.getListaDeJugadores().add(new Jugador("Michael","Cooper",Posicion.ES,22,30,198));
		lakers80_81.getListaDeJugadores().add(new Jugador("Kurt","Rambis",Posicion.AP,25,23,203));
		listaDeEquipos.add(lakers80_81);
		
		chicagoBulls95_96= new Equipo();
		chicagoBulls95_96.setNombre("Chicago Bulls 95_96");
		chicagoBulls95_96.setTecnico(new Tecnico("Phil","Jackson",50));
		chicagoBulls95_96.getListaDeJugadores().add(new Jugador("Michael","Jordan",Posicion.ES,23,23,198));
		chicagoBulls95_96.getListaDeJugadores().add(new Jugador("Scottie","Pippen",Posicion.AL,33,33,203));
		chicagoBulls95_96.getListaDeJugadores().add(new Jugador("Dennis","Rodman",Posicion.AP,91,91,201));
		chicagoBulls95_96.getListaDeJugadores().add(new Jugador("Ron","Harper",Posicion.BA,9,9,198));
		chicagoBulls95_96.getListaDeJugadores().add(new Jugador("Luc","Longley",Posicion.PT,13,13,218));
		listaDeEquipos.add(chicagoBulls95_96);
		
		spurs00_01= new Equipo();
		spurs00_01.setNombre("San Antonio Spurs 00_01");
		spurs00_01.setTecnico(new Tecnico("Gregg","Popovich",52));
		spurs00_01.getListaDeJugadores().add(new Jugador("Tim","Duncan",Posicion.AP,21,21,211));
		spurs00_01.getListaDeJugadores().add(new Jugador("David","Robinson",Posicion.PT,50,50,213));
		spurs00_01.getListaDeJugadores().add(new Jugador("Manu","Ginóbili",Posicion.AL,20,20,198));
		spurs00_01.getListaDeJugadores().add(new Jugador("Tony","Parker",Posicion.BA,9,9,188));
		spurs00_01.getListaDeJugadores().add(new Jugador("Bruce","Bowen",Posicion.ES,12,12,201));
		listaDeEquipos.add(spurs00_01);
	
		miamiHeat12_13= new Equipo();
		miamiHeat12_13.setNombre("Miami Heat 12_13");
		miamiHeat12_13.setTecnico(new Tecnico("Erik","Spoelstra",42));
		miamiHeat12_13.getListaDeJugadores().add(new Jugador("LeBron","James",Posicion.AL,6,6,203));
		miamiHeat12_13.getListaDeJugadores().add(new Jugador("Dwyane","Wade",Posicion.ES,3,3,193));
		miamiHeat12_13.getListaDeJugadores().add(new Jugador("Chris","Bosh",Posicion.AP,1,1,211));
		miamiHeat12_13.getListaDeJugadores().add(new Jugador("Ray","Allen",Posicion.ES,34,34,196));
		miamiHeat12_13.getListaDeJugadores().add(new Jugador("Mario","Chalmers",Posicion.BA,15,15,188));
		listaDeEquipos.add(miamiHeat12_13);
	}

	public static String informacionBasicaDeLaLiga() {
		return "Los equipos que actualmente forman esta liga son:\n"
	+"-"+chicagoBulls95_96.getNombre()+"\n-"
	+lakers80_81.getNombre()+"\n-"
	+miamiHeat12_13.getNombre()+"\n-"
	+spurs00_01.getNombre();
	}
	
	public static String informacionDetalladaDeCadaEquipo() {
		return lakers80_81+"\n"+chicagoBulls95_96+"\n"+spurs00_01+"\n"+miamiHeat12_13;
	}
	
	public static Optional<Equipo> obtenerUnEquipoPorSuNombre(String nombreEquipo) throws EquipoNoEncontradoException{
		Optional<Equipo> equipoEncontradoPorSuNombre= listaDeEquipos.stream()
		.filter(e->e.getNombre().equalsIgnoreCase(nombreEquipo))
		.findFirst();
		if(equipoEncontradoPorSuNombre.isEmpty()) {
			throw new EquipoNoEncontradoException("No se encontró el equipo");
		}
		return equipoEncontradoPorSuNombre;
	}
	
	public static Optional<Equipo> obtenerUnEquipoPorSuTecnico(String nombreTecnico)throws TecnicoNoEncontradoException{
		Optional<Equipo> equipoEncontradoPorSuTecnico= listaDeEquipos.stream()
		.filter(e->e.getTecnico().getNombre().equalsIgnoreCase(nombreTecnico))
		.findFirst();
		if(equipoEncontradoPorSuTecnico.isEmpty()) {
			throw new TecnicoNoEncontradoException("No se encontró el equipo por su técnico");
		}
		return equipoEncontradoPorSuTecnico; 
	}
	
	public static List<Jugador> obtenerTodosLosJugadores(){
		List<Jugador> listaTodosLosJugadores= new ArrayList<>();
		listaDeEquipos.forEach(e->listaTodosLosJugadores.addAll(e.getListaDeJugadores()));
		return listaTodosLosJugadores;
	}
	
	public static double obtenerEdadMediaJugadoresDeLaLiga() {
		if(obtenerTodosLosJugadores().isEmpty()) {
			return 0.;
		}
		return obtenerTodosLosJugadores().stream().mapToDouble(e->e.getEdad()).average().getAsDouble();
	}
	
	public static double obtenerEdadMediaJugadoresDeUnEquipo(String nombreEquipo) {
		List<Jugador> listaJugadores=new ArrayList<>();
		
		listaDeEquipos.stream()
		.filter(e->e.getNombre().equalsIgnoreCase(nombreEquipo))
		.forEach(e->listaJugadores.addAll(e.getListaDeJugadores()));
	
		double media=listaJugadores.stream()
		.mapToDouble(j->j.getEdad())
		.average().orElse(0);
		return media;
	}
	
	public static List<Jugador> obtenerJugadoresDeLaLigaPorPosicion(Posicion posicion){
		List<Jugador> listaJugadoresPorPosicion=
		obtenerTodosLosJugadores().stream()
		.filter(j->j.getPosicion().equals(posicion))
		.collect(Collectors.toList());
		if(listaJugadoresPorPosicion.isEmpty()) {
			return new ArrayList<Jugador>();
		}
		return listaJugadoresPorPosicion;
	}
	
	public static int obtenerPersonasActivasEnLaLiga() {
		//Con clase Persona
		/*List<Persona> listaPersonas=new ArrayList<>();
		listaPersonas.addAll(listaDeEquipos.stream()
		.map(e->e.getTecnico())
		.collect(Collectors.toList()));
		listaPersonas.addAll(obtenerTodosLosJugadores());
		return listaPersonas.size();*/
		
		//Sin clase Persona
		long resultado=0;
		resultado+=listaDeEquipos.stream()
		.map(e->e.getTecnico())
		.count();
		resultado+=obtenerTodosLosJugadores().size();
		return (int)resultado;
	}
	
	public static Jugador jugadorDeMenorAltura() {
		return obtenerTodosLosJugadores().stream().min(Comparator.comparingInt(Jugador::getAlturaEnCm)).get();
	}
	
	public static Jugador jugadorDeMayorAltura() {
		return obtenerTodosLosJugadores().stream().max(Comparator.comparingInt(Jugador::getAlturaEnCm)).get();
	}
	
	public static void imprimirJugadoresOrdenadosPorNombreConElApellidoEnPrimerLugarYEnMayusculas() {
		obtenerTodosLosJugadores().stream()
		.sorted(Comparator.comparing(Jugador::getNombre))
		.forEach(j->System.out.println(j.getApellido()
		+" "+j.getNombre()
		+" de "+j.getEdad()
		+" años, mide "+j.getAlturaEnCm()
		+"cm, "+"juega en la posición de "+j.getPosicion()
		+" con el dorsal "+j.getDorsal()+"\n"));
	}
	
	public static void imprimirJugadoresPorDorsalOrdenadosPorAlturaDescendente() {
		obtenerTodosLosJugadores().stream()
		.sorted(Comparator.comparing(Jugador::getAlturaEnCm).reversed())
		.forEach(j->System.out.println("Con el dorsal "+j.getDorsal()
		+", "+j.getApellido()
		+" "+j.getNombre()
		+" de "+j.getEdad()
		+" años, mide "+j.getAlturaEnCm()
		+"cm, "+"juega en la posición de "+j.getPosicion()));
	}
	
	public static void imprime5JugadoresAleatoriosDeLaLigaOrdenadosPorNombre() {
		List<Jugador> listaDesordenada= new ArrayList<>(obtenerTodosLosJugadores());
		Collections.shuffle(listaDesordenada);
		listaDesordenada.stream()
		.limit(5)
		.sorted(Comparator.comparing(Jugador::getNombre))
		.forEach(j->System.out.println(j));
	}
	
	//Imprime las diferentes alturas de todos los jugadores de la liga
	public static void imprimeLasDiferentesAlturasDeJugadoresDeLaLiga() {
		//Manera de Robe
		/*obtenerTodosLosJugadores().stream()
		.map(j->j.getAlturaEnCm())
		.collect(Collectors.toSet())
		.stream()
		.sorted()
		.forEach(a->System.out.println(a+"cm"));*/
		
		//Carlos manera
		/*obtenerTodosLosJugadores().stream()
		.map(Jugador::getAlturaEnCm)
		.distinct()
		.sorted()
		.forEach(a->System.out.println(a+"cm"));*/
		
		Set<Integer>setAlturas= new HashSet<>();
		
		obtenerTodosLosJugadores().stream()
		.map(j->j.getAlturaEnCm())
		.forEach(a->setAlturas.add(a));
		
		setAlturas.stream()
		.sorted() 
		.forEach(a->System.out.println(a+"cm"));
	}
	
	/*Un mapa donde la clave es la edad (Integer) y el valor es una lista de 
	todos los jugadores que tienen esa edad (Además debe estar ordenado por edades)*/
	public static void mapaDeEdades() {
		listaDeEquipos.stream()
		.flatMap(e->e.getListaDeJugadores().stream())
		.sorted(Comparator.comparing(Jugador::getEdad)) 
		.collect(Collectors.groupingBy(Jugador::getEdad,TreeMap::new,Collectors.toList()))
		.forEach((e,l)->{
			System.out.println("Edad: "+e);
			l.forEach(j->System.out.println(j.getNombre()+" "+j.getApellido()));
		});
	}
	
	//Lo mismo pero con posiciones
	public static void mapaDePosiciones() {
		listaDeEquipos.stream()
					.flatMap(e->e.getListaDeJugadores().stream())
					.sorted(Comparator.comparing(Jugador::getPosicion)) 
					.collect(Collectors.groupingBy(Jugador::getPosicion,TreeMap::new,Collectors.toList()))
					.forEach((p,l)->{
						System.out.println("POSICIÓN: "+p.getPosicion().toUpperCase());
						l.forEach(j->System.out.println(j.getNombre()+" "+j.getApellido()));
					});
	}
	
}
