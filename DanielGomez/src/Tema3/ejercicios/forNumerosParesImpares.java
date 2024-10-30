package Tema3.ejercicios;

public class forNumerosParesImpares {

	public static void main(String[] args) {
		// Pares 100 impares hasta 99
		String pares1 = "", impares1 = "";
		
		for (int i = 0; i <= 100; i += 2) {
			pares1 += i + (i == 100 ? "": ", ");
		}
		
		for (int i = 1; i <= 100; i += 2) {
			impares1 += i + (i == 100 ? "": ", ");
		}
		
		System.out.println(pares1);
		System.out.println(impares1);
			
		
		
		
		
		
		
		
		
		
		String pares = "", impares = "";
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				pares += i + (i == 100 ? "": ", ");
			} else {
				impares += i + (i == 99 ? "": ", ");
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		
		
		
		
		
		
		
		
		
		String pares3 = "", impares3 = "";
		
		for (int par = 94, impar = 95; par < 102 && impar < 10 ; par+=2, impar +=2) {
			
				pares3 += par + (par == 100 ? "": ", ");
				impares3 += impar + (impar == 99 ? "": ", ");
		
		}
		
		System.out.println(pares3);
		System.out.println(impares3);
	}

}








