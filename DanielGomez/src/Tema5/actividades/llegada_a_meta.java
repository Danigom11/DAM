package Tema5.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class llegada_a_meta {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Ejercicio 4: llegada_a_meta Diseña una aplicación para gestionar la llegada a
		 * meta de los participantes de una carrera. Cada uno de ellos dispone de un
		 * dorsal (un número entero) que los identifica. En la aplicación se introduce
		 * el número de dorsal de cada corredor cuando este llega a la meta. Para
		 * indicar que la carrera ha finalizado (han llegado todos los corredores a la
		 * meta), se introduce como dorsal el número —1. A continuación, la aplicación
		 * solicita información extra de los corredores. En primer lugar, se introducen
		 * los dorsales de todos los corredores menores de edad; para premiarlos por su
		 * esfuerzo se les avanza un puesto en el ranking general de la carrera, es
		 * decir, es como si hubieran adelantado al corredor que llevaban delante. En
		 * segundo lugar, se introducen los dorsales de los corredores que han dado
		 * positivo en el test antidopaje, lo que provoca su expulsión inmediata. Para
		 * finalizar, se introducen los dorsales de los corredores que no han pagado su
		 * inscripción en la carrera, lo que provoca que se releguen a los últimos
		 * puestos del ranking general. La aplicación debe mostrar los dorsales de los
		 * corredores que han conseguido las medallas de oro, plata y bronce
		 */
		
		llegadaAMeta();
	}

	public static void llegadaAMeta() {
		System.out.println("""
				=======================================================
				LLEGADA A META
				Introduce los dorsales según han llegado a meta.
				Al menos uno para poder terminar el programa.
				Después los menores de edad, los que han dado positivo
				en el test antidopaje y los que no han pagado su
				inscripción. Y verás los tres primeros.
				=======================================================
				""");
		int[] corredores = dorsalesEnMeta();
		corredores = dorsalesMenoresEdad(corredores);
		corredores = dorsalesPositivoAntidopaje(corredores);
		corredores = dorsalesNoInscritos(corredores);

		// Resultados finales
		System.out.println("MEDALLA DE BRONCE PARA...");
		System.out.println("El dorsal número: " + corredores[corredores.length - 3]);
		System.out.println("MEDALLA DE PLATA PARA...");
		System.out.println("El dorsal número: " + corredores[corredores.length - 2]);
		System.out.println("MEDALLA DE ORO PARA...");
		System.out.println("El dorsal número: " + corredores[corredores.length - 1]);
	}

	// Función para los que no han pagado la inscripción
	public static int[] dorsalesNoInscritos(int[] tabla) {
		System.out.println("AHORA DIME LOS DORSALES QUE NO HAN PAGADO LA INSCRIPCIÓN");
		System.out.println("Dorsales disponibles: " + Arrays.toString(tabla));

		while (true) {
			int dorsal = pedirNumeroEntero("\tDorsal no inscrito (-1 salir): ", -1);

			// Control de salida
			if (dorsal == -1) {
				return tabla;
			}

			int posicion = Arrays.binarySearch(tabla, dorsal);

			// Control dorsal válido
			if (posicion < 0) {
				System.out.println("Introduce un dorsal válido.");
			} else {

				// Controlar que no sea el último (posición 0)
				if (posicion > 0) {

					// Guardar el valor
					int aux = tabla[posicion];

					// Mover un puesto para arriba a los que estaban antes
					for (int i = posicion; i > 0; i--) {
						tabla[i + 1] = tabla[i];
					}

					// Poner el último el dorsal
					tabla[0] = aux;
				}
			}
		}
	}

	// Función para positivos en el test antidopaje
	public static int[] dorsalesPositivoAntidopaje(int tabla[]) {
		System.out.println("AHORA DIME LOS DORSALES DE LOS POSITIVOS EN EL TEST ANTIDOPAJE");
		System.out.println("Dorsales disponibles: " + Arrays.toString(tabla));

		while (true) {
			int dorsal = pedirNumeroEntero("\tDorsal positivo test antidopaje (-1 salir)", -1);
			int posicion = Arrays.binarySearch(tabla, dorsal);

			// Control salida
			if (dorsal == -1) {
				return tabla;
			}

			// Control dorsal válido
			if (posicion < 0) {
				System.out.println("Introduce un dorsal válido.");
			} else {

				// Eliminar el dorsal moviéndolo al final y quitando la última posición
				int aux = tabla[tabla.length - 1];
				tabla[tabla.length - 1] = tabla[posicion];
				tabla[posicion] = aux;
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			}
		}
	}

	// Función para dorsales menores de edad
	public static int[] dorsalesMenoresEdad(int tabla[]) {
		System.out.println("AHORA DIME LOS DORSALES DE LOS CORREDORES MENORES DE EDAD");
		System.out.println("Dorsales disponibles: " + Arrays.toString(tabla));

		while (true) {
			int dorsal = pedirNumeroEntero("\tMenor de edad (-1 salir)", -1);
			int posicion = Arrays.binarySearch(tabla, dorsal);

			// Controlar salida
			if (dorsal == -1) {
				return tabla;
			}

			// Controlar que el dorsal elegido está en la lista
			if (posicion < 0) {
				System.out.println("Introduce un dorsal válido.");
			} else {

				// Moverlo un puesto hacia arriba en la tabla
				// Controlar que no sea el primero (última posición de la tabla)
				if (posicion < tabla.length) {
					int aux = tabla[posicion + 1];
					tabla[posicion + 1] = dorsal;
					tabla[posicion + 1] = aux;
				}
			}
		}
	}

	// Función para hacer la tabla con todos los corredores que han llegado a meta
	public static int[] dorsalesEnMeta() {
		int[] corredores = new int[0];

		while (true) {
			int dorsal = pedirNumeroEntero("\tDorsal número: ", -1);

			// Control de salida
			if (dorsal == -1) {
				if (corredores.length == 0) {
					System.out.println("Antes de salir introduce al menos un dorsal.");
				} else {
					break;
				}
			}

			// Agrandar la tabla e ir añadiendo los números
			corredores = Arrays.copyOf(corredores, corredores.length + 1);
			corredores[corredores.length - 1] = dorsal;
		}

		return corredores;
	}

	public static int pedirNumeroEntero(String mensaje, int minimo) {
		int numero;
		while (true) {
			System.out.print(mensaje);
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				sc.nextLine();
				if (numero >= minimo) {
					return numero;
				} else {
					System.out.println("Introduce un número mayor que " + minimo + ".");
				}
			} else {
				System.out.print("Introduce un número correcto. ");
				sc.nextLine();
			}
		}
	}
}
