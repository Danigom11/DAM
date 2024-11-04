package Tema3.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio7_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, nomMaxNotaMedia = "", nomMinNotaMedia = "";
        double maxNota = Double.MIN_VALUE, minNota = Double.MAX_VALUE;
        int n = 0;

        // Variables para el resultado final
        String visualizacion = "";
        String iguales = "====================================================";

        // Solicitar el número de alumnos
        while (n <= 0) {
            System.out.print("NÚMERO DE ALUMNOS A LEER: ");
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido");
                sc.nextLine();
            }
        }

        System.out.println(iguales);

        // Lectura de cada alumno
        for (int i = 1; i <= n; i++) {
            int totalNotaAlumno = 0;
            int nAsignaturas = 0;
            double mediaAlumno;
            int notaAsigMasAlta = 0;
            String asigMasNota = "";

            // Lectura del nombre del alumno
            System.out.println("ENTRADA DE DATOS PARA ALUMNO " + i + ":");
            System.out.print("\tNombre de alumno: ");
            nombre = sc.next();
            sc.nextLine();

            // Lectura del número de asignaturas (entre 1 y 6)
            while (nAsignaturas < 1 || nAsignaturas > 6) {
                System.out.print("\tNúmero de asignaturas (entre 1 y 6): ");
                try {
                    nAsignaturas = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un valor válido.");
                    sc.nextLine(); // Limpiar el buffer
                }
            }
            sc.nextLine(); // Limpiar el buffer después de leer el número de asignaturas

            // Lectura de las asignaturas y sus notas
            for (int j = 1; j <= nAsignaturas; j++) {
                String nAsig;
                int nota = 0;

                // Nombre de la asignatura
                System.out.print("\t\tNombre de asignatura: ");
                nAsig = sc.nextLine();

                // Nota de la asignatura (entre 1 y 10)
                while (nota < 1 || nota > 10) {
                    System.out.print("\t\tNota (entre 1 y 10): ");
                    try {
                        nota = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Introduce un valor válido.");
                        sc.nextLine();
                    }
                }
                sc.nextLine();

                // Comparar para encontrar la asignatura con la nota más alta
                if (nota > notaAsigMasAlta) {
                    notaAsigMasAlta = nota;
                    asigMasNota = nAsig;
                }

                totalNotaAlumno += nota;
            }

            // Calcular la media de este alumno
            mediaAlumno = (double) totalNotaAlumno / nAsignaturas;
            System.out.printf("\tNota media: %,.2f%n", mediaAlumno);
            System.out.println("\tAsignatura con más nota: " + asigMasNota);

            System.out.println(iguales);

            // Rellenar visualizacion
            visualizacion += String.format("%-13s %-13d %-s%n", nombre, nAsignaturas, asigMasNota);

            // Control de alumno con máxima y mínima nota media
            if (mediaAlumno > maxNota) {
                maxNota = mediaAlumno;
                nomMaxNotaMedia = nombre;
            }
            if (mediaAlumno < minNota) {
                minNota = mediaAlumno;
                nomMinNotaMedia = nombre;
            }
        }

        // Mostrar el resumen final
        System.out.println("NOMBRE     Nº ASIG     ASIG MAS NOTA");
        System.out.println("========== ==========  =============");
        System.out.print(visualizacion);

        System.out.println(iguales);

        System.out.println("Alumno con > nota media: " + nomMaxNotaMedia);
        System.out.printf("\tNota media: %.2f%n", maxNota);
        System.out.println("Alumno con < nota media: " + nomMinNotaMedia);
        System.out.printf("\tNota media: %.2f", minNota);
    }
}
