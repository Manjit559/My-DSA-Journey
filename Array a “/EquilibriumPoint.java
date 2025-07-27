public class EquilibriumPoint {
    static int equilibriumPoint(long arr[], int n) {
        long total = 0, leftSum = 0;
        for (long val : arr) total += val;

        for (int i = 0; i < n; i++) {
            total -= arr[i]; // total becomes right sum
            if (leftSum == total) return i + 1; // 1-based index
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 2, 2};
        System.out.println(equilibriumPoint(arr, arr.length)); // Output: 3
    }
}
