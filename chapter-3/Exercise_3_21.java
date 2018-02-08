import java.util.Scanner;

public class Exercise_3_21 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter variables
      System.out.print("Enter year (e.g., 2012): ");
      int year = input.nextInt();
      System.out.print("Enter month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter the day of the month (1 - 31): ");
      int dayOfMonth = input.nextInt();
      
      // January and February are counted as 13 and 14 in Zeller's congruence
      // Change user input to reflect this
      if (month == 1) {
         month = 13;
         year -= 1;
      }
      if (month == 2) {
         month = 14;
         year -= 1;
      }
      
      // Declare and initialize variables to be used in Zeller's congruence
      int yearOfCentury = year % 100;
      int century = year / 100;
      
      // Calculate the day of the week using Zeller's congruence
      int dayofWeekNumber = (dayOfMonth + (26 * (month + 1) / 10) + yearOfCentury
                        + (yearOfCentury / 4) + (century / 4)
                        + (5 * century)) % 7;
      
      // Assign correct word to to the day of the week
      String dayOfWeekWord = " ";
      
      if (dayofWeekNumber == 0)
         dayOfWeekWord = "Saturday";
      else if (dayofWeekNumber == 1)
         dayOfWeekWord = "Sunday";
      else if (dayofWeekNumber == 2)
         dayOfWeekWord = "Monday";
      else if (dayofWeekNumber == 3)
         dayOfWeekWord = "Tuesday";
      else if (dayofWeekNumber == 4)
         dayOfWeekWord = "Wednesday";
      else if (dayofWeekNumber == 5)
         dayOfWeekWord = "Thursday";
      else if (dayofWeekNumber == 6)
         dayOfWeekWord = "Friday";
      
      // Display output to user
      System.out.println("Day of the week is " + dayOfWeekWord + ".");
   }

}