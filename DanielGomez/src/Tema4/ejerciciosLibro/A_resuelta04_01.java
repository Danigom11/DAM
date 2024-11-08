package Tema4.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta04_01 {

	public static void main(String[] args) {
		// Diseñar la función eco() a la que se le pasa como parámetro un número n, y
		// muestra por pantalla n veces el mensaje Eco...
		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (n != 0) {
			System.out.print("Dime un número (0 para salir): ");
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error al introducir los datos");
				break;
			}
			sc.nextLine();

			eco(n);
		}
		System.out.println("Hasta otro día!");

	}

	static public void eco(int n) {
		// Bucle para controlar las repeticiones.
		for (int i = 1; i <= n; i++) {
			System.out.println("Eco...");
		}
	}

}
