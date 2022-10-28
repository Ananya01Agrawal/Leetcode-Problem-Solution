class Solution {
    public int countAsterisks(String s) {
        int pair=0, count=0;
        for(int c: s.toCharArray()){
            if(c == '|')    pair++;
            if(pair % 2 == 0 && c == '*')    count++;
        }
        return count;
    }
}
