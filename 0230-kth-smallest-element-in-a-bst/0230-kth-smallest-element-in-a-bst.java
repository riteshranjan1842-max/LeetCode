class Solution {
    static int k2;
    static int ans;
    public int kthSmallest(TreeNode root, int k) {
       k2 = k;
       ans = -1;
        inorder(root);
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans = root.val;
        inorder(root.right);
    }
}

// Method 1
// public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         inorder(root,ans);
//         return ans.get(k-1);
//     }
//     public void inorder(TreeNode root, ArrayList<Integer> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
//     }