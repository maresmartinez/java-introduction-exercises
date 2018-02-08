import java.util.Scanner;

public class Exercise_3_10 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      int number1 = (int)(Math.random() * 100);
      int number2 = (int)(Math.random() * 100);
      
      if (number1 < number2) {
         int temp = number1;
         number1 = number2;
         number2 = temp;
      }
      
      System.out.print("What is " + number1 + " - " + number2 + "?");
      int studentAnswer = input.nextInt();
      
      if (studentAnswer == number1 - number2)
         System.out.println("You are correct!");
      else
         System.out.println("You are incorrect :( \n" + "The answer is " + (number1 - number2));
   
   }

}