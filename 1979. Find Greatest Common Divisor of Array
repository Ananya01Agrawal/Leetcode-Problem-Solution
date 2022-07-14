class Solution {
    public int findGCD(int[] nums) {
        int smallest=nums[0];
        int largest=nums[nums.length-1];
        int gcd=1;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i])
                smallest=nums[i];
            
            if(largest<nums[i])
                largest=nums[i];
        }
        if(largest%smallest==0)
            return smallest;
        
        for(int i=1;i<smallest;i++){
            if(largest%i==0 && smallest%i==0)
                gcd=i;
        }
        return gcd;
    }
    
}
