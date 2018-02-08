import java.util.Scanner;

public class Exercise_3_9 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter the first 9 digits of an ISBN
      System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
      int isbn9Digits = input.nextInt();
      
      int d1 = isbn9Digits % 1000000000 / 100000000;
      int d2 = isbn9Digits % 100000000 / 10000000;
      int d3 = isbn9Digits % 10000000 / 1000000;
      int d4 = isbn9Digits % 1000000 / 100000;
      int d5 = isbn9Digits % 100000 / 10000;
      int d6 = isbn9Digits % 10000 / 1000;
      int d7 = isbn9Digits % 1000 / 100;
      int d8 = isbn9Digits % 100 / 10;
      int d9 = isbn9Digits % 10 / 1; 
      
      int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6
                + d7 * 7 + d8 * 8 + d9 * 9) % 11;
      
      if (d10 == 10) {
         System.out.println("The ISBN-10 number is "
                        + d1 + d2 + d3 + d4 + d5 + d6 +d7 + d8
                        + d9 + "X");
      }
      else {
         System.out.println("The ISBN-10 number is "
                        + d1 + d2 + d3 + d4 + d5 + d6 +d7 + d8
                        + d9 + d10);
      }

   }

}