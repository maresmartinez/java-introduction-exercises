public class ProcessingArrays {

   public static void main(String[] args) {
   
      // Declare an array
      int[] intList = new int[10];
      
      // Populate the array
      for (int i = 0; i < 10; i++) {
      
         intList[i] = (int)(Math.random() * 100) + 1;
         System.out.print(intList[i] + " ");
         
      }
      
      
   
   }

}