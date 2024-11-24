package Tema4.ejerciciosUltimos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class funciones_control_entrada_numeros {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(numeroMaximoMinimo("Introduce un número entre 1 y 3: " , 1, 3));
		System.out.println(numeroMinimo("Introduce un número mayor que 0: " , 1));

	}

	// Control números con máximo y mínimo
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
	
	public static int numeroMinimo(String mensaje, int min) {
		int n = min -1;
		while (n < min) {
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
