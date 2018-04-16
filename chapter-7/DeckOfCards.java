public class DeckOfCards {

   public static void main(String[] args) {
   
      int[] deck = new int[52];
      String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
      String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
      
      // Initialize the deck
      for (int i = 0; i < deck.length; i++) {
         deck[i] = i;
      }
      
      // Shuffle the deck
      for (int i = 0; i < deck.length; i++) {
         // Generate a random index j, where 0 <= j <= i
         int j = (int)(Math.random() * deck.length);
         
         // Swap value of index j with that of i
         int temp = deck[i];
         deck[i] = deck[j];
         deck[j] = temp;
      }
      
      // Display the first four cards
      for (int i = 0; i < 4; i++) {
         String suit = suits[deck[i] / 13];
         String rank = ranks[deck[i] % 13];
            
         System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
      }
      
      /*
      String card1 = ranks[deck[0] % 13] + " of " + suits[deck[0] / 13] + "(" + deck[0] + ")";
      String card2 = ranks[deck[1] % 13] + " of " + suits[deck[1] / 13] + "(" + deck[1] + ")";
      String card3 = ranks[deck[2] % 13] + " of " + suits[deck[2] / 13] + "(" + deck[2] + ")";
      String card4 = ranks[deck[3] % 13] + " of " + suits[deck[3] / 13] + "(" + deck[3] + ")";
      
      String cardOutput = "The first four cards in a shuffled deck are:\n%s\n%s\n%s\n%s\n";
      System.out.printf(cardOutput, card1, card2, card3, card4);
      */
         
   }

}