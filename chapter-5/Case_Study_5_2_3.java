import java.util.Scanner;

public class Case_Study_5_2_3 {

   public static void main(String[] args) {
      
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      System.out.print("How many subtraction questions would you like?");
      int numberOfQuestions = input.nextInt();
      int counter = 0;
      int correctAnswers = 0;
      String testKey = " ";
      
      while(counter < numberOfQuestions) {
         
         int number1 = (int)(Math.random() * 10);
         int number2 = (int)(Math.random() * 10);
         
         if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
         }
         
         System.out.print("What is " + number1 + " - " + number2 + "?");
         int studentAnswer = input.nextInt();
         
         if (studentAnswer == number1 - number2) {
            correctAnswers++;
         }
         
         testKey += "\n" + number1 + " - " + number2 + " = " + (number1 - number2)
            + ((studentAnswer == number1 - number2) ? " correct" : " wrong");
         
         counter++;
      
      }
      
      System.out.printf("You got %d / %d correct\n", correctAnswers, numberOfQuestions);
      System.out.printf("Here are your results:%s\n", testKey);
      
   }
   
}