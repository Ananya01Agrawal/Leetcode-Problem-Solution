class Solution {
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list=new LinkedList<Integer>();
        Stack<TreeNode> rights=new Stack<TreeNode>();
        while(node!=null){
            list.add(node.val);
            if(node.right!=null){
                rights.push(node.right);
            }
            if(node.left==null &&!rights.isEmpty()){
                node=rights.pop();
            }else{
                node=node.left;
            }
        }
        return list;
    }
}
