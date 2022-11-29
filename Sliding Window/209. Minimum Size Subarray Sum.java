class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int result=Integer.MAX_VALUE;
        int left=0;//initialising the left index as zero
        int sum=0;//initialising the sum as zero
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                // now if you want to condense your window to find the minimum
                //window as the probelm wants
                result=Math.min(result,i+1-left);//update the result
                sum-=nums[left];// this moves your left step by one condensing               
                //your window,decreasing the sum to make sure that it's still valid

                left++;
            }
        }
        return (result!=Integer.MAX_VALUE?result:0);
        
    }
}
