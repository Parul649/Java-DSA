/*
Problem: Next Permutation

Platform: LeetCode

Approach:
1. Find the first decreasing element from the right (breakpoint).
2. Find the next greater element and swap it with the breakpoint.
3. Reverse the remaining suffix to get the smallest possible order.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(nums, 0, n - 1);
        } else {
            for (int j = n - 1; j > breakPoint; j--) {
                if (nums[j] > nums[breakPoint]) {
                    int temp = nums[breakPoint];
                    nums[breakPoint] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }

            reverse(nums, breakPoint + 1, n - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
