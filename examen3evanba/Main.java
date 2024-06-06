package examen3evanba;

import java.util.Arrays;

public class Main {

	public static void main(String[] args)  {
		LigaNba.crearLiga();
		
		//Información básica de la liga
		//System.out.println(LigaNba.informacionBasicaDeLaLiga());
		
		//Información detallada de cada equipo
		//System.out.println(LigaNba.informacionDetalladaDeCadaEquipo());
		
		//Metodo de obtener un equipo por su nombre
		/*try {
			System.out.println(LigaNba.obtenerUnEquipoPorSuNombre("chicago").get().getNombre());
		}catch(EquipoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}*/
		
		//Método de obtener un equipo por su técnico
		/*try {
			System.out.println(LigaNba.obtenerUnEquipoPorSuTecnico("phil").get());
		}catch(TecnicoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}*/
		
		//Método para obtener todos los jugadores
		//LigaNba.obtenerTodosLosJugadores().forEach(j->System.out.println(j));
		
		//Obtener la edad media de los jugadores de la liga
		//System.out.println(LigaNba.obtenerEdadMediaJugadoresDeLaLiga());
		
		//Obtener jugadores de la Liga por una posición específica
		//LigaNba.obtenerJugadoresDeLaLigaPorPosicion(Posicion.AL).forEach(j->System.out.println(j));;
		
		//Obtener personas activas en la liga
		//System.out.println(LigaNba.obtenerPersonasActivasEnLaLiga());
	
		//Obtener media de edad de los jugadores de un Equipo en concreto
		//System.out.println(LigaNba.obtenerEdadMediaJugadoresDeUnEquipo("Chicago Bulls 95_96"));
		
		//Obtener jugadores con menor y mayor altura
		//System.out.println(LigaNba.jugadorDeMenorAltura());
		//System.out.println(LigaNba.jugadorDeMayorAltura());
		
		//Paso de escribir lo que hace esto, abajo lo pone
		//LigaNba.imprimirJugadoresOrdenadosPorNombreConElApellidoEnPrimerLugarYEnMayusculas();
		
		//Hola
		//LigaNba.imprimirJugadoresPorDorsalOrdenadosPorAlturaDescendente();
		
		//Hola de nuevo
		//LigaNba.imprime5JugadoresAleatoriosDeLaLigaOrdenadosPorNombre();
		
		//Diferentes alturas
		//LigaNba.imprimeLasDiferentesAlturasDeJugadoresDeLaLiga();
		
		//Hola
		//LigaNba.mapaDeEdades();		
		
		LigaNba.mapaDePosiciones();
	}
	
}
