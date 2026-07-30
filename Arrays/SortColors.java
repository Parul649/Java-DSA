/*
Problem: Sort Colors

Platform: LeetCode

Approach:
1. Count the occurrences of 0, 1, and 2.
2. Fill the array with all 0s, followed by all 1s and then all 2s.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        while (count0 > 0) {
            nums[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            nums[index++] = 1;
            count1--;
        }
        while (count2 > 0) {
            nums[index++] = 2;
            count2--;
        }

    }
}