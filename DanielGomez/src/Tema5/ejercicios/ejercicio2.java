package Tema5.ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int longitud = 3;

		int edades[] = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			System.out.print("Introduce un número: ");
			edades[i] = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < longitud; i++) {
			System.out.println(edades[i]);
		}

	}

}
