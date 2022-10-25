class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // # world your life
      String Kushagra="";
            String name="";
            for(int i=0;i<word1.length;i++){
                    Kushagra = Kushagra + word1[i];
            }
            for(int j=0;j<word2.length;j++){
                    name = name + word2[j];
            }
            return Kushagra.equals(name);  
    }
}
