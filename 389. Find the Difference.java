class Solution {
    public char findTheDifference(String s, String t) {
        /* logic which we are using 
        s="abcde" t="abcde"
        a b c d a b c d e
        a^ b^ c^ d^ a^ b^ c^ d^ e
        (a^a) (b^b) (c^c) (d^d) e
        0 0 0 0 ^e
        e */
        char c=0;
        for(int i=0;i<s.length();++i){
            c^=s.charAt(i);
        }
        for(int i=0;i<t.length();++i){
            c^=t.charAt(i);
        }
        return c;
        
    }
}
