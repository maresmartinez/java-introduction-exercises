public class TestSimpleCircle {

   public static void main(String[] args) {
   
      String circleFormat = "The area of the circle of radius %.1f is %.2f\n";
      
      // Create a circle with radius 1
      Circle circle1 = new Circle();
      System.out.printf(circleFormat, circle1.radius, circle1.getArea());
      
      // Create a circle with radius 25
      Circle circle2 = new Circle(25);
      System.out.printf(circleFormat, circle2.radius, circle2.getArea());
      
      // Create a circle with radius 125
      Circle circle3 = new Circle(125);
      System.out.printf(circleFormat, circle3.radius, circle3.getArea());
      
      // Modify circle radius
      circle2.radius = 100; // or circle2.setRadius(100);
      System.out.printf(circleFormat, circle2.radius, circle2.getArea());
   
   }

}