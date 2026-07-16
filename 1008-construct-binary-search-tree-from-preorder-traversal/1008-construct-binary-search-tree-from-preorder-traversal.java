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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] inorder = new int[n];
        int i = 0;
        for(int ele : preorder) inorder[i++] = ele;
        Arrays.sort(inorder);
        return helper(0, n-1,0,n-1,inorder, preorder);
    }
    public TreeNode helper(int preLo,int preHi, int inLo, int inHi, int[] inorder, int[] preorder){
         if(preLo>preHi || inLo>inHi) return null;
         int val = preorder[preLo];
         TreeNode root = new TreeNode(val);
         int r = 0;
         for(int i = inLo; i<=inHi; i++){
            if(inorder[i]==val){
                r = i; break;
            }
         }
         int cnt = r-inLo;
         root.left = helper(preLo+1, preLo+cnt, inLo, r-1, inorder,preorder);
         root.right = helper(preLo+cnt+1, preHi, r+1, inHi, inorder,preorder);
         return root;
    }
}