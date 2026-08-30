class Solution {
    boolean result = true;

    private int balanced(TreeNode root){
        if(root == null) return 0;

        int leftHeight = balanced(root.left);
        int rightHeight = balanced(root.right);

        if(Math.abs(leftHeight - rightHeight)>1){
            result = false;
        }
        return 1+ Math.max(leftHeight,rightHeight);
    }

    public boolean isBalanced(TreeNode root) {
 
        if(root == null) return result;

        balanced(root);
        return result;
    }
}