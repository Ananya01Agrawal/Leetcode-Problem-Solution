class Solution {
    public int largestPerimeter(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--){
            int rar=nums[i+2];
            int slar=nums[i+1];
            int tlar=nums[i];
            if(tlar+slar>rar) {
                ans=rar+slar+tlar;
                break;              }
        }
        return ans;
    }
}
