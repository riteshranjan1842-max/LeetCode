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

class Pair{
    int sum;
    int size;
    Pair(int sum, int size){
        this.sum = sum;
        this.size = size;
    }
}
class Solution {
    int count;
    public int averageOfSubtree(TreeNode root) {
       count = 0;
       average(root);
       return count;
    }
    
    public Pair average(TreeNode root){
        if(root==null) return new Pair(0,0); 
        Pair lst = average(root.left);
        Pair rst = average(root.right);
        int sum = root.val + lst.sum + rst.sum;
        int size = 1 + lst.size + rst.size;
        if((sum/size)==root.val) count++;
        return new Pair(sum, size);
    }
}