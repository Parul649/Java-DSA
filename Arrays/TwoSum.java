/*
Problem: Two Sum

Platform: LeetCode

Approach:
1. Create a HashMap to store previously visited numbers.
2. For each element, calculate its complement.
3. If the complement already exists in the map, return both indices.
4. Otherwise, store the current number and its index.

Time Complexity: O(n)

Space Complexity: O(n)
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                ans[0] = map.get(complement);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}