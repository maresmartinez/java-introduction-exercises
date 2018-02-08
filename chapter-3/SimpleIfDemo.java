import java.util.Scanner;

public class SimpleIfDemo {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer:");
      int userNumber = input.nextInt();
      
      if (userNumber % 5 == 0) {
         System.out.println("HiFive!");
      }
      if (userNumber % 2 == 0) {
         System.out.println("HiEven!");
      }
      
   }
}