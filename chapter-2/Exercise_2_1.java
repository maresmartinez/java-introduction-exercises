import java.util.Scanner;

public class Exercise_2_1 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a value in Celcius
      System.out.print("Enter a value in Celcius: ");
      double celcius = input.nextDouble();
      
      // Convert the value to Farenheit
      double farenheit = (9 / 5.0) * celcius + 32;
      
      // Display the value to the user
      System.out.println(celcius + " degrees Celcius is equal to " + farenheit + " degrees Farenheit.");
   
   }

}