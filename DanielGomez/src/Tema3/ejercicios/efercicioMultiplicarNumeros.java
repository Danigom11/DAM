package Tema3.ejercicios;
import java.util.Scanner;

public class efercicioMultiplicarNumeros {

	public static void main(String[] args) {
		// MOSTRAR EL PRODUCTO DE LOS NÚMEROS DEL 1 AL N (N SE LEE DE TECLADO)
		int numero, c, resultado = 1;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		sc.nextLine();
		
		c=1;
		
		while(c<=numero) {
			resultado *= c;
			c++;
		}
		System.out.println(resultado);
		
	}

}
