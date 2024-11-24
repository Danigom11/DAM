package Tema4.ejerciciosUltimos;

public class convertidores_numeros {

	public static void main(String[] args) {
		int n = 1234;
		darVueltaNumeroAString(n);
		numeroCifras(n);
		darVueltaNumeroConComas(n);
	}

	public static void darVueltaNumeroAString(int n) {

		String resultado = "";
		for (int i = n; i > 0; i /= 10) {
			resultado = resultado + i % 10;
		}
		System.out.println("El número " + n + " al revés es: " + resultado);

	}
	
	public static void darVueltaNumeroConComas(int n) {
		String resultado = "";
		for (int i = n; i>0; i/=10) {
			resultado = i== n? resultado + i%10: resultado + ", " + i%10;
		}
		System.out.println("El número " + n + " al revés es: " + resultado);

	}

	public static void numeroCifras(int n) {
		int contador = 0;
		for (int i = n; i > 0; i /= 10) {
			contador++;
		}
		System.out.println("El número de cifras de " + n + " es: " + contador);

	}
	
	
	

}
