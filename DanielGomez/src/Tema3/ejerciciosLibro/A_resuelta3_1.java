package Tema3.ejerciciosLibro;

import java.util.Scanner;

public class A_resuelta3_1 {

	public static void main(String[] args) {
		//
		short maximo = -1, minimo = 150, n = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
		n = sc.nextShort();

		while (n != -1) {

			if (n > maximo) {
				maximo = n;
			}
			if (n < minimo) {
				minimo = n;
			}

			System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
			n = sc.nextShort();

		}

		System.out.println("Edad máxima introducida: " + maximo);
		System.out.println("Edad mínima introducida: " + minimo);

		sc.close();

	}

}
