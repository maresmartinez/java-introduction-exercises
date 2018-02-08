public class Exercise_3_24 {
   public static void main(String[] args) {
      
      // Generate rank
      int rankNumber = (int)(Math.random() * 13) + 1;
      String rankWord = " ";
      
      if (rankNumber == 1)
         rankWord = "Ace";
      else if (rankNumber == 11)
         rankWord = "Jack";
      else if (rankNumber == 12)
         rankWord = "Queen";
      else if (rankNumber == 13)
         rankWord = "King";
      
      // Generate suit
      int suitNumber = (int)(Math.random() * 4);
      String suitWord = " ";
      
      if (suitNumber == 0)
         suitWord = "Clubs";
      else if (suitNumber == 1)
         suitWord = "Diamonds";
      else if (suitNumber == 2)
         suitWord = "Hearts";
      else if (suitNumber == 3)
         suitWord = "Spades";

      // Display the card to the user
      if (rankWord == " ")
         System.out.println("The card you picked is " + rankNumber + " of " + suitWord);
      else 
         System.out.println("The card you picked is " + rankWord + " of " + suitWord);
      
   }
}