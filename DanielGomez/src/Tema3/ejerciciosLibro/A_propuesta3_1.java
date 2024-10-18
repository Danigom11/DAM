package Tema3.ejerciciosLibro;

import java.util.Scanner;

public class A_propuesta3_1 {

	public static void main(String[] args) {
		// Diseña una aplicación que muestre la edad máxima y mínima de un grupo de
		// alumnos. El usuario introducirá las edades y terminará escribiendo un -1

		int maximo = -9999, minimo = 9999, fin = 0, n;
		Scanner sc = new Scanner(System.in);

		while (fin != -1) {
			System.out.print("Introduce las edades de alumnos que quieras y cuando termines escribe -1: ");
			n = sc.nextInt();
			if (n==-1) {
				fin = -1;
			} else {
				if (n > maximo) {
					maximo = n;
				}
				if (n<minimo){
					minimo = n;
				}
			}
		}
		
		System.out.println("Edad máxima introducida: " + maximo);
		System.out.println("Edad mínima introducida: " + minimo);

		sc.close();

	}

}
