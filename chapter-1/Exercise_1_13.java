public class Exercise_1_13 {

   public static void main(String[] args) {
   
      double x;
      double y;
      
      // Use Cramer's rule to solve the equation
      
      // ax + by = e, where a = 3.4, b = 50.2, e = 44.5
      // cx + dy = f, where c = 2.1, d = 0.55, f = 5.9
      
      // x = (e * d - b * f) / (a * d - b * c)
      // y = (a * f - e * c) / (a * d - b * c)
      
      x = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1);
      y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1);
      
      System.out.println("x = " + x + " and y = " + y);
   
   }

}