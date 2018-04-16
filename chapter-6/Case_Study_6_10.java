public class Case_Study_6_10 {

   public static void main(String[] args) {
   
      final int NUMBER_OF_CHARS = 175;
      final int CHARS_PER_LINE = 25;
      
      // Print a set number of chars with a predetermined amount per line
      for (int i = 0; i < NUMBER_OF_CHARS; i++) {
      
         // Generate random char
         char randomChar = getRandomChar();
         
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
   
   // Generates a random char between ch1 and ch2
   public static char getRandomChar(char ch1, char ch2) {
   
      char randomChar = (char)((Math.random() * (ch2 - ch1 + 1)) + ch1);
      
      return randomChar;
   
   }
   
   // Generates a random lowercase letter char
   public static char getRandomLowerCaseChar() {
   
      return getRandomChar('a', 'z');
   
   }
   
   // Generates a random uppercase letter char
   public static char getRandomUpperCaseChar() {
   
      return getRandomChar('A', 'Z');
   
   }
   
   // Generates a random digit
   public static char getRandomDigit() {
   
      return getRandomChar('0', '9');
   
   }
   
   // Generates a random character
   public static char getRandomChar() {
   
      return getRandomChar('\u0000', '\uFFFF');
   
   }

}