class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length; // calculating the length of the array
        if(n==1){// if length if the array is 1 
            return nums[0];// returtn the same elemnt
        }
        int new_arr[] =new int[n/2];// creating the new array
        for(int i=0;i<new_arr.length;i++){
            new_arr[i]=i%2==0 ? Math.min(nums[2 * i], nums[2 * i + 1]): Math.max(nums[2 * i], nums[2 * i + 1]);
        }
        return minMaxGame(new_arr);
        
    }
}
