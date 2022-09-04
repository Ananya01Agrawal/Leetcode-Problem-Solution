class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int result = 1; 
        int j = 1, i = 0; 
        while(j<n){ 
            int d = 32; 
            boolean y = true; 
            for(int k=j-1;k>=i && d>=0; k--){ 
                if((nums[j] & nums[k] )!=0){ 
                    y = false; 
                    break; 
                } 
                d--; 
            } 
            if(y){ 
                result = Math.max(result,j-i+1); 
                j++; 
            }else{ 
                i++; 
            } 
        } 
        return result; 
    }
}
