public class Software {
    
  public static void main (String[] args) {
      hello();
  }
      public static void hello() {
      try {

      System.out.println("Don't Believe Me? Here I'll put you on:");
      Thread.sleep(1000);
      System.out.println("Hellooo!");
      Thread.sleep(1000);
      System.out.println("That's you! That's how dumb you sound.");
      }
      catch (InterruptedException e) {

      }
  }
}