class Solution {
    public char repeatedCharacter(String s) {
        for(int i=1;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
        
    }
}
