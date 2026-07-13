class Pair{
    long max;
    long min;
    Pair(long max, long min){
        this.max = max;
        this.min = min;
    }
}
class Solution {
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        flag = true;
        maxMin(root);
        return flag;
    }
    Pair maxMin(TreeNode root){
        if(root==null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair lst = maxMin(root.left);
        Pair rst = maxMin(root.right);
        long val = (long)(root.val);
        long max = Math.max(val, Math.max(lst.max,rst.max));
        long min = Math.min(val, Math.min(lst.min,rst.min));
        if(root.val <= lst.max || root.val >= rst.min) flag = false;
        return new Pair(max, min);
    } 
}

// Method 1
// public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         inorder(root,ans);
//         int i = 0;
//         int j = i+1;
//         while(j<ans.size()){
//             if(ans.get(i)>=ans.get(j)) return false;
//             i++;
//             j = i+1;
//         }
//         return true;
//     }
//     public void inorder(TreeNode root, ArrayList<Integer> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
//     }