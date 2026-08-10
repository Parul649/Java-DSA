/*
Problem: Search a 2D Matrix

Platform: LeetCode

Approach:
1. Traverse each row of the matrix.
2. Perform binary search on each row.
3. Return true if the target is found.

Time Complexity: O(m log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            int start = 0;
            int last = matrix[i].length - 1;

            while (start <= last) {

                int mid = start + (last - start) / 2;

                if (matrix[i][mid] < target) {
                    start = mid + 1;
                } else if (matrix[i][mid] > target) {
                    last = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}