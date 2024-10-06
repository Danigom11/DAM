package ActividadesResueltasTema1;

import java.util.*;
public class Main12a {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Escriba un número (positivo o negativo): ");
      int n = sc.nextInt();
      int valorAbsoluto = n < 0 ? -1 * n : n;
      System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);
   }
}
