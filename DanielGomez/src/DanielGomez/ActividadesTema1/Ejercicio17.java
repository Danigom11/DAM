package DanielGomez.ActividadesTema1;

public class Ejercicio17 {

	public static void main(String[] args) {
		// 17) Expresión que indica si una hora es válida o no. La hora viene dada en HH:MM:SS
		int horas = 2, minutos = 400, segundos = 4;
		
		String horaValida = (horas >= 0 && horas < 24)
				&& (minutos >= 0 && minutos <= 60)
				&& (segundos >= 0 && segundos <= 99)
				? "Hora válida" : "Hora no válida";
		System.out.println(horaValida);

	}

}
