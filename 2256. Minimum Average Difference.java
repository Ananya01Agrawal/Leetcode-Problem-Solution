class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        long[] sum = new long[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = nums[i] + sum[i-1];
        }    
        
        long min = Long.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            long l = sum[i];
            long r = sum[n-1]-sum[i];
            long abs = i == n-1 ? l/(i+1) : Math.abs(l/(i+1) - r/(n-i-1));
            if (min > abs) {
                index = i;
                min = abs;
            }
        }
        return index;
    }
}
