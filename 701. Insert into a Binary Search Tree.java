class Solution {
    public TreeNode insertIntoBST(TreeNode root, int key) {
         if(root==null) 
         return root=new TreeNode(key);
        
        if(root.val<key){
            root.right=insertIntoBST(root.right,key);
        }
        else if(root.val>key){
            root.left=insertIntoBST(root.left,key);
        }
        // your code here
        return root;
    }
}
