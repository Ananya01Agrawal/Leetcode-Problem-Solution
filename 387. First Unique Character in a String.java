class Solution {
    public int firstUniqChar(String s) {
        int result=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++){
            int index=s.indexOf(c);
            if(index!=-1&& index==s.lastIndexOf(c)){
                result=Math.min(result,index);
            }
        }
        return result==Integer.MAX_VALUE?-1:result;
        
    }
}
