import java.util.Scanner;

public class FutureTuition {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter values needed
      System.out.print("Enter your tuition this year: $");
      double currentTuition = input.nextInt();      
      System.out.print("Enter the rate of tuition increase (as a percentage): ");
      double yearlyIncrease = input.nextInt();
      double increaseFraction = (yearlyIncrease / 100) + 1;
      
      double futureTuition = currentTuition;
      int yearsPassed = 0;
      
      for (yearsPassed = 0; futureTuition <= (currentTuition * 2); yearsPassed++) {
      
         futureTuition *= increaseFraction;
      
      }
   
      String tuitionOutput = "At the current rate of increase (%.0f%%), "
         + "your tuition would be doubled in %d year(s).\n"
         + "Tuition will be $%.2f in %d years.\n";
      System.out.printf(tuitionOutput, yearlyIncrease, yearsPassed, futureTuition, yearsPassed);
      
   }

}