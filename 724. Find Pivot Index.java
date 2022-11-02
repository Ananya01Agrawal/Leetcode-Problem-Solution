class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;//calculating the length of the array
        int prefixSum=0;// calculatinge the total sum of the array
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
        }
        rightSum=prefixSum;//initializing the right sum as the prefix sum

        for(int i=0;i<n;i++){
            leftSum+=nums[i];
            if(leftSum==rightSum) return i;//checking that sum of both right sum and right sum are eual or not
            rightSum-=nums[i];
        }
        return -1;// if sum is not eual then retur  the -1
        
    }
}
