class Circle {

   /* The radius of this circle */
   double radius;
   static int numberOfObjects = 0;
   
   /* Construct a circle object */
   Circle() {
      radius = 1;
      numberOfObjects++;
   }
   
   /* Construct a circle object */
   Circle(double newRadius) {
      radius = newRadius;
      numberOfObjects++;
   }
   
   static int getNumberOfObjects() {
      return numberOfObjects;
   }
   
   /* Return the area of this circle */
   double getArea() {
      return radius * radius * Math.PI;
   }
   
   /* Return the perimeter of this circle */
   double getPerimeter() {
      return 2 * radius * Math.PI;
   }
   
   /* Set new radius for this circle */
   void setRadius(double newRadius) {
      radius = newRadius;
   }

}