import java.util.LinkedHashSet;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // LinkedHashSet for maintaining order + uniqueness
        LinkedHashSet<String> trainSet = new LinkedHashSet<>();

        // Adding elements (including duplicates)
        trainSet.add("Engine");
        trainSet.add("Sleeper");
        trainSet.add("Cargo");
        trainSet.add("Guard");
        trainSet.add("Sleeper"); // duplicate
        trainSet.add("Engine");  // duplicate

        System.out.println("Final Train Formation:");
        System.out.println(trainSet);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet, Preserves Insertion order and removes duplicates automatically.");

        System.out.println("\nUCS formation setup completed.....");
    }
}