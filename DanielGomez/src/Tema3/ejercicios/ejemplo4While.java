package Tema3.ejercicios;
import java.util.Scanner;

public class ejemplo4While {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Proceso repetitivo donde se leerán N números de teclado. N también se leerá y
		 * debe ser mayor que 0. Visualizar después de la lectura el máximo y el mínimo
		 * valor introducido por teclado
		 */
		int n, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
		
		System.out.print("Número mayor que cero: ");
		n = sc.nextInt();
		sc.nextLine();
		
		while (n>0) {
			if (n>maximo) {
				maximo = n;
			}
			if (n<minimo) {
				minimo = n;
			}
			System.out.print("Número mayor que cero: ");
			n = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("Número máximo: " + maximo);
		System.out.println("Número máximo: " + minimo);		
		sc.close();
			
	}

}
