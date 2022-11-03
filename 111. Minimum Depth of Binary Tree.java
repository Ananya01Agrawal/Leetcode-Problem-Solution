class Solution {
    int minVal=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        return helper(root);
        
    }
    protected int helper(TreeNode curr){
        if(curr==null) return 0;
        int left=helper(curr.left);
        int right=helper(curr.right);
        return (left==0||right==0)?left+right+1:
            Math.min(left,right)+1;
    }
}
