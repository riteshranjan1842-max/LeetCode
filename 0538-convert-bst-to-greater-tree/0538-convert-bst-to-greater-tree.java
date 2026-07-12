class Solution {
    static int sum;
    public TreeNode convertBST(TreeNode root) {
         sum = 0;
         revInorder(root);
         return root;
    }
    public static void revInorder(TreeNode root){
        if(root==null) return;
        revInorder(root.right);
        int temp = root.val;
        root.val = sum+temp;
        sum += temp;
        revInorder(root.left);
    }
}