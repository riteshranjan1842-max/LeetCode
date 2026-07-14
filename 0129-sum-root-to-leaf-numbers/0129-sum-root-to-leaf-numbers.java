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
    static int total;
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        total = 0;
        pathSum(root,ans);
        return total;
    }
    public void pathSum(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        if(root.left==null && root.right==null){
            total += sum(ans);
        }
        pathSum(root.left,ans);
        pathSum(root.right,ans);
        ans.remove(ans.size()-1);
    }
    public int sum(ArrayList<Integer> ans){
        int sum = 0;
        for(int i = 0; i<ans.size(); i++) sum = sum*10 + ans.get(i);
        return sum;
    }
}