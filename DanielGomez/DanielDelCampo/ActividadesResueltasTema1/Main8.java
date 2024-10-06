package ActividadesResueltasTema1;

import java.util.Scanner;

public class Main8 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Escriba su edad: ");
       int edad = sc.nextInt();
       boolean mayorEdad = edad >= 18; 
       System.out.println("Mayoría de edad: " + mayorEdad);   
   }
}
