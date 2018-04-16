public class PracticeVarArgs {

   public static void main(String[] args) {
   
      int[] myList1 = new int[5];
      int[] myList2 = new int[10];
      
      initializeArray(myList1, 2);
      initializeArray(myList2);
      
      printMax(myList1);
      printMax(myList2);
      printMax(7, 8, 24, 56, 12, 46);
      printMax(7, 8, 24, 56.3, 12.6, 46.3);
   
   }
   
   /* private method to initialize array with values starting from 0 to array length */
   private static void initializeArray(int[] myList) {
      for (int i = 0; i < myList.length; i++) {
         myList[i] = i;
      }
   }
   
   /* private method to initialize array with values starting from num1 */
   private static void initializeArray(int[] myList, int num1) {
      for (int i = 0, j = num1; i < myList.length; i++, j++) {
         myList[i] = j;
      }
   }
   
   /* private method to initialize array with values starting from num1 and ending at num2
    *   if num2 is reached before end of array, the rest of the array is not initialized
    */
   private static void initializeArray(int[] myList, int num1, int num2) {
      for (int i = num1; i < num2; i++) {
         myList[i] = i;
      }
   }
   
   /* private method to display values in array */
   private static void displayArray(int[] myList) {
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i]);
      }
   }
   
   /* private method that prints the max value in the input array */
   public static void printMax(int... myList) {
      int maxValue = 0;
      for (int i = 0; i < myList.length; i++) {
         if (myList[i] > maxValue) {
            maxValue = myList[i];
         }
      }
      System.out.println("The max value is " + maxValue + ".");
   }
   
   /* private method that prints the max value in the input array */
   public static void printMax(double... myList) {
      double maxValue = 0;
      for (int i = 0; i < myList.length; i++) {
         if (myList[i] > maxValue) {
            maxValue = myList[i];
         }
      }
      System.out.println("The max value is " + maxValue + ".");
   }

}