import java.util.*;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        int ans = 0;
        for (int k : map.keySet())
            if (map.containsKey(k + 1))
                ans = Math.max(ans, map.get(k) + map.get(k + 1));
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = s.findLHS(nums);
        System.out.println("Longest Harmonious Subsequence length: " + result);
    }
}
