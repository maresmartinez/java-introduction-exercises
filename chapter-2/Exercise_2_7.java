import java.util.Scanner;

public class Exercise_2_7 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of minutes: ");
      double minutes = input.nextDouble();
      
      final int MINUTES_PER_YEAR = 525600;
      final int MINUTES_PER_DAY = 1440;
      final int DAYS_PER_YEAR = 365;
      
      double totalDays = minutes / MINUTES_PER_DAY;
      double currentDay = totalDays % DAYS_PER_YEAR;
      
      double totalYears = minutes / MINUTES_PER_YEAR;
      
      System.out.println(minutes + " minutes is approximately " + (int)totalYears
                            + " years and " + (int)currentDay + " days.");
   
   }

}