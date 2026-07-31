/*
Problem: Best Time to Buy and Sell Stock

Platform: LeetCode

Approach:
1. Traverse the prices from left to right.
2. Keep track of the minimum price seen so far.
3. Calculate the profit if the stock is sold at the current price.
4. Update the maximum profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(price, minPrice);
            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}