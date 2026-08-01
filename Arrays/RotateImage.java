/*
Problem: Rotate Image

Platform: LeetCode

Approach:
1. Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
2. Reverse every row.
3. The resulting matrix is rotated 90 degrees clockwise.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}