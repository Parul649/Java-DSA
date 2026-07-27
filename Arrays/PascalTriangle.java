/*
Problem: Pascal's Triangle

Platform: LeetCode

Approach:
1. Build Pascal's Triangle row by row.
2. First and last elements of each row are always 1.
3. Every middle element is the sum of the two elements above it from the previous row.

Time Complexity: O(numRows²)
Space Complexity: O(numRows²)
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                    row.add(num);
                }
            }

            pascalTriangle.add(row);

        }
        return pascalTriangle;
    }
}