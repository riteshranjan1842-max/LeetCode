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
    // Method 2 : BFS
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<TreeNode>> ans = new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            List<TreeNode> arr = new ArrayList<>();
            while(n>0){
                TreeNode temp = q.remove();
                arr.add(temp);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                n--;
            }
            ans.add(arr);
        }
        for(int i = 0; i<ans.size(); i++){
            List<TreeNode> arr = ans.get(i);
            if(i%2==1){
                int l = 0;
                int r = arr.size()-1;
                while(l < r){
                    TreeNode left = arr.get(l);
                    TreeNode right =arr.get(r);
                   int temp = left.val;
                   left.val = right.val;
                   right.val = temp;
                   l++;
                   r--;
                }
            }
        }
        return root;
    }
}

// Method 1 : DFS
// public TreeNode reverseOddLevels(TreeNode root) {
//         helper(root.left, root.right, 1);
//         return root;
//     }
//     public void helper(TreeNode root1, TreeNode root2, int level){
//         if(root1==null || root2==null) return;
//         if(level%2 != 0){
//             int temp = root1.val;
//             root1.val = root2.val;
//             root2.val = temp;
//         }
//         helper(root1.left,root2.right, level+1);
//         helper(root1.right,root2.left, level+1);
//     }