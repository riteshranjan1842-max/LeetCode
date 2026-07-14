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
    public void flatten(TreeNode root) {
        TreeNode curr = root;
         while(curr != null){
            if(curr.left != null){ // pred nikal sakta
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr) pred = pred.right;
                    pred.right = curr.right;
                    curr.right = curr.left;
                    curr.left = null;
            }
                curr = curr.right;
        }   
    }
} 

// Method 2
// public void flatten(TreeNode root) {
//         if(root==null) return;
//         TreeNode lst = root.left;
//         TreeNode rst = root.right;
//         root.left = null;
//         root.right = null;
//         flatten(lst);
//         flatten(rst);
//         root.right = lst;
//         TreeNode last = root;
//         while(last.right != null) last = last.right;
//         last.right = rst;
        
//     }


// Method 1
// public void flatten(TreeNode root) {
//         if(root==null) return;
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         dfs(root,arr);
//         int n = arr.size();
//         for(int i = 0; i<n-1; i++){
//             TreeNode temp = arr.get(i);
//             temp.left = null;
//             temp.right =  arr.get(i+1);
//         }
//         arr.get(n-1).right = null;
//     }
//     public void dfs(TreeNode root, ArrayList<TreeNode> arr){
//           if(root==null) return;
//           arr.add(root);
//           dfs(root.left,arr);
//           dfs(root.right,arr);
//     }