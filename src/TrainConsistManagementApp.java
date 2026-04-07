import java.util.LinkedHashMap;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // LinkedHashMap to store bogie and capacity
        LinkedHashMap<String, Integer> bogieMap = new LinkedHashMap<>();

        // Adding bogie capacity details
        bogieMap.put("First Class", 24);
        bogieMap.put("Cargo", 120);
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);

        System.out.println("Bogi Capacity Details:");

        // Printing each entry
        for (String key : bogieMap.keySet()) {
            System.out.println(key + " -> " + bogieMap.get(key));
        }

        System.out.println("\nUC6 bogie mapping Completed");
    }
}