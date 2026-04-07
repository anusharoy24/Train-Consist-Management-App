import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create list for Passenger Bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Adding Bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies");
        System.out.println("Passenger Bogies : " + bogies);

        // Removing 'AC Chair'
        bogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair' :");
        System.out.println("Passenger Bogies : " + bogies);

        // Checking if 'Sleeper' exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + bogies.contains("Sleeper"));

        // Final Output
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(bogies);

        System.out.println("\nUC2 operations completed successfully");
    }
}
