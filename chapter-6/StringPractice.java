public class StringPractice {

   public static void main(String[] args) {
   
      nPrintln("Hello " + "World", 2);
   
   }
   
   private static void nPrintln(String message, int n) {
   
      for (int i = 0; i < n; i++) {
         System.out.println(message);
      }
   
   }

}