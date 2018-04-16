public class TestRandomChar {
   
   public static void main(String[] args) {
      
      final int NUMBER_OF_CHARS = 175;
      final int CHARS_PER_LINE = 25;
      
      // Print a set number of chars with a predetermined amount per line
      for (int i = 0; i < NUMBER_OF_CHARS; i++) {
         
         // Generate random char
         char randomChar = Case_Study_6_10.getRandomLowerCaseChar();
         
         // Print char
         if ((i + 1) % CHARS_PER_LINE == 0) {
            // if max per line reached, print new line after printing char
            System.out.println(randomChar);
         } else {
            // if max chars per line not reached, simply print char
            System.out.print(randomChar);
         }
         
      }
      
   }
   
}