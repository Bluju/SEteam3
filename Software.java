public class Software{


  public static void main(String[] args){

    waste_time(10);

  }

  /**
   * Wastes the user's time and prints a friendly message.
   *
   * @param seconds The number of seconds to waste.
   * @author irosinsk-pnw
   */
  public static void waste_time(int seconds)
  {
    System.out.println("Thank you for choosing to waste your time with me.");
    try
    {
      for (int i = 0; i < seconds; i++)
      {
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
      }
      System.out.println("\nI hope this has been a good waste of time.");
    }
    catch (InterruptedException e)
    {
      System.out.println("Someone has interrupted our time-wasting! How rude!");
    }
  }
}
