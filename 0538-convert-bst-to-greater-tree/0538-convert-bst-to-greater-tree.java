class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        revInorder(root,ans);
        int sum = 0;
        for(int i = 0; i<ans.size(); i++){
            int temp = ans.get(i).val;
            ans.get(i).val = sum+temp;
            sum +=temp;
        } 
         return root;
    }
    public static void revInorder(TreeNode root, ArrayList<TreeNode> ans){
        if(root==null) return;
        revInorder(root.right,ans);
        ans.add(root);
        revInorder(root.left,ans);
    }
}

// Method 1
// static int sum;
//     public TreeNode convertBST(TreeNode root) {
//          sum = 0;
//          revInorder(root);
//          return root;
//     }
//     public static void revInorder(TreeNode root){
//         if(root==null) return;
//         revInorder(root.right);
//         int temp = root.val;
//         root.val = sum+temp;
//         sum += temp;
//         revInorder(root.left);
//     }