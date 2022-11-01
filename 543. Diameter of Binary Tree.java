class Solution {
    int dia;//initialiazing the globally
    public int diameterOfBinaryTree(TreeNode root) {
        dia=0;
        depth(root);
        return dia;
        
    }
    public int depth(TreeNode node){
        if(node==null) return 0;
        int L=depth(node.left);
        int R=depth(node.right);
        dia=Math.max(dia,L+R);
        return 1+Math.max(L,R);
    }
}
