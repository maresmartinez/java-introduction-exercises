public class Exercise_3_4 {

   public static void main(String[] args) {
      
      int randomNumber = (int)(Math.random() * 12) + 1;
      String month = " ";
      
      if (randomNumber == 1)
         month = "January";
      else if (randomNumber == 2)
         month = "February";
      else if (randomNumber == 3)
         month = "March";
      else if (randomNumber == 4)
         month = "April";
      else if (randomNumber == 5)
         month = "May";
      else if (randomNumber == 6)
         month = "June";
      else if (randomNumber == 7)
         month = "July";
      else if (randomNumber == 8)
         month = "August";
      else if (randomNumber == 9)
         month = "September";
      else if (randomNumber == 10)
         month = "October";
      else if (randomNumber == 11)
         month = "November";
      else if (randomNumber == 12)
         month = "December";
      
      System.out.println("The random number is " + randomNumber
                        + ". \n This corresponds with the month "
                        + month + ".");
   
   }

}