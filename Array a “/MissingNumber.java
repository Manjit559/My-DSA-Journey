public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return total - sum;
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();

        int[] nums = {3, 0, 1};  // Example input
        int result = obj.missingNumber(nums);

        System.out.println("Missing number is: " + result);
    }
}
