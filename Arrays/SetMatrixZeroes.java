/*
Problem: Set Matrix Zeroes

Platform: LeetCode

Approach:
1. Traverse the matrix and mark all rows and columns containing a zero.
2. Traverse the matrix again.
3. Set a cell to zero if its row or column was marked.

Time Complexity: O(m × n)
Space Complexity: O(m + n)
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n]; 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}