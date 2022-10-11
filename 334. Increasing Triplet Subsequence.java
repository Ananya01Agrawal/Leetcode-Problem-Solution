class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int k=nums.length;

        for(int i = 0; i < k; i ++) {
            int z = nums[i];

            if (a >= z) {
                a = z;
            } else if (b>=z) {
                b = z;
            } else {
                return true;
            }
        }

        return false;
        
    }
}
