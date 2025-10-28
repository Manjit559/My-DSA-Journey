package practice_java;
import java.util.Scanner;
public class profitloss {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter cp:");
      int cp = sc.nextInt();
      System.out.println("Enter sp:");
      int sp = sc.nextInt();
      if (sp >= cp) // cp = cost price
         System.out.println("profit");

      System.out.println("Loss");
      if (cp >= sp) // sp = selling price

         System.out.println("no profit no loss");
      if (sp == cp)
         ;
      sc.close();
   }

}

