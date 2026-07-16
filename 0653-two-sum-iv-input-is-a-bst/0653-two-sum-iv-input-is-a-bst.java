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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int left = 0;
        int right = ans.size()-1;
        if(left==right){
            return false;
        }
        while(left<right){
            if(ans.get(left) + ans.get(right) > k) right--;
            else if(ans.get(left) + ans.get(right) < k) left++;
            else return true;
        }
        if(left != right && ans.get(left) + ans.get(right) == k)return true;
        else return false;
    }
    public void inorder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}