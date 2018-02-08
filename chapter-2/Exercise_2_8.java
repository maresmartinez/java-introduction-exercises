import java.util.Scanner;

public class Exercise_2_8 {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the time zone offset to GMT: ");
      int timeZoneOffset = input.nextInt();
      
      // obtain the current UNIX Epoch: Midnight Jan. 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
      
      // obtain the total seconds
      // remember that you're working with integers - so there are no decimal places
      long totalSeconds = totalMilliseconds / 1000;
      
      // compute the current second
      long currentSecond = totalSeconds % 60;
      
      // obtain the total minutes
      long totalMinutes = totalSeconds / 60;
      
      // compute the current minute
      long currentMinute = totalMinutes % 60;
      
      // obtain the total hours
      long totalHours = totalMinutes / 60;
      
      // compute the current hour
      long currentHour = (totalHours % 24) + 24 + timeZoneOffset;
         
      // display time
         
      System.out.println("The current time is " + currentHour + ":"
                            + currentMinute + ":" + currentSecond);
   
   }

}