package Tema4.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menus {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
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

	public static int numeroMaximoMinimo(String mensaje, int min, int max) {
		int n = max + 1;
		while (n < min || n > max) {
			System.out.print(mensaje);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Error. ");
			}
			sc.nextLine();
		}
		return n;
	}

}
