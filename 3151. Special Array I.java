class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
	
	for(int i=0; i<n-1; i++){
		boolean flag = nums[i]%2==0;
		boolean flag1 = nums[i+1]%2==0;
		if((flag^flag1) == false) return false;
	}

	return true;
    }
}
