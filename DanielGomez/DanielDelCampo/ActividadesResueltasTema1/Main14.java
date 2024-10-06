package ActividadesResueltasTema1;

import java.util.Locale; 
import java.util.Scanner;
public class Main14 {
   public static void main(String[] args) {
      double n; 
      int redondeo;
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 
      System.out.print("Escriba un número decimal (con punto): ");
      n = sc.nextDouble();
      redondeo = (int) (n + 0.5);
      System.out.println(n + " redondeado es: " + redondeo);
   }
}
