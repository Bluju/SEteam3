
public class Software{

public static void cubes(int n){
    for(int i=1;i<=n;i++){
       System.out.println((int)Math.pow(i,3));
 }

  void henryFunction(){
    system.out.println("Henry's branch");
  }

  public static void main(String[] args){
    julianFunc();
    waste_time(10);
    henryFunction();
    cubes(5);
  }
  public static void julianFunc(){
    System.out.println("This is Julian's Function!");
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
