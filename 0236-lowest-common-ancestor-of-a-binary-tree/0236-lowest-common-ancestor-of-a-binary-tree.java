/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(p==root || q==root) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q); 
        TreeNode right = lowestCommonAncestor(root.right,p,q);      
       if(left != null && right != null) return root;
        else return left != null? left : right;
    }
}

// Method 1      // O(n) h tc abhi v
//  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null) return root;
//         if(p.val==root.val || q.val==root.val) return root;
//         boolean pLeft = exists(root.left,p.val);
//         boolean qRight = exists(root.left,q.val);
//         if(pLeft && !qRight) return lowestCommonAncestor(root.left,p,q);
//         else if(!pLeft && qRight) return lowestCommonAncestor(root.right,p,q);
//         else return root;

//     }
//     public boolean exists(TreeNode root, int val){
//         if(root==null) return false;
//         if(root.val==val) return true;
//         return exists(root.left,val) || exists(root.right,val);
//     }