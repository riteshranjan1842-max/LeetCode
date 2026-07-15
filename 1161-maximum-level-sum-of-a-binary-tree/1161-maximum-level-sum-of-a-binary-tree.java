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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        q.add(root);
        int level = 0;
        int ansLevel = 0;
        while(q.size() > 0){
            int n = q.size();
            long sum = 0;
            for(int i = 0; i<n; i++){
                TreeNode temp = q.remove();
                sum += temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            if((int)sum>maxSum){
                maxSum = (int)sum;
                ansLevel = level;
            }
            level++;  
        }
        return ansLevel+1;
    }
}