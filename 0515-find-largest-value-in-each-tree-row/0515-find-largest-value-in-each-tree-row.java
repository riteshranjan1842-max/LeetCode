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
    public List<Integer> largestValues(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        int level = 0;
        while(q.size() > 0){
            int n = q.size();
           int max = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                TreeNode temp = q.remove();
                max = Math.max(temp.val,max);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ans.add(max);
            level++;  
        }
        return ans;
    }
}