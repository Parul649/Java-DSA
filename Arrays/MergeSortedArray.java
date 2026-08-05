/*
Problem: Merge Sorted Array

Platform: LeetCode

Approach:
1. Copy all elements of nums2 into the unused positions of nums1.
2. Sort the complete nums1 array.

Time Complexity: O((m + n) log(m + n))
Space Complexity: O(1) auxiliary space
*/

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i=m; i<(m+n); i++){
                nums1[i] = nums2[index++];
        }
        Arrays.sort(nums1);
    }
}