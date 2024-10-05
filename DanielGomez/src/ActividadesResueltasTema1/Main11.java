package ActividadesResueltasTema1;

import java.util.*;
public class Main11 {
   public static void main(String[] args) {
      final double PRECIO_MANZANAS = 2.35; 
      final double PRECIO_PERAS = 1.95;
      int vManz1Sem , vManz2Sem; 
      int vPeras1Sem , vPeras2Sem; 
      double impTotal; 
      Scanner sc = new Scanner(System.in);
      System.out.println("Para las manzanas: ");
      System.out.print("Ventas (en kilos) del primer semestre: ");
      vManz1Sem = sc.nextInt();
      System.out.print("Ventas (en kilos) del segundo semestre: ");
      vManz2Sem = sc.nextInt();
      System.out.println("Para las peras: ");
      System.out.print("Ventas (en kilos) del primer semestre: ");
      vPeras1Sem = sc.nextInt();
      System.out.print("Ventas (en kilos) del segundo semestre: ");
      vPeras2Sem = sc.nextInt();
      impTotal = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS;
      impTotal += (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;
      System.out.println("El importe total es de: " + impTotal + " euros");
   }
}
