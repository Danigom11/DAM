package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utiles {

	public static int pedirNumeroMayorCero(String texto) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n <= 0) {
			System.out.print(texto);
			try {
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error.");
			}
			sc.nextLine();
		}
		sc.close();
		return n;
	}

}
