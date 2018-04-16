public class CaseStudy_DeckOfCards {

   public static void main(String[] args) {
   
      // Declare an array for the deck of cards
      int[] deck = new int[52];
      
      // Populate the deck with numbers 1 to 52
      for (int i = 0; i < deck.length; i++) {
         deck[i] = i + 1;
      }
      
      // Shuffle the deck
      for (int i = (deck.length - 1); i > 0; i--) {
         
         // Randomly generate an index j, where 0 <= j <= 52
         int j = (int)(Math.random() * (i + 1));
         
         // Swap index j with index i
         int temp = deck[i];
         deck[i] = deck[j];
         deck[j] = temp;
         
      }
      
      // Draw the first 4 cards
      System.out.println("Here are the first four cards in a shuffled deck of cards: \n"
                        + getCard(deck[0]) + " (" + deck[0] + ")\n"
                        + getCard(deck[1]) + " (" + deck[1] + ")\n"
                        + getCard(deck[2]) + " (" + deck[2] + ")\n"
                        + getCard(deck[3]) + " (" + deck[3] + ")\n");
   
   }
   
   private static String getCard(int card) {
   
      String cardName = getFace(card) + " of " + getSuit(card);
      
      return cardName;
      
   }
   
   private static String getSuit(int card) {
   
      String suit = " ";
      
      if (card < 13) {
         suit = "Spades";
      } else if (card < 26) {
         suit = "Hearts";
      } else if (card < 39) {
         suit = "Diamonds";
      } else {
         suit = "Clubs";
      }
      
      return suit;
      
   }
   
   private static String getFace(int card) {
   
      int cardNumber = card % 13;
      String cardName = "";
      
      if (cardNumber == 0) {
         cardName = "Ace";
      } else if (cardNumber == 10) {
         cardName = "Jack";
      } else if (cardNumber == 11) {
         cardName = "Queen";
      } else if (cardNumber == 12) {
         cardName = "King";
      } else {
         cardName = (cardNumber + 1) + "";
      }
      
      return cardName;
      
   }

}