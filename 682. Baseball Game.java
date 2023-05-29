class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();// creating a new stack
        for(String s:ops){
            if(s.equals("C")){// if c is there simple pop the element
                st.pop();
                }
            else if(s.equals("D")){//"D" is encountered while traversing the string we push into stack 2*s.peek() element
                int temp=st.peek()*2;
                st.push(temp);
            }
            //"+" is encountered in the ops array we pop two element then add their sum and again push the popped items with their sum.
            else if(s.equals("+")){
                int temp1=st.pop();
                int temp2=st.pop();
                int sum=temp1+temp2;
                st.push(temp2);
                st.push(temp1);
                st.push(sum);
            }
            else{
                int val=Integer.parseInt(s);
                st.push(val);
                }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
/*
For D -> stack.peek() x 2 ... So then we will have twice the value of Last
For C -> stack.pop() ... Invalidate last Score
For + -> x=stack.pop() , y=stack.pop() , z=x+y ,then push y,x,z resp..
For x -> stack.push(Integer.parseInt(x)))
*/
     
