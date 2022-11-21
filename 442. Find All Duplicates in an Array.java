class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      // ArrayList to store duplicate values 
      ArrayList<Integer> ans=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          int idx=Math.abs(nums[i])-1;
          // if indexed element is negative meance that idx+1 element occured priviusy  ans this is second time so add indexex+1 element in List
          if(nums[idx]<0) ans.add(idx+1);
          // id element occured in array then it set it to -ve
          nums[idx]*=-1;
      }
      return ans;
  }
}
