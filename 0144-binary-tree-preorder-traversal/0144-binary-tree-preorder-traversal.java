class Solution {
    List<Integer> list = new ArrayList<>();

    private void preOrder(TreeNode root){
        if(root == null) return;

        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }
        preOrder(root);

        return list;
    }
} 