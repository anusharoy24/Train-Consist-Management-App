import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create map
        LinkedHashMap<String, Integer> bogieMap = new LinkedHashMap<>();
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);
        bogieMap.put("First Class", 24);
        bogieMap.put("General", 90);

        // Before Sorting
        System.out.println("Before Sorting");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 2: Convert to list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(bogieMap.entrySet());

        // Step 3: Sort by value
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());

        // After Sorting
        System.out.println("\nAfter Sorting By Capacity");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}