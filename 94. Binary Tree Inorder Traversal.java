class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    private void helper(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        helper(node.left,list);
        list.add(node.val);
        helper(node.right,list);
    }
}
