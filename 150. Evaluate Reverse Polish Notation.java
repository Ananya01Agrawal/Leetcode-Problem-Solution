class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();//creating a stack
        for(String token:tokens){
            if("*".equals(token)||"-".equals(token)||"+".equals(token)||"/".equals(token)){
                int num1=st.pop();
                int num2=st.pop();
                st.push(calculate(num1,num2,token));
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
    private int calculate(int num1,int num2,String token){
        int ans=0;
        if("+".equals(token)){
            ans=num2+num1;
        }
        if("*".equals(token)){
            ans=num2*num1;
        }
        if("/".equals(token)){
            ans=num2/num1;
        }
        if("-".equals(token)){
            ans=num2-num1;
        }
        return ans;

    }
}
        
