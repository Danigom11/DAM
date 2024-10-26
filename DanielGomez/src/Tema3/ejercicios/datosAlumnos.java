package Tema3.ejercicios;
import java.util.Scanner;

public class datosAlumnos {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre;
		int curso;
		char sexo, finalizar;
		
		do {
			
			// Introducir nombre
			System.out.print("Nombre: ");
			nombre = sc.next();
			sc.nextLine();
			
			// Control de sexo correcto
			do {
				System.out.print("Sexo (H,h,M,m): ");
				sexo = sc.next().charAt(0);
				sc.nextLine();
				
			} while (sexo != 'H' && sexo != 'h' && sexo != 'M' && sexo != 'm');
			
			// Control de curso correcto
			do {
				System.out.print("Curso (1 a 3): ");
				curso = sc.nextInt();
				sc.nextLine();			
			} while (curso <1 || curso > 3);
			
			// Cálculos
			
			
			// Control de cierre del programa
			System.out.print("¿Desea introducir más datos de alumnos (N,n para salir)?");
			finalizar = sc.next().charAt(0);
			
		} while(finalizar != 'n' || finalizar != 'N');
		
	}

}
