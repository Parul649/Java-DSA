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
    public double myPow(double x, int n) {

        long N = n;
        return power(x, N);
    }

    private double power(double x, long n) {

        if (n == 0)
            return 1;

        if (n < 0)
            return 1 / power(x, -n);

        double temp = power(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;

        return x * temp * temp;
    }
}