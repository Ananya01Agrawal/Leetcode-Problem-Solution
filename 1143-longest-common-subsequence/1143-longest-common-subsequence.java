class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] str1=text1.toCharArray();// converting the string 1 char aarray
        char[] str2=text2.toCharArray();//converting the string 2 to char array
        int temp[][]=new int[str1.length +1][str2.length+1];//initialising the 2 d array
        int max=0;// declaration of the max
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[i].length;j++){
                if(str1[i-1]==str2[j-1]){
                    temp[i][j]=temp[i-1][j-1]+1;
                }
                else{
                    temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j]>max){
                    max=temp[i][j];
                }
            }
        }
        return max;  
    }
}