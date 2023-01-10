class Solution {
    public int trailingZeroes(int n) {
        int nas=0;
        while(n>=5){
            n/=5;
            nas+=n;
        }
        return nas;

        
    }
}
