class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            res+=nums[i];
        }
        return res;
        
    }
}
