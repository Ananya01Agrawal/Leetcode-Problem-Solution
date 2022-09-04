class Solution {
    public int numberOfWays(int sub, int enc, int k) {
        int b=Math.abs(sub-k);
        int[][] dp=new int[sub+b+k+1][k];
        for(int[] i:dp)Arrays.fill(i,-1);
        return f(sub,enc,k,dp,b);
    }
    
    public int f(int sub,int enc,int k,int[][] dp,int b){
        if(sub==enc && k==0)return 1;
        if(k==0 )return 0;
        k-=1;
        if(dp[sub+b][k]!=-1)return dp[sub+b][k];
        int left=f(sub-1,enc,k,dp,b);
        int right=f(sub+1,enc,k,dp,b);

        return dp[sub+b][k]=(left+right)%1000000007;
    }
}
