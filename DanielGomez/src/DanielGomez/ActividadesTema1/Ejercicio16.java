package DanielGomez.ActividadesTema1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * 16) Expresión que indica si una fecha es válida o no. 
		 * La Fecha viene dada como dd/mm/yyyy. 
		 * Leer por teclado el dia, el mes y el año. Definirlos de tipo int. 
		 * Un año válido es a partir de 1900 (4 digitos) a 9999.
		 * En un año bisiesto febrero tiene 29 dias, y si no es bisiesto 28.
		 * El resto de meses tiene de 1 a 31 días, ojo unos tienen 30 y otros 31 días.
		 * Enero=31, Febrero 29 si es bisiesto y si no 28, Marzo=31,
		 * Abril=30, Mayo=31, Junio=30, Julio=31,
		 * Agosto=31, septiembre=30, Octubre =31, noviembre=30, diciembre=31
		 */
		int dia, mes, agno;
		Scanner sc = new Scanner(System.in);
		boolean diaValido, mesValido, agnoValido, fechaValida;
		String mensaje;
		String fecha;

		
		System.out.println("Dime el día:");
		dia = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime el mes:");
		mes = sc.nextInt();
		System.out.println("Dime el año:");
		agno = sc.nextInt();
		
		agnoValido = (agno >= 1900 && agno <= 9999) ? true : false;
		boolean esBisiesto = ((agno % 4) == 0 ) && (((agno % 100) != 0) || ((agno % 400) == 0)) ? true : false;
		
		mesValido = (mes >=1 && mes <=12) ? true : false;
		
		diaValido = mes == 1 && dia >=1 && dia <= 31 ? true :
			mes == 2 && esBisiesto == true && dia >=1 && dia <= 29 ? true :
				mes == 2 && esBisiesto == false && dia >=1 && dia <= 28 ? true :
				mes == 3 && dia >=1 && dia <= 31 ? true :
					mes == 4 && dia >=1 && dia <= 30 ? true :
						mes == 5 && dia >=1 && dia <= 31 ? true :
							mes == 6 && dia >=1 && dia <= 30 ? true :
								mes == 7 && dia >=1 && dia <= 31 ? true :
									mes == 8 && dia >=1 && dia <= 31 ? true :
										mes == 9 && dia >=1 && dia <= 30 ? true :
											mes == 10 && dia >=1 && dia <= 31 ? true :
												mes == 11 && dia >=1 && dia <= 30 ? true :
													mes == 12 && dia >=1 && dia <= 31 ? true : false;
		
		
		fechaValida = agnoValido && mesValido && diaValido;
		mensaje = fechaValida ? "Fecha válida" : "Fecha no válida";
		fecha = fechaValida ? dia + "/" + mes + "/" + agno : "-/-/-";
		System.out.println("Fecha: " + fecha);
		System.out.println(mensaje);
											
										
		sc.close();

	}

}
