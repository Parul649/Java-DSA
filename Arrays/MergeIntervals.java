/*
Problem: Merge Intervals

Platform: LeetCode

Approach:
1. Sort the intervals by their starting values.
2. Add the first interval to the result.
3. Compare each interval with the last merged interval.
4. If they overlap, update the ending value.
5. Otherwise, add the current interval to the result.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] current = intervals[i];
            int[] lastMerged = result.get(result.size()-1);
            if(current[0]<=lastMerged[1]){
              lastMerged[1] = Math.max(lastMerged[1], current[1]);
            }
            else{
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}