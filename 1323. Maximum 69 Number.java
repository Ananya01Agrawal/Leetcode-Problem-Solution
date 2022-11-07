class Solution {
    public int maximum69Number (int num) {
        int noOfDigitsOnLeft = -1;
        int res = num;
        int count = 0;
        while(num > 0){
            if(num%10 == 6) noOfDigitsOnLeft = count;
            count++;
            num /= 10; 
        }
        if(noOfDigitsOnLeft == -1) return res;
        return res + (3 * (int)(Math.pow(10,noOfDigitsOnLeft))); 
    }
}
