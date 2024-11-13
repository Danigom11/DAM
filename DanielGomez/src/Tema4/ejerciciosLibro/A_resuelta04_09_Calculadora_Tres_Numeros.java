package Tema4.ejerciciosLibro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_resuelta04_09_Calculadora_Tres_Numeros {

	public static void main(String[] args) {
		// Número máximo de dos o tres dados.

		comparaNumeros(2, 3, 4);
		comparaNumeros(4, 3, 2);
		comparaNumeros(1, 1, 1);
		comparaNumeros(2, 3);
		comparaNumeros(3, 2);
		comparaNumeros(2, 2);
		
	}

	public static void comparaNumeros(int num1, int num2) {
		int max = num1 > num2 ? num1 : num2;
		System.out.println("El mayor de " + num1 + " y " + num2 + " es: " + max);
	}
	
	public static void comparaNumeros(int num1, int num2, int num3) {
		int max1 = num1 > num2 ? num1 : num2;
		int max2 = max1 > num3 ? max1 : num3;
		System.out.println("El mayor de " + num1 + ", " + num2 + " y " + num3 + " es: " + max2);
	}

}
