/*
Problem: Find the Duplicate Number

Platform: LeetCode

Approach:
1. Treat the array as a linked list.
2. Use Floyd's Tortoise and Hare algorithm to detect a cycle.
3. Reset one pointer to the beginning.
4. Move both pointers one step at a time until they meet.
5. The meeting point is the duplicate number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int slow2 = nums[0];

        while (slow != slow2) {

            slow = nums[slow];
            slow2 = nums[slow2];

        }
        return slow;
    }
}