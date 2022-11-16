class Solution {
    public String reverseWords(String s) {

        s=s.trim();
        String []arr=s.split("\s+");   //regex- it will work on one or more spaces
        String ans=" ";    
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        ans=ans.trim();
        return ans;
    }
}
