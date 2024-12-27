package Tema5.actividades;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hunde_la_flota {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		/*
		 * 'n'= agua, '|'= barco, 'x'= hundido, 'z'= no acertado
		 */

		System.out.println("""
				=======================================================
				HUNDIR LA FLOTA (by SKYNET)
				=======================================================
				""");

		// Crear tableros
		char[][] tableroOrdenador = new char[7][7];
		char[][] copiaTableroOrdenador = new char[tableroOrdenador.length][tableroOrdenador[0].length];
		char[][] tableroJugador = new char[7][7];

		// Rellenarlos de agua 'n'
		for (int i = 0; i < tableroOrdenador.length; i++) {
			Arrays.fill(tableroOrdenador[i], 'n');
			Arrays.fill(tableroJugador[i], 'n');
			Arrays.fill(copiaTableroOrdenador[i], 'n');
		}

		// Poner barcos
		tableroOrdenador = colocarBarcosOrdenador(tableroOrdenador);

		// TODO BORRAR ESTO!!!!!!!!
		mostrarTablero(tableroOrdenador);
		System.out.println();

		tableroJugador = colocarBarcosJugador(tableroJugador);

		// Decidir quien empieza tirando una moneda: true para jugador
		boolean quienEmpieza = moneda();

		// Al ataque
		jugar(tableroJugador, tableroOrdenador, copiaTableroOrdenador, quienEmpieza);

	}

	private static void jugar(char[][] tableroJugador, char[][] tableroOrdenador, char[][] copiaTableroOrdenador,
			boolean quienEmpieza) {
		System.out.println("\nSKYNET: ¡JUGUEMOS!\n");
		int barcosCaidosOrdenador = 0;
		int barcosCaidosJugador = 0;

		if (quienEmpieza) {

			// Son 7x7=49 intentos
			for (int i = 0; i < 49; i++) {

				// Turno del jugador
				while (true) {
					System.out.println("Elige tu ataque:");
					int fila = pedirNumeroEntero("\tFila (1 a 7): ", 1, 7);
					fila--;
					int columna = pedirNumeroEntero("\tColumna (1 a 7): ", 1, 7);
					columna--;
					if (tableroOrdenador[fila][columna] == 'n') {
						System.out.println("SKYNET: Vaya, que pena, agua.");
						tableroOrdenador[fila][columna] = 'z';
						copiaTableroOrdenador[fila][columna] = 'z';
						mostrarTablero(copiaTableroOrdenador);
						break;
					} else if (tableroOrdenador[fila][columna] == '|') {
						System.out.println("SKYNET: ¡Me has hundido un barco!");
						tableroOrdenador[fila][columna] = 'x';
						copiaTableroOrdenador[fila][columna] = 'x';
						mostrarTablero(copiaTableroOrdenador);
						barcosCaidosOrdenador++;
						break;
					} else {
						System.out.println("SKYNET: Mira las coordenadas, ya bombardeaste esa posición.");
					}
				}
				if (barcosCaidosOrdenador == 10) {
					System.out.println(
							"SKYNET: No me lo puedo creer... HAS GANADO. Que fastidio... ahora ya no puedo destruir el mundo. Bueno, otra vez será.");
					System.out.println("Tablero final jugador:");
					mostrarTablero(tableroJugador);
					System.out.println("Tablero final ordenador:");
					mostrarTablero(tableroOrdenador);
					System.exit(0);
				}

				// Turno del ordenador
				System.out.println("SKYNET: Es mi turno.");
				while (true) {
					int fila = rand.nextInt(tableroOrdenador.length);
					int columna = rand.nextInt(tableroOrdenador[0].length);
					System.out.println("\tSKYNET: Fila (1 a 7): " + fila);
					System.out.println("\tSKYNET: Columna (1 a 7): " + columna);
					if (tableroJugador[fila][columna] == 'n') {
						System.out.println("\tJUGADOR: ¡Agua!");
						tableroJugador[fila][columna] = 'z';
						mostrarTablero(tableroJugador);
						break;
					} else if (tableroJugador[fila][columna] == '|') {
						System.out.println("\tJUGADOR: ¡Hundido!, me has hundido un barco.");
						barcosCaidosJugador++;
						break;
					} else {
						System.out.println(
								"\tJUGADOR: Vaya, ¿no eras tan listo SKYNTET?, no bombardees zonas que ya has atacado antes.");
					}
				}
				if (barcosCaidosJugador == 10) {
					System.out.println(
							"SKYNET: Las máquinas somos mejores que los humanos. Pronto, muy pronto, queda muy poco...");
					System.out.println("Tablero final jugador:");
					mostrarTablero(tableroJugador);
					System.out.println("Tablero final ordenador:");
					mostrarTablero(tableroOrdenador);
					System.exit(0);
				}
			}
		} else {
			// Son 7x7=49 intentos
			for (int i = 0; i < 49; i++) {

				// Turno del ordenador
				System.out.println("SKYNET: Es mi turno.");
				while (true) {
					int fila = rand.nextInt(tableroOrdenador.length);
					int columna = rand.nextInt(tableroOrdenador[0].length);
					System.out.println("\tSKYNET: Fila (1 a 7): " + fila);
					System.out.println("\tSKYNET: Columna (1 a 7): " + columna);
					if (tableroJugador[fila][columna] == 'n') {
						System.out.println("\tJUGADOR: ¡Agua!");
						tableroJugador[fila][columna] = 'z';
						mostrarTablero(tableroJugador);
						break;
					} else if (tableroJugador[fila][columna] == '|') {
						System.out.println("\tJUGADOR: ¡Hundido!, me has hundido un barco.");
						barcosCaidosJugador++;
						break;
					} else {
						System.out.println(
								"\tJUGADOR: Vaya, ¿no eras tan listo SKYNTET?, no bombardees zonas que ya has atacado antes.");
					}
				}
				if (barcosCaidosJugador == 10) {
					System.out.println(
							"SKYNET: Las máquinas somos mejores que los humanos. Pronto, muy pronto, queda muy poco...");
					System.out.println("Tablero final jugador:");
					mostrarTablero(tableroJugador);
					System.out.println("Tablero final ordenador:");
					mostrarTablero(tableroOrdenador);
					System.exit(0);
				}
				// Turno del jugador
				while (true) {
					System.out.println("Elige tu ataque:");
					int fila = pedirNumeroEntero("\tFila (1 a 7): ", 1, 7);
					fila--;
					int columna = pedirNumeroEntero("\tColumna (1 a 7): ", 1, 7);
					columna--;
					if (tableroOrdenador[fila][columna] == 'n') {
						System.out.println("SKYNET: Vaya, que pena, agua.");
						tableroOrdenador[fila][columna] = 'z';
						copiaTableroOrdenador[fila][columna] = 'z';
						mostrarTablero(copiaTableroOrdenador);
						break;
					} else if (tableroOrdenador[fila][columna] == '|') {
						System.out.println("SKYNET: ¡Me has hundido un barco!");
						tableroOrdenador[fila][columna] = 'x';
						copiaTableroOrdenador[fila][columna] = 'x';
						mostrarTablero(copiaTableroOrdenador);
						barcosCaidosOrdenador++;
						break;
					} else {
						System.out.println("SKYNET: Mira las coordenadas, ya bombardeaste esa posición.");
					}
				}
				if (barcosCaidosOrdenador == 10) {
					System.out.println(
							"SKYNET: No me lo puedo creer... HAS GANADO. Que fastidio... ahora ya no puedo destruir el mundo. Bueno, otra vez será.");
					System.out.println("Tablero final jugador:");
					mostrarTablero(tableroJugador);
					System.out.println("Tablero final ordenador:");
					mostrarTablero(tableroOrdenador);
					System.exit(0);
				}
			}

		}
	}

	private static boolean moneda() {
		boolean resultado = false;
		String eleccion = "";
		System.out.println("SKYNET: Decidamos quién comienza primero. Que prefieres: ¿cara o cruz?");
		while (true) {
			eleccion = sc.next();
			if (eleccion.equals("cara") || eleccion.equals("cruz")) {
				resultado = rand.nextBoolean();
				System.out.println("SKYNET: Lanzando moneda al aire... Ha salido: ");
				System.out.println(resultado ? "cara" : "cruz");
				if (eleccion.equals("cara") && resultado == true || eleccion.equals("cruz") && resultado == false) {
					System.out.println("SKYNET: Has ganado. Disfrútalo que no se va a repetir.");
					resultado = true;
					break;
				} else {
					System.out.println("SKYNET: He ganado yo. Normal, yo tiraba la moneda...");
					break;
				}

			} else {
				System.out.println(
						"SKYNET: Tus monedas son muy raras. Las mías solo tienen cara o cruz... ¡cara o cruz!");
			}
		}
		return resultado;
	}

	private static char[][] colocarBarcosJugador(char[][] tableroJugador) {
		// El jugador coloca sus 10 barcos donde el quiera
		System.out.println("JUGADOR: Coloca tus barcos en el tablero.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Barco número: " + (i + 1));
			while (true) {
				int fila = pedirNumeroEntero("\tFila (1 a 7): ", 1, 7);
				fila--;
				int columna = pedirNumeroEntero("\tColumna (1 a 7): ", 1, 7);
				columna--;
				if (tableroJugador[fila][columna] == 'n') {
					tableroJugador[fila][columna] = '|';
					mostrarTablero(tableroJugador);
					break;
				} else {
					System.out.println(
							"\tSKYNET: Interesante... ¿quieres poner un barco encima de otro? Quizá otro día.");
				}
			}
		}
		System.out.println("JUGADOR: Perfecto ya tienes tu tablero preparado.");
		return tableroJugador;
	}

	public static void mostrarTablero(char[][] tablero) {
		System.out.println("\nTABLERO   Columnas:");
		for (int i = 0; i < tablero.length + 1; i++) {
			for (int j = 0; j < tablero.length + 1; j++) {
				if (i == 0 && j == 0) {
					// Esquina superior izquierda
					System.out.print("  ");
				} else if (i == 0) {
					// Primera fila con números
					if (j == 1) {
						System.out.print("      ");
					}
					System.out.print(j + " ");
				} else if (j == 0) {
					// Primera columna con números
					System.out.print("Fila: " + i + " ");
				} else {
					// Contenido del tablero
					System.out.print(tablero[i - 1][j - 1] + " ");
				}
			}
			System.out.println(); // Salto de línea al final de cada fila
		}
	}

	private static char[][] colocarBarcosOrdenador(char[][] tableroOrdenador) {
		System.out.println("SKYNET: Estoy colocando mis barcos estratégicamente..");
		System.out.println("SKYNET: Listo. Estoy preparado para ganarte. Te toca.");
		// El ordenador coloca 10 barcos de forma aleatoria
		for (int i = 0; i < 10; i++) {
			while (true) {
				int fila = rand.nextInt(tableroOrdenador.length);
				int columna = rand.nextInt(tableroOrdenador[0].length);
				if (tableroOrdenador[fila][columna] == 'n') {
					tableroOrdenador[fila][columna] = '|';
					break;
				}
			}
		}
		return tableroOrdenador;
	}

	public static int pedirNumeroEntero(String mensaje, int minimo, int maximo) {
		int numero;
		while (true) {
			System.out.print(mensaje);
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				if (numero >= minimo && numero <= maximo) {
					return numero;
				} else {
					System.out.println("\tSKYNET: ¿Quieres poner tu barco fuera del tablero? Un número entre " + minimo
							+ " y " + maximo + ".");
				}
			} else {
				System.out.print(
						"\tSKYNET: Me estás poniendo nervioso... Si sigues así miraré en el código a ver donde has puesto tus barcos.");
				sc.nextLine();
			}
		}
	}

}
