class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;//initializing the count as zero
        for(char c: s.toCharArray()){// converting the string to the character
            if(c==letter){
                count++;
            }
        }
        // applying the formula for calculating teh pecentage
        return(100*count)/s.length();
        
    }
}
