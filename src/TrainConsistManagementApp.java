import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Initial elements
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist;");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();   // removes Engine
        train.removeLast();    // removes Guard

        // Adding Pantry Car (as shown in expected output)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter Removing First and last Bogie:");
        System.out.println(train);
    }
}