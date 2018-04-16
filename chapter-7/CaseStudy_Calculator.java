public class CaseStudy_Calculator {

   public static void main(String[] args) {
   
      // Validate the user's entry
      if (args.length != 3) {
         System.out.println("Usage: java CaseStudy_Calculator operand1 operator operand2");
         System.exit(0);
      }
      
      // Store user's entry in appropriate variables
      int number1 = Integer.parseInt(args[0]);
      int number2 = Integer.parseInt(args[2]);
      String operator = args[1];
      
      // Perform the arithmetic operation based on the user's operator
      int result = 0;
      
      switch (operator) {
      
         case "+": 
            result = number1 + number2;
            break;
            
         case "-":
            result = number1 - number2;
            break;
            
         case "/":
            result = number1 / number2;
            break;
         
         case ".":
            result = number1 * number2;
            operator = "*"; // change multiplication symbol for output
            break;
      
      }
      
      // Display result to user
      String outputResult = "%d %s %d = %d\n";
      System.out.printf(outputResult, number1, operator, number2, result);
   
   }

}