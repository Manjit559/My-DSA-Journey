import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};

        // Create a map to store frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}
