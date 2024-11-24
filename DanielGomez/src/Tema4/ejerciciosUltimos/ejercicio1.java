package Tema4.ejerciciosUltimos;

public class ejercicio1 {

	public static void main(String[] args) {
		NombreDiaSemana(13, 4);
	}

	public static void NombreDiaSemana(int mes, int dia) {
		int diaAgno = 0;
		int numFinal = 0;
		String resultado = "", nombreMes = "";

		switch (mes) {
		case 1, 3, 5, 7, 8, 10 -> {
			if (dia > 31) {
				System.out.println("Día incorrecto");
				return;
			}
		}
		case 2 -> {
			if (dia > 28) {
				System.out.println("Día incorrecto");
				return;
			}

		}
		case 4, 6, 9, 11 -> {
			if (dia > 30) {
				System.out.println("Día incorrecto");
				return;
			}
		}
		default -> {
			System.out.println("Mes incorrecto");
			return;
		}
		}

		switch (mes) {
		case 1 -> nombreMes = "Enero";
		case 2 -> nombreMes = "Febrero";
		case 3 -> nombreMes = "Marzo";
		case 4 -> nombreMes = "Abril";
		case 5 -> nombreMes = "Mayo";
		case 6 -> nombreMes = "Junio";
		case 7 -> nombreMes = "Julio";
		case 8 -> nombreMes = "Agosto";
		case 9 -> nombreMes = "Septiembre";
		case 10 -> nombreMes = "Octubre";
		case 11 -> nombreMes = "Noviembre";
		case 12 -> nombreMes = "Diciembre";
		}

		for (int i = 1; i < mes; i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10 -> diaAgno += 31;
			case 2 -> diaAgno += 28;
			case 4, 6, 9, 11 -> diaAgno += 30;
			}
		}

		diaAgno += dia;

		for (int i = diaAgno; i > 0; i -= 7) {
			numFinal = i;
		}

		switch (numFinal) {
		case 1 -> resultado = "Viernes";
		case 2 -> resultado = "Sábado";
		case 3 -> resultado = "Domingo";
		case 4 -> resultado = "Lunes";
		case 5 -> resultado = "Martes";
		case 6 -> resultado = "Miércoles";
		case 7 -> resultado = "Jueves";
		}

		System.out.println("El día " + dia + " de " + nombreMes + " es " + resultado);

	}
}
