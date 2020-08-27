

//https://leetcode.com/problems/find-right-interval/
//436. Find Right Interval

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        if (n == 1)
            return new int[]{-1};
        
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            Integer key = map.ceilingKey(intervals[i][1]);
            result[i] = key == null ? -1 : map.get(key);
        }

        return result;
    }
}