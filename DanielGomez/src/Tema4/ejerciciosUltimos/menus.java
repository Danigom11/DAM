package Tema4.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menus {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("""
					=============================================
					MENÜ
					Elige:
					1. ----
					2. ----
					3. Salir
					=============================================
					""");
			int eleccion = numeroMaximoMinimo("Elige de 1 a 3: ", 1, 3);

			switch (eleccion) {
			case 1 -> System.out.println("Lo que haga el 1");
			case 2 -> System.out.println("Lo que haga el 2");
			case 3 -> {
				System.out.println("Adios.");
				return;
			}
			}
		}

	}

	public static int numeroMaximoMinimo(String mensaje, int minimo, int maximo) {
		while (true) {
			System.out.print(mensaje);
			try {
				int numero = sc.nextInt();
				if (numero >= minimo && numero <= maximo) {
					sc.nextLine();
					return numero;
				}
				System.out.println("Introduce un número entre " + minimo + " y " + maximo + ".");
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
	}

}
