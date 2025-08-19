
public class MajorityElement {
    public static int findMajority(int[] nums) {
        int cand = 0, count = 0;

        for (int n : nums) {
            if (count == 0) cand = n;
            count += (n == cand) ? 1 : -1;
        }


        count = 0;
        for (int n : nums) if (n == cand) count++;

        return (count > nums.length / 2) ? cand : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}
