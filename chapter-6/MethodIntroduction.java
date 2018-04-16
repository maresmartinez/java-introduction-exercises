public class MethodIntroduction {

   public static void main(String[] args) {
   
      int sum1to10 = sum(1, 10);
      System.out.println("Sum from 1 to 10 is " + sum1to10);
      
      int sum20to37 = sum(20, 37);
      System.out.println("Sum from 20 to 37 is " + sum20to37);
      
      int sum35to49 = sum(35, 49);
      System.out.println("Sum from 35 to 49 is " + sum35to49);
   
   }
   
   private static int sum(int startNum, int endNum) {
   
      int sum = 0;
      
      for (int i = startNum; i <= endNum; i++) {
         sum += i;
      }
         
      return sum;
   
   }

}