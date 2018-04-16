public class TestCircleWithStaticMembers {

   public static void main(String[] args) {
   
      System.out.println("Before creating objects, the number of Circle objects is " + Circle.numberOfObjects);
      
      // Create circle1
      Circle circle1 = new Circle();
      
      // Display circle1 before circle2 is created
      System.out.println("After creating circle1, the number of circle objects is " + Circle.numberOfObjects);
      
      // Create circle2
      Circle circle2 = new Circle(5);
      
      // Display after circle1 and circle2 were created
      System.out.println("After creating circle1, the number of circle objects is " + circle2.numberOfObjects);
      System.out.println("After creating circle1, the number of circle objects is " + circle1.numberOfObjects);
      
   }

}