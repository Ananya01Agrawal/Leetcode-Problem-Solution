class Solution {
    public String reverseStr(String str, int k) {
    char[] s = str.toCharArray();
    for(int i = 0; i < str.length()-1; i += 2 * k) {
        int start=i;
        int end=Math.min(i+k-1,str.length()-1);
        while(start<end){
            char temp=s[start];
            s[start++]=s[end];
            s[end--]=temp;
        }
    }
    return new String(s);
    }
}
