import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class TrainConsistManagementApp{
    public static void main(String[] args) {

        // HashSet to store unique Bogie IDs
        HashSet<String> bogieSet = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieSet.add("BG101");
        bogieSet.add("BG102");
        bogieSet.add("BG103");
        bogieSet.add("BG104");
        bogieSet.add("BG102"); // duplicate
        bogieSet.add("BG101"); // duplicate

        // Convert to list for ordering (reverse)
        ArrayList<String> bogieList = new ArrayList<>(bogieSet);
        Collections.sort(bogieList, Collections.reverseOrder());

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieList);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored HashSet.");

        System.out.println("\nUC3 uniqueness validation completed");
    }
}