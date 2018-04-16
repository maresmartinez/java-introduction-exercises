import java.util.Scanner;

public class PrintCalendar {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Prompt user to enter year
      System.out.print("Enter full year (e.g. 2012): ");
      int year = input.nextInt();
      
      // Prompt user to enter month
      System.out.print("Enter month as a number between 1 and 12: ");
      int month = input.nextInt();
      
      // Print calendar for month of the year
      printMonth(year, month);
   
   }
   
   private static void printMonth(int year, int month) {
   
      printMonthTitle(year, month);
      printMonthBody(year, month);
      
   }
   
   private static void printMonthTitle(int year, int month) {
      
      System.out.printf("%19s %d\n", getMonthName(month), year);
      System.out.println("   --------------------------------");
      System.out.println("   Sun Mon Tues  Wed  Thu  Fri  Sat");
      
   }
   
   private static void printMonthBody(int year, int month) {
      
      int startDay = getStartDay(year, month);
      int daysInMonth = getNumberOfDaysInMonth(year, month);
         
      // Print blank spaces
      for (int i = 0; i < startDay; i++) {
         System.out.print("     ");
      }
      
      // Print calendar body
      for (int i = startDay; i <= (daysInMonth + startDay); i++) {
      
         if ((i - startDay) == 0) {
            continue;
         }
         
         if ((i % 7) == 0) {
            System.out.printf("%5d\n", (i - startDay));
         } else {
            System.out.printf("%5d", (i - startDay));
         }
         
      }
      
      System.out.println();
      
   }
   
   // Returns month as a String
   private static String getMonthName(int month) {
      
      String monthWord = " ";
      
      switch (month) {
         case 1: monthWord = "January"; break;
         case 2: monthWord = "February"; break;
         case 3: monthWord = "March"; break;
         case 4: monthWord = "April"; break;
         case 5: monthWord = "May"; break;
         case 6: monthWord = "June"; break;
         case 7: monthWord = "July"; break;
         case 8: monthWord = "August"; break;
         case 9: monthWord = "September"; break;
         case 10: monthWord = "October"; break;
         case 11: monthWord = "November"; break;
         case 12: monthWord = "December"; break;
      }
      
      return monthWord;
   }
   
   // Returns which day of the week the month starts on
   private static int getStartDay(int year, int month) {
      
      // January 1, 1800 was a Wednesday
      final int START_DAY_FOR_JAN_1_1800 = 3;
      
      int totalNumberOfDays = getTotalNumberOfDays(year, month);
      
      int startDay = (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
      
      return startDay;
   }
   
   // Returns total number of days since January 1, 1800
   private static int getTotalNumberOfDays(int year, int month) {
      
      int totalNumberOfDays = 0;
      
      // Add days from January 1, 1800 to January 1 of year
      for (int i = 1800; i < year; i++) {
         if (isLeapYear(i)) {
            totalNumberOfDays += 366;
         } else {
            totalNumberOfDays += 365;
         }
      }
      
      // Add days from January 1 of year to 1st of month
      for (int i = 1; i < month; i++) {
         totalNumberOfDays += getNumberOfDaysInMonth(year, i);
      }
      
      return totalNumberOfDays;
   }
   
   private static int getNumberOfDaysInMonth(int year, int month) {
      
      int numberOfDaysInMonth = 0;
      
      switch (month) {
         
         case 2:
            if (isLeapYear(year)) {
               numberOfDaysInMonth = 29;
            } else {
               numberOfDaysInMonth = 28;
            }
            break;
            
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            numberOfDaysInMonth = 31;
            break;
            
         case 4:
         case 6:
         case 9:
         case 11:
            numberOfDaysInMonth = 30;
            break;
            
      }
      
      return numberOfDaysInMonth;
   }
   
   // Returns true if year is a leap year, false otherwise
   private static Boolean isLeapYear(int year) {
      
      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
   }

}