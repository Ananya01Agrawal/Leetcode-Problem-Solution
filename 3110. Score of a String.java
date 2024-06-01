class Solution {
    public int scoreOfString(String s) {
        //initialise the count as zero
        int anan=0;
        for(int i=1;i<s.length();i++){
            anan+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return anan;
    }
}
