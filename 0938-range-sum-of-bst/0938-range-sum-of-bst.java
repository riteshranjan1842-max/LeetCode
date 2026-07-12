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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int right = rangeSumBST(root.right, low, high);
        int left =  rangeSumBST(root.left, low, high);
        if(root.val < low) return right;
        else if(root.val > high) return left;
        else{
            return root.val + right + left;
        }
    }
}