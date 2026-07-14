class Solution {
    static int maxSize;
    public int maxDepth(TreeNode root) {
       maxSize = 0;
       Depth(root);
       return maxSize;
    }
    public int Depth(TreeNode root) {
        if(root==null) return 0;
        int left = Depth(root.left);
        int right = Depth(root.right);
        int size = 1 + Math.max(left,right);
        maxSize = Math.max(maxSize,size);
        return size;
    }
}