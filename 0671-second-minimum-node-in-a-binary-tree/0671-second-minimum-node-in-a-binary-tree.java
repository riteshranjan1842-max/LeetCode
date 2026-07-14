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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        Collections.sort(ans);
        int temp = -1;
        for(int i = 1; i<ans.size(); i++){
            if(ans.get(i)>ans.get(i-1)){
                temp = ans.get(i);
                 break;
            }
        }
        return temp;
    }
    public void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}