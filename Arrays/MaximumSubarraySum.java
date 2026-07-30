/*
Problem: Maximum Subarray

Platform: LeetCode

Approach:
Use Kadane's Algorithm.
For each element, decide whether to:
1. Extend the current subarray, or
2. Start a new subarray from the current element.

Track the maximum sum found so far.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int LargeSum = nums[0];
        for(int i=1; i<n; i++){
            currSum = Math.max(nums[i]+currSum, nums[i]);
            LargeSum = Math.max(LargeSum, currSum);
        }
        return LargeSum;
    }
}