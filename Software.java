public class Software{


public static void main(String[] args) 
  {
        System.out.println(generateGreeting());
  }
   
  // Function to generate a greeting based on the time of day
    public static String generateGreeting() 
  {
        // Get the current hour
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);

        // Determine the time of day and generate a greeting
        if (hour < 12) {
            return "Good morning!";
        } else if (hour < 18) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
   }
}
