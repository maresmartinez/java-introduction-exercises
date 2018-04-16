import java.util.Scanner;

public class MultiplicationTable {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("How many numbers do you want to multiply?");
      int numOfCols = input.nextInt();
      
      System.out.println("MULTIPLICATION TABLE:");
      
      System.out.print("  ");
      for (int header = 1; header <= numOfCols ; header++) {
         System.out.printf("%6d", header);
      }
      
      System.out.println("\n---------------------------------------");
      
      for(int columnNumber = 1; columnNumber <= numOfCols ; columnNumber++) {
         
         System.out.print(columnNumber + "|");
         
         for (int multiplied = 1; multiplied <= numOfCols; multiplied++) {
         
            System.out.printf("%6d", (columnNumber * multiplied));
         
         }
         
         System.out.println();
      
      }
      
   }

}