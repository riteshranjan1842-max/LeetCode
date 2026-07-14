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
    static int minSize;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
       minSize = Integer.MAX_VALUE;
       depth(root,1);
       return minSize;
    }
    public void depth(TreeNode root,int depth) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            minSize = Math.min(minSize,depth);
            return;
        }
        depth(root.left,depth+1);
        depth(root.right,depth+1);
    }
}