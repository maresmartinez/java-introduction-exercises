import java.util.Scanner;

public class SentinelValueDoWhile {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      int data = 0;
      int sum = 0;
      
      do {
      
         sum += data;
         
         System.out.print("Enter an integer (the input ends if it is 0): ");
         data = input.nextInt();
      
      } while (data != 0);
      
      System.out.println("The sum is " + sum);
   
   }

}