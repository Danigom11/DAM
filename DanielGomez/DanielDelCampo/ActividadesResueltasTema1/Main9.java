package ActividadesResueltasTema1;

import java.util.*;
public class Main9 {
   public static void main(String[] args) {
      int numero;
      System.out.print("Escriba un número: ");
      numero = new Scanner(System.in).nextInt();
      boolean esPar = (numero % 2) == 0; 
      System.out.println("Es par: " + esPar);
   }
}
