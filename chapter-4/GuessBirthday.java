import java.util.Scanner;

public class GuessBirthday {

   public static void main(String[] args) {
      
      // Create a Scanner
      Scanner input = new Scanner(System.in);
      
      // Declare Sets
      String set1 = "1    3    5    7\n"
                  + "9    11   13   15\n"
                  + "17   19   21   23\n"
                  + "25   27   29   31\n";
      
      String set2 = "2    3    6    7\n"
                  + "10   11   14   15\n"
                  + "18   19   22   23\n"
                  + "26   27   30   31\n";
      
      String set3 = "4    5    6    7\n"
                  + "12   13   14   15\n"
                  + "20   21   22   23\n"
                  + "28   29   30   31\n";
      
      String set4 = "8    9    10   11\n"
                  + "12   13   14   15\n"
                  + "24   25   26   27\n"
                  + "28   29   30   31\n";
      
      String set5 = "16   17   28   19\n"
                  + "20   21   22   23\n"
                  + "24   25   26   27\n"
                  + "28   29   30   31\n";
   
      // Ask the user if their birthday is in each set
      int birthday = 0;
      
      System.out.printf("Set 1: \n%sIs your birthday in this set (Y/N)?:\n", set1);
      if (input.nextLine().equals("Y")) {
         birthday += 1;
      }
      
      System.out.printf("Set 2: \n%sIs your birthday in this set (Y/N)?:\n", set2);
      if (input.nextLine().equals("Y")) {
         birthday += 2;
      }
      
      System.out.printf("Set 3: \n%sIs your birthday in this set (Y/N)?:\n", set3);
      if (input.nextLine().equals("Y")) {
         birthday += 4;
      }
      
      System.out.printf("Set 4: \n%sIs your birthday in this set (Y/N)?:\n", set4);
      if (input.nextLine().equals("Y")) {
         birthday += 8;
      }
      
      System.out.printf("Set 5: \n%sIs your birthday in this set (Y/N)?:\n", set5);
      if (input.nextLine().equals("Y")) {
         birthday += 16;
      }
      
      // Display the user's birthday
      System.out.printf("Your birthday is: %d\n", birthday);
      
   }

}