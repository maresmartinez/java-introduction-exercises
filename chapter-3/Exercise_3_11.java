import java.util.Scanner;

public class Exercise_3_11 {

   public static void main(String[] args) {
   
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter the month as an integer and year
      System.out.print("Enter the month and year: ");
      int monthNumber = input.nextInt();
      int year = input.nextInt();
      
      // Declare and initialize variables that will be used in If statements
      String monthWord = " ";
      int daysInMonth = 0;
      
      if (year < 0) {
         // Invalid user entry - exit program
         System.out.println("Error: invalid input for year \n"
                           + "Cannot enter negative number");
         System.exit(1);
      }
      
      if (monthNumber == 1) {
         monthWord = "January";
         daysInMonth = 31;
      }
      else if (monthNumber == 2) {
         monthWord = "February";
         
         // Figure out if leap year
         if (year % 4 == 0)
            daysInMonth = 29;
         else
            daysInMonth = 28;
         
      }
      else if (monthNumber == 3) {
         monthWord = "March";
         daysInMonth = 31;
      }
      else if (monthNumber == 4) {
         monthWord = "April";
         daysInMonth = 30;
      }
      else if (monthNumber == 5) {
         monthWord = "May";
         daysInMonth = 31;
      }
      else if (monthNumber == 6) {
         monthWord = "June";
         daysInMonth = 30;
      }
      else if (monthNumber == 7) {
         monthWord = "July";
         daysInMonth = 31;
      }
      else if (monthNumber == 8) {
         monthWord = "August";
         daysInMonth = 31;
      }
      else if (monthNumber == 9) {
         monthWord = "September";
         daysInMonth = 30;
      }
      else if (monthNumber == 10) {
         monthWord = "October";
         daysInMonth = 31;
      }
      else if (monthNumber == 11) {
         monthWord = "November";
         daysInMonth = 30;
      }
      else if (monthNumber == 12) {
         monthWord = "December";
         daysInMonth = 31;
      }
      else {
         // Invalid user entry - exit program
         System.out.println("Error: invalid input for month \n"
                               + "Must enter number between 1 and 12");
         System.exit(2);
      }
      
      System.out.println(monthWord + " " + year + " had " + daysInMonth
                        + " days.");
   
   }

}