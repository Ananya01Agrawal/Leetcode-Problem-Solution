class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele: nums){
            if(set.contains(ele)){
                set.remove(ele);
            }
            else{
                set.add(ele);
            }
        }
            
    int[] res=new int[2];
    int i=0;
    for(int x: set){
        res[i++]=x;
    }
    return res;
        
    }
}
