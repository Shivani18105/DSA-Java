package Hashmaps;

import java.util.HashMap;

public class countNicePairs {
    public static void main(String[] args) {
        int[] nums = {42, 11, 1, 97};
        Solution obj = new Solution();
        int ans = obj.countNicePairs(nums);
        System.out.println("Nice Pairs = " + ans);
    }
}
class Solution {
    public int countNicePairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        int MOD = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = nums[i] - rev(nums[i]);
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                count = (count + freq) % MOD;
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }
        return count;
    }

    public int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
}
