class Quad{
    int max;
    int min;
    int sum;
    boolean isBST;
    Quad(int max, int min,int sum, boolean isBST){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;
    }
    static Quad helper(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        Quad lst = helper(root.left);
        Quad rst = helper(root.right);
        int max = Math.max(root.val, Math.max(lst.max,rst.max));
        int min = Math.min(root.val, Math.min(lst.min,rst.min));
        int sum = root.val + lst.sum + rst.sum;
        boolean isBST = (lst.isBST && rst.isBST && root.val > lst.max && root.val < rst.min) ? true : false;
        if(isBST) maxSum = Math.max(maxSum, sum);
        return new Quad(max, min, sum, isBST);
    }
}