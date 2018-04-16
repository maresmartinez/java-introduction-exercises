public class ArrayPractice {

   public static void main(String[] args) {
   
      double[] myList;
      
      // This creates an array using new elementType[arraySize]
      // And assigns the reference of the newly created array to the variable doubleArray
      myList = new double[10];
      
      /*
       * Can also declare an array variable and create an array in one line:
       *    elementType[] arrayRefVar = new elementType[arraySize];
       *    e.g. double[] myList = new double[10];
       */
      
      // Assign values to the elements
      for (int i = 0; i < 10; i++) {
      
         myList[i] = i;
         System.out.println("i[" + i + "] = " + i);
         
      }
      
      // Returns size of array
      System.out.println("myList.length = " + myList.length);
      
      // Array initializer (note no need for "new")
      // Combines declaration, creation, and initialization into one statement
      double[] myList2 = {1, 2, 3, 4, 5};
      /*
       * Equivalent to:
       * double[] myList = new double[4];
       * myList[0] = 1;
       * myList[1] = 2;
       * myList[2] = 3;
       * myList[3] = 4;
       * myList[4] = 5;
       * 
       * Note that the following is a syntax error:
       * double[] myList2;
       * myList2 = {1, 2, 3, 4, 5};
       *    you need to declare, create, and initialize in ONE statement
       * 
       */
      
      // Foreach loops
      System.out.println("Foreach Loop:");
      for (double e: myList) {
         System.out.println(e);
      }
      /* Syntax:
       * for (elementType element: arrayRefVar) {
       *    // process the element
       * }
       * 
       */
      
   }

}