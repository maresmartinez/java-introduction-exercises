public class TestTV {

   public static void main(String[] args) {
   
      TV tv1 = new TV();
      tv1.turnOn();
      tv1.setChannel(30);
      tv1.setVolume(3);
      
      TV tv2 = new TV();
      tv2.turnOn();
      tv2.channelUp();
      tv2.channelUp();
      tv2.volumeUp();
      
      String formatTV = "tv%d's channel is %d and the volume level is %d.\n";
      
      System.out.printf(formatTV, 1, tv1.channel, tv1.volumeLevel);
      System.out.printf(formatTV, 2, tv2.channel, tv2.volumeLevel);
   
   }
   
}