import java.util.Scanner;

public class Exercise_3_5 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter today's day: ");
      int todaysDayNumber = input.nextInt();
      
      System.out.print("Enter the number of days elapsed since today: ");
      int elapsedDays = input.nextInt();
      
      int futureDayNumber = (todaysDayNumber + elapsedDays) % 7;
      
      String todaysDayWord = " ";
      String futureDayWord = " ";
      
      if (todaysDayNumber == 0)
         todaysDayWord = "Sunday";
      else if (todaysDayNumber == 1)
         todaysDayWord = "Monday";
      else if (todaysDayNumber == 2)
         todaysDayWord = "Tuesday";
      else if (todaysDayNumber == 3)
         todaysDayWord = "Wednesday";
      else if (todaysDayNumber == 4)
         todaysDayWord = "Thursday";
      else if (todaysDayNumber == 5)
         todaysDayWord = "Friday";
      else if (todaysDayNumber == 6)
         todaysDayWord = "Saturday";
      
      if (futureDayNumber == 0)
         futureDayWord = "Sunday";
      else if (futureDayNumber == 1)
         futureDayWord = "Monday";
      else if (futureDayNumber == 2)
         futureDayWord = "Tuesday";
      else if (futureDayNumber == 3)
         futureDayWord = "Wednesday";
      else if (futureDayNumber == 4)
         futureDayWord = "Thursday";
      else if (futureDayNumber == 5)
         futureDayWord = "Friday";
      else if (futureDayNumber == 6)
         futureDayWord = "Saturday";
      
      System.out.println("Today is " + todaysDayWord
                        + " and the future day is " + futureDayWord + ".");
   
   }

}