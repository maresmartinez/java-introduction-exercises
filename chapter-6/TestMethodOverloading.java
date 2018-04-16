public class TestMethodOverloading {
   
   public static void main(String[] args) {
      
      // Invoke max() with 2 int values
      System.out.println("The greater of 3 and 4 is " + max(3, 4));
      
      // Invoke max() with 2 double values
      System.out.println("The greater of 3.5 and 4.5 is " + max(3.5, 4.5));
      
      // Invoke max() with 3 double values
      System.out.println("The greater of 3.5, 4.5, and 5.5 is " + max(3.5, 4.5, 5.5));
      
   }
   
   // Returns greatest of 2 int numbers
   private static int max(int num1, int num2) {
      
      // Assigns the higher value to max
      int max = (num1 > num2) ? num1 : num2;
      
      return max; 
      
   }
   
   // Returns greatest of 2 double numbers
   private static double max(double num1, double num2) {
      
      // Assigns the higher value to max
      double max = (num1 > num2) ? num1 : num2;
      
      return max;
      
   }
   
   // Returns greatest of 3 double numbers
   private static double max(double num1, double num2, double num3) {
      
      double max = max(max(num1, num2), num3);
      
      return max; 
      
   }
   
}