/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum;
    public TreeNode bstToGst(TreeNode root) {
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