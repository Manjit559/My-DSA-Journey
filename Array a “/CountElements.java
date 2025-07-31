public class CountElements {
    public static void main(String[] args) {
        int[] arr = {3, -1, 0, 5, -2, 0, 8, -7}; // Sample input

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero elements: " + zeros);
    }
}
