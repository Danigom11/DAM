package ActividadesTema1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Nota 1: ");
			int nota1 = sc.nextInt();
			nota1 = (nota1 > 10) || (nota1 < 0) ? 0 : nota1;
			sc.nextInt();
			
			System.out.println("Nota 2: ");
			int nota2 = sc.nextInt();
			nota2 = nota2 > 10 ? 0 : nota2;
			sc.nextInt();
			
			System.out.println("Nota 3: ");
			int nota3 = sc.nextInt();
			nota3 = nota3 > 10 ? 0 : nota3;
			sc.nextInt();
			
			System.out.println("Nota 4: ");
			int nota4 = sc.nextInt();
			nota4 = nota4 > 10 ? 0 : nota4;
			sc.nextInt();
			
			double resultado = (nota1 * 0.30) + (nota2 * 0.25);
			
		} catch (InputMismatchException e){
			System.out.println("ERROR DE PROCESO");
		}
		

	}

}
