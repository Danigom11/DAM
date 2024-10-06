package ActividadesResueltasTema1;

import java.util.Scanner;
public class Main6 {
   public static void main(String[] args) {
      int nota1, nota2;
      double media;
      Scanner sc = new Scanner(System.in);
      System.out.print("Nota 1: ");
      nota1 = sc.nextInt();
      System.out.print("Nota 2: ");
      nota2 = sc.nextInt();
      //calculamos la media
      media = (nota1 + nota2) / 2.0;
      System.out.println("La media es: " + media);
      sc.close();
   }
}
