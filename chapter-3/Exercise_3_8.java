import java.util.Scanner;

public class Exercise_3_8 {

   public static void main(String[] args) {
   
      // Create a scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter 3 integers
      System.out.println("Enter 3 integers: ");
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();
      
      // Declare a varible to hold values when switching numbers
      int temp = 0;
      
      if (number3 < number2) {
         temp = number3;
         number3 = number2;
         number2 = temp;
         
         if (number1 > number2) {
            temp = number2; 
            number2 = number1;
            number1 = temp;
            
            if (number2 > number3) {
               temp = number2;
               number2 = number3;
               number3 = temp;
            }
         }
      }
      else if (number3 == number2) {
         if (number1 > number2) {
            temp = number3;
            number3 = number1;
            number1 = temp;
         }
      }
      else if (number1 > number2) {
         temp = number1;
         number1 = number2;
         number2 = temp;
      }
   
     System.out.println("Your numbers in increasing order would be: "
                       + number1 + ", " + number2 + ", and " + number3);
      
   }

}