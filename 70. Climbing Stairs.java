class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n];
        if(n==1||n==2||n==3){
            return n;
        }
        else{
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
            for(int i=3;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[n-1];
        
    }
}
